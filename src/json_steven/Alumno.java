package json_steven;

import java.util.List;

public class Alumno {

    private int codigo;
    private String nombre;
    private String paterno;
    private List<Curso> asignaturas_l;

    public Alumno() {
    }

    public Alumno(int codigo, String nombre, String paterno, List<Curso> asignaturas_l) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.paterno = paterno;
        this.asignaturas_l = asignaturas_l;
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

    public List<Curso> getAsignaturas_l() {
        return asignaturas_l;
    }

    public void setAsignaturas_l(List<Curso> asignaturas_l) {
        this.asignaturas_l = asignaturas_l;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", paterno=" + paterno + ", asignaturas_l=" + asignaturas_l + '}';
    }

    public static void cabecera() {
        System.out.printf("%-6s %-10s  %-10s  %-80s\n", "CODIGO", "NOMBRE", "PATERNO", "CURSOS y NOTAS");
        System.out.printf("%-6s %-10s  %-10s  %-80s\n", "------", "------", "-------", "--------------");
    }

    public void imprimir1() {
        System.out.printf("%-6s %-10s  %-10s  %-80s\n", this.codigo, this.nombre, this.paterno, cursosNotas());
    }

    public static void cabecera2() {
        System.out.printf("%-6s %-10s  %-10s  %-12s  %12s\n", "CODIGO", "NOMBRE", "PATERNO", "P.MATEMATICA", "P.FISICA");
        System.out.printf("%-6s %-10s  %-10s  %-12s  %12s\n", "------", "------", "-------", "------------", "--------");
    }

    public void imprimir2() {
        System.out.printf("%-6s %-10s  %-10s  %12.2f  %12.2f\n", this.codigo, this.nombre, this.paterno, getPromedio()[0], getPromedio()[1]);
    }

    public String cursosNotas() {
        String cadena = "";
        for (Curso a : this.asignaturas_l) {
            String cad = "";
            for (Nota n : a.getNotas()) {
                cad = cad + "FECHA: " + n.getFecha() + ", NOTA: " + n.getExamen() + " | ";
            }
            cadena = cadena + a.getNombre() + ": " + cad + "    ";

        }
        return cadena;
    }

    public double[] getPromedio() {
        double[] promedio = new double[2];
        for (int i = 0; i < this.asignaturas_l.size(); i++) {
            double suma = 0;
            Curso asignatura = this.asignaturas_l.get(i);
            for (int j = 0; j < asignatura.getNotas().size(); j++) {
                Nota nota = asignatura.getNotas().get(j);
                suma = suma + nota.getExamen();
            }
            if (asignatura.getNombre().equalsIgnoreCase("matemática")) {
                promedio[0] = suma / asignatura.getNotas().size();
            }
            if (asignatura.getNombre().equalsIgnoreCase("física")) {
                promedio[1] = suma / asignatura.getNotas().size();
            }
        }
        return promedio;

    }

}
