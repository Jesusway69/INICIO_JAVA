package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal4 {

    public static void main(String[] args) {
        File f = new File("datos/probando.db");//Ruta Relativa
        String ra = f.getAbsolutePath();
        System.out.println(ra);
        String url = "jdbc:sqlite" + ":" + ra;   //PROTOCOLO - NOMBRE BASE DATOS
        try {
            Connection conexion = DriverManager.getConnection(url);
            String query = "ALTER TABLE Gestante RENAME TO Consulta;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
