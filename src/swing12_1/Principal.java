package swing12_1;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        String nra1 = "data/obreros.csv"; // ORIGEN
        String nra2 = "data/obreros.ser"; // DESTINO

        if (Controlador.crear(nra2)) {
            System.out.println("OK: CREAR");
        } else {
            System.out.println("ERROR: CREAR");
        }

        List<Obrero> obreros_al = Controlador.leer(nra1);
        for (Obrero obrero : obreros_al) {
            if (Controlador.escribirObreroSerial(nra2, obrero)) {
                System.out.println("OK: ESCRIBIR");
            } else {
                System.out.println("ERROR: ESCRIBIR");
            }

        }

    }

}
