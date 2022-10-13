package json_objeto_java;

import java.util.List;

public class Alumno1 {

    private int codigo;
    private String nombre;
    private String paterno;
    private List<Curso> cursos_l;

    public Alumno1() {
    }

    public Alumno1(int codigo, String nombre, String paterno, List<Curso> cursos_l) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.paterno = paterno;
        this.cursos_l = cursos_l;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public List<Curso> getCursos_l() {
        return cursos_l;
    }

    public void setCursos_l(List<Curso> cursos_l) {
        this.cursos_l = cursos_l;
    }

    @Override
    public String toString() {
        return "Alumno1{" + "codigo=" + codigo + ", nombre=" + nombre + ", paterno=" + paterno + ", cursos_l=" + cursos_l + '}';
    }

    public static void cabecera() {//PARA TODOS LOS OBJETOS
        System.out.printf("%-6s  %-10s  %-10s  %-40s\n", "CODIGO", "NOMBRE", "PATERNO", "CURSOS");
        System.out.printf("%-6s  %-10s  %-10s  %-40s\n", "------", "------", "-------", "------");
    }

    public void imprimir() {//POR CADA UNO DE LOS OBJETOS
        System.out.printf("%6d  %-10s  %-10s  %-40s\n", codigo, nombre, paterno, cursos_l);
    }

    public void imprimir1() {//POR CADA UNO DE LOS OBJETOS
        System.out.printf("%6d  %-10s  %-10s  %-40s\n", codigo, nombre, paterno, getListaCadenaCursos());
    }

    public String getListaCadenaCursos() {
        String cadena = "";
        for (Curso curso : cursos_l) {
            cadena = cadena + curso.getNombre() + "  ";
        }
        return cadena;
    }

}
