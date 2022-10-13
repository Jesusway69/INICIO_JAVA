package Probando;

import javax.swing.*; //MAS LIVIANOS
import java.awt.*; //MUY PESADOS

public class Alumno {

    //Atributo de clase
    static String centro = "CampusFP";
    //Atributo de instancia(objeto)
    private int idAlumno;
    private String nombre;
    private int edad;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, int edad) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
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

    //METODO DE CLASE
    public static void cabecera() {
        System.out.printf("%8s  %-6s  %4s\n", "DALUMNOI", "NOMBRE", "EDAD");
        System.out.printf("%8s  %-6s  %4s\n", "--------", "------", "----");
    }
    //METODO DE INSTANCIA
    public void cuerpo() {
        System.out.printf("%8d  %-6s  %4d\n", this.idAlumno,this.nombre,this.edad);
    }
}
