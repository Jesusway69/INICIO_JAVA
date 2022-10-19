package concesionario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosArchivosCsv {

    public List<Coche> leer(String nra) {
        List<Coche> coches_al = new ArrayList<>();
        String fila = "";
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((fila = br.readLine()) != null) {
                String[] campo = fila.split(";");
                System.out.println(Arrays.asList(campo));
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA");
        }
        return coches_al;
    }

}
