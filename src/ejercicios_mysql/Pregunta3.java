package ejercicios_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pregunta3 {

    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/tiendarabanal";
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            String query = "UPDATE Detalle SET cantidad = ? WHERE numeroFactura = ? AND numeroitem = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1,102);
            ps.setInt(2,1200);
            ps.setInt(3,1);
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
