package json_steven;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Principal2 {

    public static void main(String[] args) {
        String nra = "datos/alumnosteven.json";
        Alumno[] alumnos_v = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(nra));
            Gson gson = new Gson();
            alumnos_v = gson.fromJson(r, Alumno[].class);
            if (alumnos_v != null) {
                Alumno.cabecera2();
                for (Alumno alumno : alumnos_v) {
                    //System.out.println("LLEGO");
                    alumno.imprimir2();
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

}
