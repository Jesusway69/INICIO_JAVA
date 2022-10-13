package mysql_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world_x";//Protocolo,Nombre Servidor,Puerto,Nombre Base Datos
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "12345678");
            String query = "SELECT doc->'$.geography.Region' AS REGION, COUNT(doc->'$.geography.Region') AS CANTIDAD_PAISES FROM countryinfo GROUP BY doc->'$.geography.Region' ORDER BY CANTIDAD_PAISES";            
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-30s  %-30s\n", "REGION", "Nº PAISES");
            System.out.printf("%-30s  %-30s\n", "------", "---------");
            while (rs.next()) {
                //String columna1 = rs.getString(1);
                //int columna2 = rs.getInt(2);
                String columna1 = rs.getString("REGION");
                int columna2 = rs.getInt("CANTIDAD_PAISES");
                String limpiarc1 = columna1.substring(1, columna1.length() - 1);
                System.out.printf("%-30s  %-30d\n", limpiarc1, columna2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
