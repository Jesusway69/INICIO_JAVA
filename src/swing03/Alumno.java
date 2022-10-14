package swing03;

public class Alumno {
    private int idAlumno;
    private String nombre;

    public Alumno(int idAlumno, String nombre) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + '}';
    }
    
}
