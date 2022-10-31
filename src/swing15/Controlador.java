package swing15;

import static archivoscsv.MetodosArchivoCsv.leer;
import archivoscsv.Transaccion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Controlador {

    public static List<Obrero> leer(String nra) {
        List<Obrero> obreros_al = new ArrayList<>();
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
                    Obrero obrero = new Obrero(campo[0],
                            campo[1],
                            Integer.parseInt(campo[2]));

                    obreros_al.add(obrero);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA");
        }

        return obreros_al;
    }

    public static boolean escribir(String nra, String cadena) {
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
                bw.write("IDOBRERO;NOMBRE,HOTRAS TRABAJADAS SEMANA" + "\n");
                bw.flush();
            }

        } catch (IOException e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean correctoHorasTrabajadasSemana(String horasTrabajadasSemana) {
        String patron = "[0-9]+";
        boolean correcto = horasTrabajadasSemana.matches(patron);
        return correcto;
    }

    public static boolean correctoNombre(String nombre) {
        String patron = "[a-zA-ZñÑáéíóú]+";
        boolean correcto = nombre.matches(patron);
        return correcto;
    }

    public static boolean correctoIdObrero(String idObrero) {
        String patron = "C[0-9]{2,2}";
        boolean correcto = idObrero.matches(patron);
        return correcto;
    }
}
