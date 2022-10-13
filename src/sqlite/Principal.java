package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        //"C:/Users/RYZEN/Documents/NetBeansProjects/INICIOJAVA/datos/probando.db"
        //"C:/sqlite3/probando.db"
        File f = new File("datos/probando.db");//Ruta Relativa
        String ra = f.getAbsolutePath();
        System.out.println(ra);
        String url = "jdbc:sqlite" + ":" + "C:/sqlite3/probando.db";   //PROTOCOLO - NOMBRE BASE DATOS
        try {
            Connection conexion = DriverManager.getConnection(url);
            String query = "SELECT DISTINCT nombreMedico FROM Consulta";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            int c = 1;
            while(rs.next()) {
                System.out.println("("  +  (c++) + ")"+rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
