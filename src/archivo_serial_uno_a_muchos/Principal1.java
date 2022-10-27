package archivo_serial_uno_a_muchos;

import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
       String nra = "data/alumno.ser";
       List<Alumno> alumnos_al = Controlador.leerAlumno(nra);
       for(Alumno alumno: alumnos_al) {
           System.out.println(alumno);
       }
    }

}
