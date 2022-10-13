package ejercicios_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pregunta4 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tiendarabanal";
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            String query = "INSERT INTO Detalle VALUES(1500,2,'goma',0.5,100)";
                    //+ "INSERT INTO Detalle VALUES(1500,1,'regla',1.5,40);\n"
                   // + "INSERT INTO Detalle VALUES(1500,2,'goma',0.5,100);";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
