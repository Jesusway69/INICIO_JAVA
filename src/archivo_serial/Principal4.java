package archivo_serial;

import java.io.File;
import java.util.List;

public class Principal4 {

    public static void main(String[] args) {
        String nra = "data/alumno.ser";

        File f = new File(nra);

        System.out.println("CREAR ARCHIVO");

        if (!f.exists()) {
            if (MetodoArchivoSerial.crear(nra)) {
                System.out.println("OK: CREAR");
            } else {
                System.out.println("ERROR: CREAR");
            }
        } else {
            System.out.println("EL ARCHIVO YA ESTA CREADO");
        }

        System.out.println("ESCRIBIR OBJETOS ARCHIVO");

        Alumno a1 = new Alumno("A1", "Luis", 23, 1.72);
        Alumno a2 = new Alumno("A2", "Marcos", 24, 1.73);

        if (MetodoArchivoSerial.escribirAlumno(nra, a1)) {
            System.out.println("OK: ESCRIBIR");
        } else {
            System.out.println("ERROR: ESCRIBIR");
        }

        if (MetodoArchivoSerial.escribirAlumno(nra, a2)) {
            System.out.println("OK: ESCRIBIR");
        } else {
            System.out.println("ERROR: ESCRIBIR");
        }

        System.out.println("LEER OBJETOS ARCHIVO");

        List<Alumno> alumnos_al = MetodoArchivoSerial.leerAlumno(nra);
        //ALUMNO
        Alumno.cabecera();
        for (Alumno alumno : alumnos_al) {
            alumno.cuerpo();
        }
    }

}
