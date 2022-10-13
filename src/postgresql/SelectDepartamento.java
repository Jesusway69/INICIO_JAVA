package postgresql;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectDepartamento {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5433/campusfp";
        String usuario = "postgres";
        String clave = "12345678";
        Scanner sc = new Scanner(System.in);
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.print("Ingrese el departamento?");
            String departamento = sc.next();
            
            String query = "SELECT * FROM Vendedor";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
               int idVendedor = rs.getInt(1);
               String nombre = rs.getString(2);
               Array arrayDepartamentos = rs.getArray(3);
               String[] departamentos = (String[])arrayDepartamentos.getArray();
               for(String d: departamentos) {
                   if(d.equalsIgnoreCase(departamento)) {
                       System.out.printf("%d\t%s\t%s\n",idVendedor,nombre,arrayDepartamentos);
                   }
               }
               
            }
            
            
            
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION");
        }
    }

}
