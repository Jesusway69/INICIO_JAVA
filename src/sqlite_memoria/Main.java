package sqlite_memoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:sqlite::memory:";
        try {
            Connection conexion = DriverManager.getConnection(url);

            PreparedStatement ps = null;

            //CREATE TABLE
            try {
                String query = "CREATE TABLE Alumno (\n"
                        + "  idAlumno INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n"
                        + "  nombre   VARCHAR(20) NOT NULL,\n"
                        + "  edad     INTEGER     NOT NULL\n"
                        + ")";
                ps = conexion.prepareStatement(query);
                ps.execute();
                System.out.println("OK: CREATE TABLE");
            } catch (SQLException e) {
                System.out.println("ERROR CREATE TABLE: " + e);
            }

            //INSERT
            try {
                String[] query = {
                    "INSERT INTO Alumno(nombre,edad) VALUES('Luis',21)",
                    "INSERT INTO Alumno(nombre,edad) VALUES('Miguel',23)",
                    "INSERT INTO Alumno(nombre,edad) VALUES('Carlos',22)",
                    "INSERT INTO Alumno(nombre,edad) VALUES('María',19)",
                    "INSERT INTO Alumno(nombre,edad) VALUES('Arturo',23)"
                };
                for (int i = 0; i < query.length; i++) {
                    ps = conexion.prepareStatement(query[i]);
                    ps.executeUpdate();
                }
                System.out.println("OK: INSERT");
            } catch (SQLException e) {
                System.out.println("ERROR INSERT: " + e);
            }

            //SELECT
            try {
                String query = "SELECT * FROM Alumno;";
                ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%-8s %-8s %-3s\n", "IDALUMNO", "NOMBRE", "EDAD");
                System.out.printf("%-8s %-8s %-3s\n", "--------", "------", "----");
                while (rs.next()) {
                    System.out.printf("%8d %-8s %3d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
                }
                System.out.println("OK: SELECT");
            } catch (SQLException e) {
                System.out.println("ERROR: SELECT" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION");
        }

    }

}
