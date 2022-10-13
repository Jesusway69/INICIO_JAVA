package json_steven;

import java.util.List;

public class Curso {

    private String idCurso;
    private String nombre;
    private List<Nota> notas;

    public Curso() {
    }

    public Curso(String idCurso, String nombre, List<Nota> notas) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", nombre=" + nombre + ", notas=" + notas + '}';
    }

}
