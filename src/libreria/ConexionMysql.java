package libreria;

import java.sql.*;

public class ConexionMysql {

    private static Connection conexion;

    public ConexionMysql(String bd) {
        setConexion(bd);
    }

    public static  void setConexion(String bd) {
        String url = "jdbc:mysql://localhost:3306/" + bd;
        try {
            conexion = DriverManager.getConnection(url, "root", "12345678");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConexion() {
        return conexion;
    }

}
