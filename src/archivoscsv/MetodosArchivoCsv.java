package archivoscsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

}
