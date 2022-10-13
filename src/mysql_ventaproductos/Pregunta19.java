package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Pregunta19 {

    public static void main(String[] args) {//127.0.0.1
        String url = "jdbc:mysql://localhost:3306/ventaproductosDFASDF";//protocolo-nombre servidor-puerto-nombre base de datos
        String usuario = "root";
        String clave = "12345678";
        String query1 = "SELECT * FROM Cliente WHERE nombre LIKE 'm%' OR nombre LIKE 's%'";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();
            
            int totalRegistros = 0;
            while (rs.next()) {
                totalRegistros++;
            }
            
            if (totalRegistros > 0) {
                rs = ps.executeQuery();
                System.out.printf("%10s  %-10s  %-20s  %-10s  %-10s  %-12s\n", "IDCLIENTE", "NOMBRE", "APELLIDOS", "DNI", "DIRECCION", "NACIMIENTO");
                System.out.printf("%10s  %-10s  %-20s  %-10s  %-10s  %-12s\n", "---------", "------", "---------", "---", "---------", "----------");
                while (rs.next()) {
                    int idCliente = rs.getInt(1);
                    String nombre = rs.getString(2);
                    String apellidos = rs.getString(3);
                    String dni = rs.getString(4);
                    String direccion = rs.getString(5);
                    Date fecha_nacimiento = rs.getDate(6);
                    System.out.printf("%10d  %-10s  %-20s  %-10s  %-10s  %-12s\n", idCliente, nombre, apellidos, dni, direccion, fecha_nacimiento);
                }
            } else {
                System.out.println("NO HAY REGISTRO QUE CUMPLAN LA CONSULTA");
            }

        } catch (SQLException e) { //Exception
          System.out.println("ERROR: " + e);
        }

    }

}
