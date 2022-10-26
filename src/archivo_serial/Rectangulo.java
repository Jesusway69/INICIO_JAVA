package archivo_serial;

public class Rectangulo {

    private String id;
    private double largo;
    private double ancho;

    public Rectangulo() {
    }

    public Rectangulo(String id, double largo, double ancho) {
        this.id = id;
        this.largo = largo;
        this.ancho = ancho;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "id=" + id + ", largo=" + largo + ", ancho=" + ancho + '}';
    }

    public double area() {
        return largo * ancho;
    }

    public double perimetro() {
        return 2 * largo + 2 * ancho;
    }

    public static void cabecera() {
        System.out.printf("%2s  %5s  %5s  %5s  %9s\n", "ID", "LARGO", "ANCHO", "AREA", "PERIMETRO");
    }

    public void cuerpo() {
        System.out.printf("%2s  %5.2f  %5.2f  %5.2f  %9.2f\n", this.id, this.largo, this.ancho, this.area(), this.perimetro());
    }

}
