package mongodb_01;

public class Alumno {

    private String idAlumno;

    public Alumno(String idAlumno, String nombre, double estatura) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.estatura = estatura;
    }
    private String nombre;
    private int edad;
    private double estatura;

    public Alumno() {
    }

    public Alumno(String idAlumno, String nombre, int edad, double estatura) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Alumno(String idAlumno, String nombre) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }

}
