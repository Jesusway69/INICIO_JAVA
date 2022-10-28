package archivo_serial_uno_a_muchos;

import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        String nra = "src/archivo_serial_uno_a_muchos/alumno.ser";
        List<Alumno> alumnos_al = Controlador.leerAlumno(nra);
        for (Alumno alumno : alumnos_al) {
            System.out.println(alumno);
        }

        String nra1 = "src/archivo_serial_uno_a_muchos/asignatura.ser";
        List<Asignatura> asignaturas_al = Controlador.leerAsignatura(nra1);
        for (Asignatura asignatura : asignaturas_al) {
            System.out.println(asignatura);
        }

    }

}
