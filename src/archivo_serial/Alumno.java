package archivo_serial;

import java.io.Serializable;


public class Alumno implements Serializable {
    
    private String id;
    private String nombre;
    private int edad;
    private double estatura;

    public Alumno() {
    }

    public Alumno(String id, String nombre, int edad, double estatura) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    
    public String evaluarEdad() {
        if(edad >= 18) {
            return "Adulto";
        }else {
            return "Menor";
        }
    }
    
    public static void cabecera() {
        System.out.printf("%2s  %-8s  %4s  %8s  %-12s\n", "ID", "NOMBRE", "EDAD", "ESTATURA", "EVALUAR EDAD");
        System.out.printf("%2s  %-8s  %4s  %8s  %-12s\n", "--", "------", "----", "--------", "------------");
    }

    public void cuerpo() {
        System.out.printf("%2s  %-8s  %4d  %8.2f  %-12s\n",this.id, this.nombre, this.edad, this.estatura, this.evaluarEdad());
    } 
    
}
