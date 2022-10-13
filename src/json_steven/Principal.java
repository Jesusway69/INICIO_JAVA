package json_steven;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Principal {

    public static void main(String[] args) {
        String nra = "datos/alumnosteven.json";
        Alumno[] alumnos_v = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(nra));
            Gson gson = new Gson();
            alumnos_v = gson.fromJson(r, Alumno[].class);
            if (alumnos_v != null) {
                Alumno.cabecera();
                for (Alumno alumno : alumnos_v) {
                    alumno.imprimir1();
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

}
