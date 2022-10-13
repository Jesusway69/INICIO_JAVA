package mysql_ventaproductos;

import java.sql.*;
import java.util.Scanner;

public class Programa22 {

    public static void main(String[] args) {
        String query1 = "SELECT * FROM Proveedor WHERE nif = ?";
        String query2 = "INSERT INTO Proveedor(nombre,nif,direccion) VALUES('nombre',?,'direccion')";
        Scanner sc = new Scanner(System.in);
        Connection conexion = obtenerConexion();
        if (conexion != null) {
            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                boolean bandera = false;
                do {
                    bandera = false;
                    System.out.print("Ingrese el nif? ");
                    String nif = sc.next();
                    ps = conexion.prepareStatement(query1);
                    ps.setString(1, nif);
                    rs = ps.executeQuery();
                    if (rs.next() == true) {
                        bandera = true;
                        System.out.println("EL NIF YA EXISTE");
                    }
                    if (bandera == false) {
                        ps = conexion.prepareStatement(query2);
                        ps.setString(1, nif);
                        ps.executeUpdate();
                        System.out.println("SE INSERTO REGISTRO");
                        break;
                    }
                } while (true);//Si es verdadero se repite
                //Si es falso sale

            } catch (SQLException ex) {
                System.out.println("error: " + ex);
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
