package wisl;

public class Colorx {

    private String nombrecolor;
    private String valorHexadecimal;

    public Colorx() {
    }

    public Colorx(String nombrecolor, String valorHexadecimal) {
        this.nombrecolor = nombrecolor;
        this.valorHexadecimal = valorHexadecimal;
    }

    public String getNombrecolor() {
        return nombrecolor;
    }

    public void setNombrecolor(String nombrecolor) {
        this.nombrecolor = nombrecolor;
    }

    public String getValorHexadecimal() {
        return valorHexadecimal;
    }

    public void setValorHexadecimal(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }

    @Override
    public String toString() {
        return "Colorx{" + "nombrecolor=" + nombrecolor + ", valorHexadecimal=" + valorHexadecimal + '}';
    }

}
