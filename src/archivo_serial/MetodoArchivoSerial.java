package archivo_serial;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MetodoArchivoSerial {

    public static boolean crear(String nra) {
        boolean bandera = true;
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nra));
            oos.close();
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean escribir(String nra, Object objeto) {
        boolean bandera = true;
        try {
            MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(nra, true));
            
            moos.writeUnshared(objeto);
            System.out.println("LLEGO");
            moos.close();
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static List<Object> leer(String nra) {
        List<Object> objetos_al = new ArrayList<Object>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nra));
            Object objeto = ois.readObject();
            while (objeto != null) {
                objetos_al.add(objeto);
                objeto = ois.readObject();
            }
        } catch (EOFException e) {
            System.out.print("LECTURA CORRECTA");
        } catch (IOException | ClassNotFoundException e) {
            objetos_al = null;
        }
        return objetos_al;
    }
}
