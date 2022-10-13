package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pregunta21 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ventaproductos";
        String usuario = "root";
        String clave = "12345678";

        String query1 = "INSERT INTO Proveedor(nombre,nif,direccion) VALUES(?, ?, ?);";
        String query2 = "SELECT * FROM Proveedor";
        String query3 = "ALTER TABLE Proveedor ADD UNIQUE (nif)";
        String query4 = "DELETE FROM Proveedor";
        String query5 = "ALTER TABLE Proveedor AUTO_INCREMENT = 1";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = null;

            ps = conexion.prepareStatement(query4);
            ps.executeUpdate();

            ps = conexion.prepareStatement(query5);
            ps.executeUpdate();

            ps = conexion.prepareStatement(query1);
            ps.setString(1, "Miguel_1");
            ps.setString(2, "32226940G");
            ps.setString(3, "Direccion 12");
            ps.executeUpdate();

            ps = conexion.prepareStatement(query3);
            ps.executeUpdate();

            ps = conexion.prepareStatement(query1);
            ps.setString(1, "Miguel_2");
            ps.setString(2, "32223989G");
            ps.setString(3, "Direccion 12");
            ps.executeUpdate();

            ps = conexion.prepareStatement(query2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idProveedor = rs.getInt("idProveedor"); //1
                String nombre = rs.getString("nombre");
                String nif = rs.getString("nif");
                String direccion = rs.getString("direccion");
                System.out.println(idProveedor + "\t" + nombre + "\t" + nif + "\t" + direccion);
            }

            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
        }
        System.out.println("CONTINUA CON EL PROGRAMA");
    }

}
