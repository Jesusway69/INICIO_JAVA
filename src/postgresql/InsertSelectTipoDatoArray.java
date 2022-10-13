package postgresql;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertSelectTipoDatoArray {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5433/campusfp";
        String usuario = "postgres";
        String clave = "12345678";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = null;
            ResultSet rs = null;
            //(1)
            String query1 = "DROP TABLE IF EXISTS Vendedor";
            ps = conexion.prepareStatement(query1);
            ps.execute();
            System.out.println("OK: DROP TABLE");

            //(2)
            String query2 = "CREATE TABLE Vendedor (\n"
                    + "    idVendedor     INT,\n"
                    + "    nombre         VARCHAR(10),\n"
                    + "    departamentos  TEXT[],\n"
                    + "                   PRIMARY KEY (idVendedor)\n"
                    + ")";
            ps = conexion.prepareStatement(query2);
            ps.execute();
            System.out.println("OK: CREATE TABLE");

            //(3)
            String query3 = "INSERT INTO Vendedor VALUES(1,'Luis','{Contabilidad,Secretaria}')";
            ps = conexion.prepareStatement(query3);
            ps.executeUpdate();
            System.out.println("OK: INSERT INTO");

            //(3.1)
            String[] registros = {
                "INSERT INTO Vendedor VALUES(2,'Miguel','{Venta}')",
                "INSERT INTO Vendedor VALUES(3,'Carlos','{Almacen,Venta}')",
                "INSERT INTO Vendedor VALUES(4,'María','{Secretaria,Contabilidad,Atención}')",
                "INSERT INTO Vendedor VALUES(5,'Carmen','{Contabilidad,Secretaria}')"
            };
            for (int i = 0; i < registros.length; i++) {
                String query31 = registros[i];
                ps = conexion.prepareStatement(query31);
                ps.executeUpdate();
            }
            System.out.println("OK: INSERT INTO MUCHOS");

            //(4)
            String query4 = "SELECT * FROM Vendedor";
            ps = conexion.prepareStatement(query4);
            rs = ps.executeQuery();
            System.out.printf("%s\t\t%s\t\t%s\n", "ID VENDEDOR", "NOMBRE", "DEPARTAMENTOS");
            System.out.printf("%s\t\t%s\t\t%s\n", "-----------", "------", "-------------");
            while (rs.next()) {
                //Array arrayDepartamentos = rs.getArray(3);
                System.out.printf("%d\t\t%s\t\t%s\n", rs.getInt(1), rs.getString(2), rs.getArray(3));
            }
            System.out.println("OK: SELECT");

            //(5) MOSTRAR SOLO LOS VENDEDORES QUE TRABAJEN DE SECRETARIA
            String query5 = "SELECT * FROM Vendedor";
            ps = conexion.prepareStatement(query5);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idVendedor = rs.getInt(1);
                String nombre = rs.getString(2);
                Array arrayDepartamentos = rs.getArray(3);//Tipo Postgresql
                String[] departamentos = (String[]) arrayDepartamentos.getArray();
                for (int i = 0; i < departamentos.length; i++) {
                    String d = departamentos[i];
                    if (d.equalsIgnoreCase("Secretaria")) {
                        System.out.printf("%d\t%s\t%s\n", idVendedor, nombre, arrayDepartamentos);
                    }
                }
            }
            System.out.println("OK: SELECT");

        } catch (SQLException ex) {
            System.out.println("ERROR: CONEXION");
        }

    }

}

/*
DROP TABLE IF EXISTS Vendedor;

CREATE TABLE Vendedor (
    idVendedor     INT,
    nombre         VARCHAR(10),
    departamentos  TEXT[],
                   PRIMARY KEY (idVendedor)
);

INSERT INTO Vendedor VALUES(1,'Luis','{Contabilidad,Secretaria}');

SELECT * FROM Vendedor;

SELECT idVendedor, nombre, departamentos[3] FROM Vendedor;
 */
