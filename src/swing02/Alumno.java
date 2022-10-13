package swing2;

public class Alumno { //Instituto: Santa Eugenia

    // VARIABLE DE CLASE
    
    static String instituto = "Santa Eugenia";
    
    // VARIABLES DE INSTANCIA (ENTRADA)
    private String idAlumno;
    private String nombre;
    private int edad;
    private double estatura;

    // CONSTRUCTORES
    public Alumno() {
    }

    public Alumno(String idAlumno, String nombre, int edad, double estatura) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // METODOS SET Y GET
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
    //METODO DE CLASE
    public static void cabecera() {
        System.out.printf("%8s  %6s  %4s  %8s\n", "IDALUMNO","NOMBRE","EDAD","ESTATURA");
    }
    
    // METODO DE INSTANCIA
    public void cuerpo() {
        System.out.printf("%8s  %6s  %4d  %8.2f\n", idAlumno,nombre,edad,estatura);
    }
    
    public String evaluarEdad() {
        if(edad > 18) {
            return "Mayor Edad";
        }else {
            return "Menor Edad";
        }
    }
}
