package postgresql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Select {

    public static void main(String[] args) {
       String url = "jdbc:postgresql://localhost:5433/universidad";//PROTCOLO NAMESERVER PUERTO NOMBREBASEDATOS
        try {
            Connection conexion = DriverManager.getConnection(url,"postgres","12345678");
            String query = "SELECT * FROM Alumno";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-10s  %-10s  %-20s  %-10s  %-10s\n","ID ALUMNO", "NOMBRE", "APELLIDO", "GRUPO", "NACIMIENTO");
            System.out.printf("%-10s  %-10s  %-20s  %-10s  %-10s\n","---------", "------", "--------", "-----", "----------");
            while(rs.next()) {
                int idAlumno = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String grupo = rs.getString(4);
                Date nacimiento = rs.getDate(5);
                System.out.printf("%10d  %-10s  %-20s  %-10s  %-10s\n",idAlumno,nombre,apellido,grupo,nacimiento);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
