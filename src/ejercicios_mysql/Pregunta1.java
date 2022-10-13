package ejercicios_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pregunta1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tiendarabanal";
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            String query = "SELECT numeroFactura, SUM(precio*cantidad) AS MONTO\n"
                    + "FROM Detalle\n"
                    + "GROUP BY numeroFactura\n"
                    + "HAVING MONTO = (SELECT SUM(precio*cantidad) AS MONTO\n"
                    + "FROM Detalle\n"
                    + "GROUP BY numeroFactura\n"
                    + "ORDER BY MONTO DESC\n"
                    + "LIMIT 1)";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%s\t%s\n","NUMERO FACTURA","MONTO");
            while(rs.next()) {
                int numeroFactura = rs.getInt(1);
                double monto = rs.getDouble(2);
                System.out.printf("%d\t%10.2f\n",numeroFactura,monto);
            }
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }

}
