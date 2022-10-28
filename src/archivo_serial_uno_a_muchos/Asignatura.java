package archivo_serial_uno_a_muchos;

import java.io.Serializable;
import java.util.List;

public class Asignatura implements Serializable {

    private String idAsignatura;
    private String descripcion;
    private List<Alumno> alumnos_al;

    public Asignatura() {
    }

    public Asignatura(String idAsignatura, String descripcion, List<Alumno> alumnos_al) {
        this.idAsignatura = idAsignatura;
        this.descripcion = descripcion;
        this.alumnos_al = alumnos_al;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Alumno> getAlumnos_al() {
        return alumnos_al;
    }

    public void setAlumnos_al(List<Alumno> alumnos_al) {
        this.alumnos_al = alumnos_al;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "idAsignatura=" + idAsignatura + ", descripcion=" + descripcion + ", alumnos_al=" + alumnos_al + '}';
    }

}
