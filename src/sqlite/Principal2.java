package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal2 {

    public static void main(String[] args) {
        File f = new File("datos/probando.db");//Ruta Relativa
        String ra = f.getAbsolutePath();
        System.out.println(ra);
        String url = "jdbc:sqlite" + ":" + ra;   //PROTOCOLO - NOMBRE BASE DATOS
        try {
            Connection conexion = DriverManager.getConnection(url);
            String query = "UPDATE Consulta SET nombreMedico = ? WHERE nombreMedico = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, "MARIA CARMEN VIÑUELA BENITEZ");//NUEVO
            ps.setString(2, "MARIA CARMEN VIÑUELA BENEITEZ");//VIEJO
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
