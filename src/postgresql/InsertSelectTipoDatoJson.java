package postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertSelectTipoDatoJson {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/campusfp";
        String usuario = "postgres";
        String clave = "12345678";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);

            //(1)
            String query1 = "DROP TABLE IF EXISTS Venta";
            ps = conexion.prepareStatement(query1);
            ps.execute();
            System.out.println("OK: DROP TABLE");

            //(2)
            String query2 = "CREATE TABLE Venta (\n"
                    + "    idVenta         INT,\n"
                    + "    nombreVendedor  VARCHAR(20),\n"
                    + "    documento       JSON,\n"
                    + "                    PRIMARY KEY (idVenta)\n"
                    + ")";
            ps = conexion.prepareStatement(query2);
            ps.execute();
            System.out.println("OK: CREATE TABLE");

            //(3)
            String[] registros = {
                "INSERT INTO Venta VALUES(1,'Luis','{\"idProducto\":\"P1\", \"producto\":\"Lapiz\", \"venta\":3000}')",
                "INSERT INTO Venta VALUES(2,'Miguel','{\"idProducto\":\"P2\", \"producto\":\"Regla\", \"venta\":5000}')",
                "INSERT INTO Venta VALUES(3,'Carlos','{\"idProducto\":\"P3\", \"producto\":\"Borrador\", \"venta\":7000}')"
            };
            for (String query3 : registros) {
                ps = conexion.prepareStatement(query3);
                ps.executeUpdate();
            }
            System.out.println("OK: INSERT INTO TABLE");

            //(4)
            String query4 = "SELECT * FROM Venta";
            ps = conexion.prepareStatement(query4);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idVenta = rs.getInt(1);
                String nombre = rs.getString(2);
                String documento = rs.getString(3);
                System.out.printf("%d\t%s\t%s\n", idVenta, nombre, documento);
            }
            System.out.println("OK: SELECT TABLE");

            //(5) MOSTRAR TODOS LOS VENDEDORES CON EL MONTO DE VENTA
            String query5 = "SELECT idVenta, nombreVendedor, documento->'venta' AS VENTA FROM Venta;";
            ps = conexion.prepareStatement(query5);
            rs = ps.executeQuery();
            int ventaTotal = 0;
            while (rs.next()) {
                int idVenta = rs.getInt(1);
                String nombre = rs.getString(2);
                int montoVenta = rs.getInt(3);
                System.out.printf("%d\t%s\t%d\n", idVenta, nombre, montoVenta);
                ventaTotal = ventaTotal + montoVenta;
            }
            System.out.println("Total Venta Vendedores: " + ventaTotal);
            System.out.println("OK: SELECT TABLE");
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION");
        }
    }

}

/*
DROP TABLE IF EXISTS Venta;

CREATE TABLE Venta (
    idVenta         INT,
    nombreVendedor  VARCHAR(20),
    documento       JSON,
                    PRIMARY KEY (idVenta)
);

INSERT INTO Venta VALUES(1,'Luis','{"idProducto":"P1", "producto":"Lapiz", "venta":3000}');
INSERT INTO Venta VALUES(2,'Miguel','{"idProducto":"P2", "producto":"Regla", "venta":5000}');
INSERT INTO Venta VALUES(3,'Carlos','{"idProducto":"P3", "producto":"Borrador", "venta":7000}');

SELECT * FROM Venta;

SELECT idVenta, nombreVendedor, documento->'venta' AS VENTA FROM Venta;
 */
