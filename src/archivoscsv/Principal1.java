package archivoscsv;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Principal1 {

    static String nra = "data/transacciones.csv"; // Ruta Relativa
    static List<Transaccion> transacciones_al = MetodosArchivoCsv.leer(nra);

    public static void main(String[] args) {
       mostrarTodasTransacciones();
    }

    public static void mostrarTodasTransacciones() {
        for (Transaccion t : transacciones_al) {
            System.out.println(t);
        }
    }


/*
    public static void steven() {
        List<String> ciudadesLimpias_al = ciudadesDistinas();
        List<Double> sumas = new ArrayList<Double>();
        for (String ciudad : ciudadesLimpias_al) {
            double suma = 0;
            for (Transaccion t : transacciones_al) {
                if (ciudad.equalsIgnoreCase(t.getCiudad())) {
                    suma = suma + t.getVentas();
                }
            }
            sumas.add(suma);
        }

        String ciudadMayor = "";
        double mayorVenta = 0;

        int j = -1;
        for (int i = 0; i < sumas.size(); i++) {
            System.out.println("La ciudad " + ciudadesLimpias_al.get(i) + " con venta acumulada de: " + sumas.get(i));
            if (sumas.get(i) > mayorVenta) {
                //ciudadMayor = ciudadesLimpias_al.get(i);
                mayorVenta = sumas.get(i);
                j = i;
            }
        }
        System.out.println("\n\nLa ciudad con la mayor venta acumulada: " + ciudadesLimpias_al.get(j) + " con " + sumas.get(j));
    }
*/
}


