package json_objeto_java;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Principal3 {

    public static void main(String[] args) {
        String nra = "datos/alumno1.json";
        Alumno1[] alumnos_v = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(nra));
            Gson gson = new Gson();
            alumnos_v = gson.fromJson(r, Alumno1[].class);

            if (alumnos_v != null) {
                Alumno1.cabecera();
                for (Alumno1 alumno : alumnos_v) {
                    alumno.imprimir1();
                }
            } else {
                System.out.println("VECTOR VACIO");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

}
