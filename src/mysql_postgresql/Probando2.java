package mysql_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Probando2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/probando";
        String usuario = "root";
        String clave = "12345678";
        String query = "DESCRIBE Alumno";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombreCampo = rs.getString(1);
                String tipoCampo = rs.getString(2);
                String nulo = rs.getString(3);
                String key = rs.getString(4);
                String pordefecto = rs.getString(5);
                String extra = rs.getString(5);
                System.out.println(nombreCampo + "\t" + tipoCampo + "\t" + nulo + "\t" + key + "\t" + pordefecto + "\t" + extra );
            }
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
