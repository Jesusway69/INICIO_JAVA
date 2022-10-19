package concesionario;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        String nra = "datos/concesionario.csv";
        List<Coche> coches_al = MetodosArchivosCsv.leer(nra);
    }

}
