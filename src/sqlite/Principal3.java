package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal3 {

    public static void main(String[] args) {
        PreparedStatement ps = null;
        File f = new File("datos/probando.db");//Ruta Relativa
        String ra = f.getAbsolutePath();
        System.out.println(ra);
        String url = "jdbc:sqlite" + ":" + ra;   //PROTOCOLO - NOMBRE BASE DATOS
        try {
            Connection conexion = DriverManager.getConnection(url);
            String query1 = "INSERT INTO Consulta (numeroConsulta,fecha,nombreMedico,deinpr,procedencia) VALUES ('8744','2002-07-26','Walter','INDUCCION','URGENCIA')";
            ps = conexion.prepareStatement(query1);
            ps.executeUpdate();
            String query2 = "INSERT INTO Consulta (numeroConsulta,fecha,nombreMedico,deinpr,procedencia) VALUES (?,?,?,?,?);";    
            ps = conexion.prepareStatement(query2);
            ps.setString(1, "8747");
            ps.setString(2, "2022-07-01");
            ps.setString(3, "Arturo");
            ps.setString(4, "CESAREA");
            ps.setString(5, "URGENCIA");
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
