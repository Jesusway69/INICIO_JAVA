package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pregunta23 {

    public static void main(String[] args) {
        Connection conexion = obtenerConexion();
        String query1 = "ALTER TABLE Proveedor ADD escasado BOOLEAN NOT NULL";
        String query2 = "DESCRIBE Proveedor";
        String query3 = "UPDATE Proveedor SET escasado = ? WHERE idProveedor = ?";
        String query4 = "SELECT * FROM Proveedor";
        String query5 = "ALTER TABLE Proveedor DROP COLUMN escasado";
        PreparedStatement ps = null;
        if (conexion != null) {
            try {
                ps = conexion.prepareStatement(query5);
                ps.executeUpdate();

                ps = conexion.prepareStatement(query1);
                ps.executeUpdate();

                ps = conexion.prepareStatement(query2);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%-13s  %-13s  %-10s  %-10s  %-10s  %-20s\n", "FIELD", "TYPE", "NULL", "KEY", "DEFAULT", "EXTRA");
                System.out.printf("%-13s  %-13s  %-10s  %-10s  %-10s  %-20s\n", "-----", "----", "----", "---", "-------", "-----");
                while (rs.next()) {
                    String campo = rs.getString(1);
                    String tipo = rs.getString(2);
                    String nulo = rs.getString(3);
                    String clave = rs.getString(4);
                    String pordefecto = rs.getString(5);
                    String extra = rs.getString(6);
                    System.out.printf("%-13s  %-13s  %-10s  %-10s  %-10s  %-20s\n", campo, tipo, nulo, clave, pordefecto, extra);
                }

                ps = conexion.prepareStatement(query3);
                ps.setBoolean(1, true);
                ps.setInt(2, 5);
                ps.executeUpdate();

                ps = conexion.prepareStatement(query3);
                ps.setBoolean(1, false);
                ps.setInt(2, 6);
                ps.executeUpdate();
                
                System.out.println("\n");

                ps = conexion.prepareStatement(query4);
                ResultSet rs1 = ps.executeQuery();
                System.out.printf("%12s  %-10s  %-12s  %-12s  %-10s\n", "IDPROVEEDOR","NOMBRE","NIF","DIRECCION","ESCASADO");
                System.out.printf("%12s  %-10s  %-12s  %-12s  %-10s\n", "-----------","------","---","---------","--------");
                while (rs1.next()) {
                    int idProveedor = rs1.getInt("idProveedor"); //1
                    String nombre = rs1.getString("nombre");//2
                    String nif = rs1.getString("nif");//3
                    String direccion = rs1.getString("direccion");//4
                    boolean escasado = rs1.getBoolean("escasado");//5
                    System.out.printf("%12d  %-10s  %-12s  %-12s  %-10s\n", idProveedor, nombre, nif, direccion, escasado);
                }

            } catch (SQLException e) {
                System.out.println("ERROR: " + e);
            }

        } else {
            System.out.println("ERROR EN LA CONEXION");
        }

    }

    public static Connection obtenerConexion() {
        String url = "jdbc:mysql://localhost:3306/ventaproductos";
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            return conexion;
        } catch (SQLException ex) {
            return null;
        }
    }

}
