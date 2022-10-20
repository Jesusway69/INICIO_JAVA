package transacciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MetodosArchivoCsv {

    public static List<Transaccion> leer(String nra) {
        List<Transaccion> transacciones_al = new ArrayList<>();

        String fila = "";
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    String[] campo = fila.split(";");
                    // System.out.println(Arrays.asList(campo));
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
}
