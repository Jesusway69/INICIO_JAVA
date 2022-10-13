package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal1 {

    public static void main(String[] args) {
        File f = new File("datos/probando.db");//Ruta Relativa
        String ra = f.getAbsolutePath();
        System.out.println(ra);
        String url = "jdbc:sqlite" + ":" + ra;   //PROTOCOLO - NOMBRE BASE DATOS
        try {
            Connection conexion = DriverManager.getConnection(url);
            String query = "DELETE FROM Consulta WHERE nombreMedico = 'ANA DURAN VILA'";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println("ERROR");
        }

    }

}


//DELETE FROM Consulta WHERE nombreMedico = 'ANA DURAN VILA';
