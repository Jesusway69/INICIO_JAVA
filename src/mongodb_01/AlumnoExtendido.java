package mongodb_01;

public class AlumnoExtendido extends Alumno {

    private String direccion;

    public AlumnoExtendido(String idAlumno, String nombre, int edad, double estatura, String direccion) {
        super(idAlumno, nombre, edad, estatura);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "AlumnoExtendido{" + "direccion=" + direccion + '}';
    }

}
