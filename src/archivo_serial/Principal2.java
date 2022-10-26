package archivo_serial;

import java.io.File;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {
        String nra = "data/objeto.ser";

        File f = new File(nra);

        System.out.println("CREAR ARCHIVO");

        if (!f.exists()) {
            if (MetodoArchivoSerial.crear(nra)) {
                System.out.println("OK: CREAR");
            } else {
                System.out.println("ERROR: CREAR");
            }
        } else {
            System.out.println("EL ARCHIVO YA ESTA CREADO");
        }

        System.out.println("ESCRIBIR OBJETOS ARCHIVO");

        Circulo c1 = new Circulo("C1", 9);
        Circulo c2 = new Circulo("C2", 8);

        if (MetodoArchivoSerial.escribir(nra, c1)) {
            System.out.println("OK: ESCRIBIR");
        } else {
            System.out.println("ERROR: ESCRIBIR");
        }

        if (MetodoArchivoSerial.escribir(nra, c2)) {
            System.out.println("OK: ESCRIBIR");
        } else {
            System.out.println("ERROR: ESCRIBIR");
        }

        System.out.println("LEER OBJETOS ARCHIVO");

        List<Object> objetos_al = MetodoArchivoSerial.leer(nra);
        //RECTANGULOS
        Rectangulo.cabecera();
        for (Object objeto : objetos_al) {
            if (objeto instanceof Rectangulo) {
                Rectangulo r = (Rectangulo) objeto;
                r.cuerpo();
            }
        }
        //CIRCULO
        Circulo.cabecera();
        for (Object objeto : objetos_al) {
            if (objeto instanceof Circulo) {
                Circulo c = (Circulo) objeto;
                c.cuerpo();
            }
        }
    }

}
