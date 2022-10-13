package postgresql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Antes2001 {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/universidad";//PROTCOLO NAMESERVER PUERTO NOMBREBASEDATOS
        try {
            Connection conexion = DriverManager.getConnection(url, "postgres", "12345678");
            String query = "SELECT * FROM Alumno";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-10s  %-10s  %-20s  %-10s  %-10s\n", "ID ALUMNO", "NOMBRE", "APELLIDO", "GRUPO", "NACIMIENTO");
            System.out.printf("%-10s  %-10s  %-20s  %-10s  %-10s\n", "---------", "------", "--------", "-----", "----------");
            while (rs.next()) {
                int idAlumno = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String grupo = rs.getString(4);
                Date nacimiento = rs.getDate(5);
                String x = nacimiento.toString();//2000-05-01
                String[] z = x.split("-");
                int anio = Integer.parseInt(z[0]);
                if(anio<2001) {
                   System.out.printf("%10d  %-10s  %-20s  %-10s  %-10s\n", idAlumno, nombre, apellido, grupo, getFechaConFormato(x));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getFechaConFormato(String fechaEntrada) {//2022-07-28 ---> 28/07/2022
        SimpleDateFormat sdE = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdS = new SimpleDateFormat("dd-MM-yyyy");
        String fechaSalida = "";
        java.util.Date p = null;
        try {
            p = sdE.parse(fechaEntrada);
            long milis_fe = p.getTime();
            fechaSalida = sdS.format(milis_fe);
        } catch (ParseException ex) {
            Logger.getLogger(SelectFormatoFecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaSalida;

    }
}
