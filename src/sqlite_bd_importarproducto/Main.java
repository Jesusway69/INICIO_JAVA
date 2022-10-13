package sqlite_bd_importarproducto;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sql_alumno3.Entrada;

public class Main {

    public static void main(String[] args) {
        File file = new File("datos/importeproducto1.db");//Ruta Relativa
        String ra = file.getAbsolutePath();//Ruta Absoluta 
        System.out.println(ra);
        
        String url = "jdbc:sqlite:" + ra;
        //String url = "jdbc:sqlite:" + "C:\\Users\\RYZEN\\Documents\\NetBeansProjects\\INICIOJAVA\\datos\\importeproducto1.db";

        try {
            Connection conexion = DriverManager.getConnection(url);
            //ENTRADA
            int cantidadCajas = Entrada.entradaNumeroEntero("Ingrese cantidad cajas? ");
            int unidadesxCaja = Entrada.entradaNumeroEntero("Ingrese unidaes x caja? ");
            double precioxUnidad = Entrada.entradaNumeroReal("Ingrese precio x unidad? ");
            Factura f = new Factura(1, cantidadCajas, unidadesxCaja, precioxUnidad);
            PreparedStatement ps = null;

            //INSERT
            String query1 = "INSERT INTO Factura(cantidadCajas,unidadesxCaja,precioxUnidad) VALUES(?, ?, ?)";
            try {
                ps = conexion.prepareStatement(query1);
                ps.setInt(1, cantidadCajas);
                ps.setInt(2, unidadesxCaja);
                ps.setDouble(3, precioxUnidad);
                ps.executeUpdate();
            } catch (SQLException e2) {
                System.out.println("ERROR INSERT: " + e2);
            }

            //SELECT
            String query2 = "SELECT * FROM Factura";
            try {
                ps = conexion.prepareStatement(query2);
                ResultSet rs = ps.executeQuery();
                Factura.cabecera();
                while (rs.next()) {
                    int idFactura = rs.getInt(1);
                    cantidadCajas = rs.getInt(2);
                    unidadesxCaja = rs.getInt(3);
                    precioxUnidad = rs.getDouble(4);
                    Factura x = new Factura(idFactura, cantidadCajas, unidadesxCaja, precioxUnidad);
                    x.cuerpo();
                }
            } catch (SQLException e) {
                System.out.println("ERROR SELECT: " + e);
            }

        } catch (SQLException e1) {
            System.out.println("ERROR CONEXION: " + e1);
        }

    }

}
