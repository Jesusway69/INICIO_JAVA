package sqlite_bd_triangulo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesCrud {

    static Connection conexion = obtenerConexion();

    public static Connection obtenerConexion() {
        File file = new File("datos/triangulo.db");//Ruta Relativa
        String ra = file.getAbsolutePath();//Ruta Absoluta 
        System.out.println(ra);

        String url = "jdbc:sqlite:" + ra;

        try {
            Connection conexion = DriverManager.getConnection(url);
            return conexion;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static boolean insertar(Triangulo triangulo) {
        boolean bandera = true;
        String query = "INSERT INTO triangulo(cateto1,cateto2) VALUES(?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setDouble(1, triangulo.getCateto1());
            ps.setDouble(2, triangulo.getCateto2());
            ps.executeUpdate();
        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean mostrar() {
        boolean bandera = true;
        String query = "SELECT * FROM Triangulo";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Triangulo.cabecera();
            while (rs.next()) {
                int idTriangulo = rs.getInt(1);
                double cateto1 = rs.getDouble(2);
                double cateto2 = rs.getDouble(3);
                Triangulo t = new Triangulo(idTriangulo, cateto1, cateto2);
                t.cuerpo();
            }

        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }
}
