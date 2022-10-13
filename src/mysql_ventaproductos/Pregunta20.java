package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pregunta20 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ventaproductos1";
        String usuario = "root";
        String clave = "12345678";
        
        String query = "INSERT INTO Proveedor(nombre,nif,direccion) VALUES(?, ?, ?);";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, "Luis");
            ps.setString(2, "39392949G");
            ps.setString(3, "Direccion 11");
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
        }
        System.out.println("CONTINUA CON EL PROGRAMA");

    }

}
