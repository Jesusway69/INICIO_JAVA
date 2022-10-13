package mysql_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Probando3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/probando";
        String usuario = "root";
        String clave = "12345678";
        String query = "ALTER TABLE Alumno ADD casado BIT";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
        }
    }

}
