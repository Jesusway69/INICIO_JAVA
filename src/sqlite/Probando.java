package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Probando {

    public static void main(String[] args) {
        File f = new File("datos/probando.db");//Ruta Relativa
        String ra = f.getAbsolutePath();
        System.out.println(ra);
        String url = "jdbc:sqlite" + ":" + ra;   //PROTOCOLO - NOMBRE BASE DATOS
        String usuario = "walter1";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url,usuario,clave);
            String query = "DELETE FROM Gestante WHERE numeroConsulta = 3";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
