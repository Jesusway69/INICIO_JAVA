package mongdb_menu;

import java.util.List;
import org.bson.Document;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private int edad;
    private int sueldo;
    private Direccion direccion;
    private String telefono;
    private List<String> jobis;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, int edad, int sueldo, Direccion direccion, String telefono, List<String> jobis) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jobis = jobis;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<String> getJobis() {
        return jobis;
    }

    public void setJobis(List<String> jobis) {
        this.jobis = jobis;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", direccion=" + direccion + ", telefono=" + telefono + ", jobis=" + jobis + '}';
    }
    
    public Document getDocumentFromEmpleado() {
        Document docDireccion = new Document("calle",direccion.getCalle())
                              .append("numero", direccion.getNumero())
                              .append("ciudad", direccion.getCiudad());
        
        Document docEmpleado = new Document("idEmpleado",this.getIdEmpleado())
                              .append("nombre", this.getNombre())
                              .append("edad", this.getEdad())
                              .append("sueldo", this.getSueldo())
                              .append("direccion", docDireccion)
                              .append("telefono", this.getTelefono())
                              .append("jobis", this.getJobis());
        
        return docEmpleado;
    }

}
