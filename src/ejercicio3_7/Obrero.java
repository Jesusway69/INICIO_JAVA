package ejercicio3_7;

public class Obrero {

    private String nombre;
    private int cantidadHorasSemana;

    public Obrero() {
    }

    public Obrero(String nombre, int cantidadHorasSemana) {
        this.nombre = nombre;
        this.cantidadHorasSemana = cantidadHorasSemana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHorasSemana() {
        return cantidadHorasSemana;
    }

    public void setCantidadHorasSemana(int cantidadHorasSemana) {
        this.cantidadHorasSemana = cantidadHorasSemana;
    }

    @Override
    public String toString() {
        return "Obrero{" + "nombre=" + nombre + ", cantidadHorasSemana=" + cantidadHorasSemana + '}';
    }

    public int getHorasExtras() {
        return cantidadHorasSemana - 40;
    }

    public double getSueldo() {
        double sueldo = 0;
        double pagoHora = 200 / 40;
        double horasExtras = getHorasExtras();
        if (horasExtras == 0) {
            sueldo = 200;
        }
        if (horasExtras > 0 && horasExtras <= 8) {
            sueldo = 200 + horasExtras * pagoHora * 2;
        }
        if (horasExtras > 8) {
            sueldo = 200 + (8 * pagoHora * 2) + (horasExtras - 8) * pagoHora * 3;
        }
        return sueldo;
    }

    public static void cabecera() {
        System.out.printf("%-6s  %14s  %12s  %6s\n", "NOMBRE", "CANTIDAD_HORAS", "HORAS_EXTRAS", "SUELDO");
        System.out.printf("%-6s  %14s  %12s  %6s\n", "------", "--------------", "------------", "------");
    }

    public void cuerpo() {
        System.out.printf("%-6s  %14d  %12d  %6.2f\n", nombre, cantidadHorasSemana, getHorasExtras(), getSueldo());
    }
}
