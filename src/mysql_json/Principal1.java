package mysql_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world_x";//Protocolo,Nombre Servidor,Puerto,Nombre Base Datos
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "12345678");
            String query = "SELECT doc->'$.Name' AS PAIS, doc->'$.government.GovernmentForm' AS GOBIERNO FROM countryinfo WHERE doc->'$.Name' LIKE '_P%'";      
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-20s  %-20s\n","PAIS","GOBIERNO");
            System.out.printf("%-20s  %-20s\n","----","--------");
            while (rs.next()) {
                String columna1 = rs.getString(1);
                String columna2 = rs.getString(2);
                String limpiarc1 = columna1.substring(1, columna1.length() - 1);
                String limpiarc2 = columna2.substring(1, columna2.length() - 1);
                System.out.printf("%-20s  %-20s\n",limpiarc1,limpiarc2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}






