package archivo_serial;


public class Circulo {
    
    private double id;
    private double radio;

    public Circulo() {
    }

    public Circulo(double id, double radio) {
        this.id = id;
        this.radio = radio;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "id=" + id + ", radio=" + radio + '}';
    }
    
    public double area() {
        return Math.PI * radio * radio;
    }
    
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
    public double diametro() {
        return 2*radio;
    }
    
    public static void cabecera() {
        System.out.printf("%2s  %5s  %5s  %9s  %8s\n", "ID", "RADIO", "AREA", "PERIMETRO", "DIAMETRO");
    }

    public void cuerpo() {
        System.out.printf("%2s  %5.2f  %5.2f  %9.2f  %8.2f\n", this.id, this.radio, this.area(), this.perimetro(), this.diametro());
    }    
    
    
}
