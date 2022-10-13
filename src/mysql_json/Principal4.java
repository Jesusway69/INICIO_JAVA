package mysql_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal4 {//MOSTRAR EL NUMERO DE CIUDADES DE UN PAIS QUE SERA INGRESADO POR TECLADO

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/world_x";//Protocolo,Nombre Servidor,Puerto,Nombre Base Datos
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "12345678");
            String query1 = "SELECT (SELECT Name FROM country WHERE Name = ?) AS PAIS, Count(Name) AS NUMERO_CIUDADES FROM city WHERE CountryCode = (SELECT SUBSTRING(doc->'$.Code',2,3) FROM countryinfo WHERE doc->'$.Name' = ?)";
            String query2 = "SELECT Name\n" +
                            "FROM country\n" +
                            "ORDER BY Name;";
            
            ps = conexion.prepareStatement(query2);
            rs = ps.executeQuery();
            while (rs.next()) {
                String pais = rs.getString("Name"); 
                System.out.println(pais);
            }
            System.out.println();
            System.out.println("INGRESE EL NOMBRE DEL PAIS PARA OBTENER CANTIDAD DE CIUDADES? ");
            String pais = sc.next();
            ps = conexion.prepareStatement(query1);
            ps.setString(1, pais);
            ps.setString(2, pais);
            rs = ps.executeQuery();
            System.out.printf("%-30s  %-30s\n", "PAIS", "Nº CIUDADES");
            System.out.printf("%-30s  %-30s\n", "----", "-----------");
            while (rs.next()) {
                //String columna1 = rs.getString(1);
                //int columna2 = rs.getInt(2);
                String columna1 = rs.getString("PAIS");
                int columna2 = rs.getInt("NUMERO_CIUDADES");
                if (columna1 != null) {
                    System.out.printf("%-30s  %-30d\n", columna1, columna2);
                }else {
                    System.out.println("PAIS NO EXISTE O NO ESTA ESCRITO CORRECTAMENTE");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
