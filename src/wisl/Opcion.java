package wisl;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Opcion {

    public static void opcion1() {
        System.out.println("1. CONVERTIR UN OBJETO JAVA TO OBJETO JSON");
        System.out.println("------------------------------------------");
        List cursos_l = Arrays.asList("Física", "Matemática");//["Física","Matemática"]
        Alumno alumno = new Alumno("A1", "Luis", 1.72, true, cursos_l);
        Gson gson = new Gson();
        String json = gson.toJson(alumno);
        System.out.println(json);
    }

    public static void opcion2() {
        System.out.println("1. CONVERTIR UNA LISTA OBJETOS JAVA TO LISTA OBJETOS JSON");
        System.out.println("---------------------------------------------------------");
        List cursos1_l = Arrays.asList("Física", "Matemática");
        List cursos2_l = Arrays.asList("Física");
        List cursos3_l = Arrays.asList();
        List alumnos_l = Arrays.asList(
                new Alumno("A1", "Luis", 1.72, true, cursos1_l),
                new Alumno("A2", "Miguel", 1.73, true, cursos2_l),
                new Alumno("A3", "Carlos", 1.74, false, cursos3_l)
        );
        Gson gson = new Gson();
        String json = gson.toJson(alumnos_l);
        System.out.println(json);
    }

    public static void opcion3() {
        System.out.println("1. CREAR UN ARCHIVO JSON COLORES");
        System.out.println("--------------------------------");
        String[] nombreColor = {"Rojo", "Verde", "Azul", "Cyan", "Magenta", "Amarillo", "Negro"};
        String[] colorHex = {"#F00", "#0F0", "#00F", "#0FF", "#F0F", "#FF0", "#000"};
        List<Colorx> colores_l = new ArrayList<Colorx>();
        for (int i = 0; i < nombreColor.length; i++) {
            colores_l.add(new Colorx(nombreColor[i], colorHex[i]));
        }
        Colores colores = new Colores(colores_l);
        Gson gson = new Gson();
        String json = gson.toJson(colores);
        System.out.println(json);
        String nra = "datos/colores.txt";
        if(escribirArchivoJson(json, nra)) {
            System.out.println("ESCRITURA CORRECTA");
        }else {
            System.out.println("ERROR: ESCRITURA");
        }
    }

    public static void opcion4() {

    }

    public static void opcion5() {

    }

    public static void opcion6() {

    }

    public static void opcion7() {

    }

    public static void opcion8() {

    }

    public static void opcion9() {

    }

    public static void opcion10() {

    }

    public static boolean escribirArchivoJson(String json, String nra) {
        boolean bandera = true;
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File(nra);
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(json + "\n");
            bw.flush();
        } catch (IOException e) {
            bandera = false;
        }
        return bandera;
    }
}
