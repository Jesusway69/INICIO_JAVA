package metodos_instancia_static;

public class AlumnoExtension extends Alumno {
    
    // VARIABLES DE INSTANCIA
    
    private String direccion;

    public AlumnoExtension() {
    }
    
    public AlumnoExtension(String idAlumno, String nombre, int edad, double estatura,String direccion) {
        super(idAlumno, nombre, edad, estatura);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static String getInstituto() {
        return instituto;
    }

    public static void setInstituto(String instituto) {
        Alumno.instituto = instituto;
    }
    
    
}
