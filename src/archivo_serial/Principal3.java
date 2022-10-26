package archivo_serial;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class Principal3 {

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

        Alumno a1 = new Alumno("A1","Luis",23,1.72);
        Alumno a2 = new Alumno("A2","Marcos",24,1.73);

        if (MetodoArchivoSerial.escribir(nra, a1)) {
            System.out.println("OK: ESCRIBIR");
        } else {
            System.out.println("ERROR: ESCRIBIR");
        }

        if (MetodoArchivoSerial.escribir(nra, a2)) {
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

        //ALUMNO
        Alumno.cabecera();
        for (Object objeto : objetos_al) {
            if (objeto instanceof Alumno) {
                Alumno a = (Alumno) objeto;
                a.cuerpo();
            }
        }
    }

}
