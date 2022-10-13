package mysql_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Probando1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/probando";
        String usuario = "root";
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
                boolean casado = rs.getBoolean(5);
                System.out.println(idAlumno + "\t" + nombre + "\t" + edad + "\t" + estatura + "\t" + casado);
            }
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
