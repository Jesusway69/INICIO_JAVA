package mysql_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostgresqlSelect {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/probando";
        String usuario = "postgres";
        String clave = "12345678";
        String query = "SELECT * FROM Alumno";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idAlumno = rs.getString(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                double estatura = rs.getDouble(4);
                boolean escasado = rs.getBoolean(5);
                System.out.println(idAlumno + "\t" + nombre + "\t" + edad + "\t" + estatura + "\t" + escasado);
            }
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
