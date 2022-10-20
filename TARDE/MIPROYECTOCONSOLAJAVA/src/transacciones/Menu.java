package transacciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import libreria.*;

public class Menu {

    static String nra = "datos/transacciones.csv";//Ruta relativa
    //static String nra = "C:\\Users\\RYZEN\\Documents\\NetBeansProjects\\INICIOJAVA\\TARDE\\MIPROYECTOCONSOLAJAVA\\datos\\transacciones.csv";
    static List<Transaccion> transacciones_al = MetodosArchivoCsv.leer(nra);

    public static void main(String[] args) {

        do {
            Metodos.cls();
            System.out.println("1. Mostratr todas las transacciones");
            System.out.println("2. Mostrar la ciudad con el mayor monto acumulado");
            System.out.println("3. Mostrar todas las ciuadades distintas");
            System.out.println("4. Mostrar la zona con la mayor venta acumulada");
            System.out.println("5. Ejemplo de un TreeSeet");
            System.out.println("6. Mostrar el monto de venta acumulado por categoría");
            System.out.println("0. Salir");

            int opcion = Metodos.validarEntradaEntero("Ingrese opcion? ");

            switch (opcion) {
                case 1:
                    Metodos.cls();
                    opcion1();
                    Metodos.pause();
                    break;
                case 2:
                    Metodos.cls();
                    opcion2();
                    Metodos.pause();
                    break;
                case 3:
                    Metodos.cls();
                    opcion3();
                    Metodos.pause();
                    break;
                case 4:
                    Metodos.cls();
                    opcion4();
                    Metodos.pause();
                    break;
                case 5:
                    Metodos.cls();
                    opcion5();
                    Metodos.pause();
                    break;
                case 6:
                    Metodos.cls();
                    opcion6();
                    Metodos.pause();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (true);

    }

    public static void opcion1() {
        System.out.println("OPCION 1");
        System.out.println("--------");
        for (Transaccion t : transacciones_al) {
            System.out.println(t.toString());
        }

    }

    public static void opcion2() {
        System.out.println("OPCION 2");
        System.out.println("--------");
        String[] ciudad = {"Santander", "Sevilla", "Vigo", "Alicante", "Valencia", "Granada"};
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
        double maximo = -9999;
        int posicion = -1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > maximo) {
                maximo = c[i];
                posicion = i;
            }
        }

        System.out.println("Ciudad                : " + ciudad[posicion]);
        System.out.println("Monto Acumulado Ventas: " + maximo);

    }

    public static void opcion3() {
        System.out.println("OPCION 3");
        System.out.println("--------");
        Set<String> ciudades_ts = new TreeSet<String>();
        for (Transaccion t : transacciones_al) {
            ciudades_ts.add(t.getCiudad());
        }
        List<String> ciudades_al = new ArrayList<String>(ciudades_ts);
        System.out.println("Ciudades Distintas: " + Arrays.asList(ciudades_al));
    }

    public static void opcion4() {
        System.out.println("OPCION 4");
        System.out.println("--------");
        String[] zona = {"Norte", "Sur", "Levante"};
        double[] c = {0, 0, 0};
        for (Transaccion t : transacciones_al) {
            if (t.getZona().equalsIgnoreCase("Norte")) {
                c[0] = c[0] + t.getVentas();
            }
            if (t.getZona().equalsIgnoreCase("Sur")) {
                c[1] = c[1] + t.getVentas();
            }
            if (t.getZona().equalsIgnoreCase("Levante")) {
                c[2] = c[2] + t.getVentas();
            }
        }
        double maximo = -9999;
        int posicion = -1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > maximo) {
                maximo = c[i];
                posicion = i;
            }
        }

        System.out.println("Zona                  : " + zona[posicion]);
        System.out.println("Monto Acumulado Ventas: " + maximo);
    }

    public static void opcion5() {
        System.out.println("OPCION 5");
        System.out.println("--------");
        Set<String> nombres_ts = new TreeSet<String>();

        nombres_ts.add("Luis");
        nombres_ts.add("Carlos");
        nombres_ts.add("Zacarias");
        nombres_ts.add("Arturo");
        nombres_ts.add("Carlos");

        List<String> nombres_al = new ArrayList<String>(nombres_ts);
        System.out.println("Nombres: " + Arrays.asList(nombres_al));
    }

    public static void opcion6() {
        System.out.println("OPCION 6");
        System.out.println("--------");
        String[] categoria = {"Electrodoméstico", "Informática", "Audio y televisión"};
        double[] c = {0, 0, 0};
        for (Transaccion t : transacciones_al) {
            if (t.getCategoría().equalsIgnoreCase("Electrodoméstico")) {
                c[0] = c[0] + t.getVentas();
                //System.out.println(t.getVentas());
            }
            if (t.getCategoría().equalsIgnoreCase("Informática")) {
                c[1] = c[1] + t.getVentas();
            }
            if (t.getCategoría().equalsIgnoreCase("Audio y televisión")) {
                c[2] = c[2] + t.getVentas();
            }
        }
        for(int i=0; i<categoria.length; i++) {
            System.out.println("Categoría: " + categoria[i] + "   " + "Ventas: " +  c[i]);
        }

    }

}
