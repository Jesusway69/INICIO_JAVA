package archivo_serial_uno_a_muchos;

import java.io.Serializable;

public class Alumno implements Serializable {

    private String idAlumno;
    private String nombre;
    private int edad;
    private String idAsignatura;
    private int nota;

    public Alumno() {
    }

    public Alumno(String idAlumno, String nombre, int edad, String idAsignatura, int nota) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.idAsignatura = idAsignatura;
        this.nota = nota;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", edad=" + edad + ", idAsignatura=" + idAsignatura + ", nota=" + nota + '}';
    }





}
