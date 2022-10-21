package archivoscsv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal4 {

    static String nra = "data/transacciones.csv";
    static List<Transaccion> transacciones_al = MetodosArchivoCsv.leer(nra);

    //DADO UN ARCHIVO CREAR OTROS ARCHIVOS POR CADA CIUDAD Y GRABAR EN EL TODO LO QUE LE CORRESPONDE.
    public static void main(String[] args) {
        List<String> ciudades_al = MetodosArchivoCsv.ciudadesDistinas(nra);
        List<Double> ventasacumulada_al = new ArrayList<>();

        System.out.println("Ciudades: " + ciudades_al);

        for (Transaccion t : transacciones_al) {

            String nra1 = "data/" + t.getCiudad() + ".txt";

            String cadena = t.getIdTransaccion() + ";"
                    + t.getCiudad() + ";"
                    + t.getZona() + ";"
                    + t.getVentas() + ";"
                    + t.getFormaPago() + ";"
                    + t.getCategoria();
            if (MetodosArchivoCsv.escribir_2(nra1, cadena)) {
                System.out.println("ESCRITURA CORRECTA");
            }
        }

        for (String ciudad : ciudades_al) {
            double s = 0;
            for (Transaccion t : transacciones_al) {
                if (ciudad.equalsIgnoreCase(t.getCiudad())) {
                    s = s + t.getVentas();
                }
            }
            //ventasacumulada_al.add(s);
            String nra2 = "data/" + ciudad + ".txt";
            String cadena = "Total Ventas: " + s;
            if (MetodosArchivoCsv.escribir_2(nra2, cadena)) {
                System.out.println("ESCRITURA CORRECTA TOTAL VENTAS");
            }
        }

    }

}
