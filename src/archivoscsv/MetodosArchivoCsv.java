package archivoscsv;

import static archivoscsv.Principal1.transacciones_al;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MetodosArchivoCsv {

    public static List<Transaccion> leer(String nra) {
        List<Transaccion> transacciones_al = new ArrayList<>();
        String fila = "";

        File f;
        FileReader fr;
        BufferedReader br;

        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    String[] campo = fila.split(";");
                    //System.out.println(Arrays.asList(campo));
                    Transaccion t = new Transaccion(Integer.parseInt(campo[0]),
                            campo[1],
                            campo[2],
                            Double.parseDouble(campo[3]),
                            campo[4],
                            campo[5]);
                    transacciones_al.add(t);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA");
        }

        return transacciones_al;
    }

    public static boolean escribir_1(String nra, String cadena) {
        boolean bandera = true;
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File(nra);
            //fw = new FileWriter(f); // false Elimina el archivo y lo vuelve a crear
            fw = new FileWriter(f, true); // Abrir archivo para añadir
            bw = new BufferedWriter(fw);
            bw.write(cadena + "\n");
            bw.flush();
        } catch (IOException e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean escribir_2(String nra, String cadena) {
        boolean bandera = true;
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File(nra);
            if (f.exists()) {
                fw = new FileWriter(f, true); //Abrir para añadir
                bw = new BufferedWriter(fw);
                bw.write(cadena + "\n");
                bw.flush();
            } else {
                fw = new FileWriter(f); //Crear y Abrir para escribir
                bw = new BufferedWriter(fw);
                bw.write("IDTRANSACCION;CIUDAD;ZONA;VENTAS;FORMA PAGO;CATEGORIA" + "\n");
                bw.flush();
            }

        } catch (IOException e) {
            bandera = false;
        }
        return bandera;
    }

    public static List<String> ciudadesDistinas(String nra) {
        transacciones_al = leer(nra);
        TreeSet<String> ciudades_ts = new TreeSet<String>();
        for (Transaccion t : transacciones_al) {
            ciudades_ts.add(t.getCiudad());
        }
        List<String> ciudades_al = new ArrayList<String>(ciudades_ts);
        //System.out.println(ciudades_al);
        return ciudades_al;
    }

    /*

    public static void escribir(List<Obrero> obreros_al) {
        File f = new File(Ventana.ruta);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Obrero o : obreros_al) {
                bw.write(o.getIdObrero() + ";" + o.getNombre() + ";" + o.getCantidadHorasSemana() + "\n");
                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println("ERROR ESCRITURA");
        }
    }
     */
}
