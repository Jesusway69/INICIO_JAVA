package wisl;

import java.util.List;

public class Colores {

    private List<Colorx> arrayColores;

    public Colores() {
    }

    public Colores(List<Colorx> arrayColores) {
        this.arrayColores = arrayColores;
    }

    public List<Colorx> getArrayColores() {
        return arrayColores;
    }

    public void setArrayColores(List<Colorx> arrayColores) {
        this.arrayColores = arrayColores;
    }

    @Override
    public String toString() {
        return "Colores{" + "arrayColores=" + arrayColores + '}';
    }

}
