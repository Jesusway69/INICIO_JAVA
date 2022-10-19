package transacciones;

import concesionario.Coche;
import concesionario.MetodosArchivosCsv;
import java.util.Arrays;
import java.util.List;

public class Princiapl {

    public static void main(String[] args) {

        String nra = "datos/transacciones.csv";

        List<Transaccion> transacciones_al = MetodosArchivosCsv.leer1(nra);

        for (Transaccion t : transacciones_al) {
            System.out.println(t);
        }

        // QUE CIUDAD TUBO EL MAYOR MONTO EN VENTAS.
        String[] ciudad = {"Santander","Sevilla","Vigo","Alicante","Valencia","Granada"};
        double[] c = {0, 0, 0, 0, 0, 0};
        for (Transaccion t : transacciones_al) {
            if (t.getCiudad().equalsIgnoreCase("Santander")) {
                c[0] = c[0] + t.getVentas();
            }
            if (t.getCiudad().equalsIgnoreCase("Sevilla")) {
                c[1] = c[1] + t.getVentas();
            }
            if (t.getCiudad().equalsIgnoreCase("Vigo")) {
                c[2] = c[2] + t.getVentas();
            }
            if (t.getCiudad().equalsIgnoreCase("Alicante")) {
                c[3] = c[3] + t.getVentas();
            }
            if (t.getCiudad().equalsIgnoreCase("Valencia")) {
                c[4] = c[4] + t.getVentas();
            }
            if (t.getCiudad().equalsIgnoreCase("Granada")) {
                c[5] = c[5] + t.getVentas();
            }
        }
        for(int i=0; i<c.length; i++) {
            System.out.println(i + "  " + c[i]);
        }
        System.out.println("Ciudad: " + ciudad[1]);

    }

}
