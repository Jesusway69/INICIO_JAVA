package mongdb_menu;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

import libreria.Entrada;
import libreria.MiMenu;
import static libreria.Entrada.entradaNombre;
import org.bson.conversions.Bson;

public class Menu {

    static MongoClient cliente = new MongoClient("localhost", 27017);
    static MongoDatabase conexion = cliente.getDatabase("botica");
    static MongoCollection<Document> coleccion = conexion.getCollection("empleado");

    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        do {

            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1. Insertar documentos en la colección");
            System.out.println("2. Mostrar todos los documentos de la coleccion");

            System.out.println("3. Buscar un documento por la clave idEmpleado");
            System.out.println("4. Buscar un documento por la clave nombre");
            System.out.println("5. Buscar un documento por la clave calle");
            System.out.println("6. Buscar un documento por la clava jobis con el valor Gamer");

            System.out.println("0. Salir");

            int opcion = Entrada.entradaNumeroEntero("\nIngrese opción? ");

            switch (opcion) {
                case 1:
                    MiMenu.cls();
                    opcion1();
                    MiMenu.pause();
                    break;
                case 2:
                    MiMenu.cls();
                    opcion2();
                    MiMenu.pause();
                    break;
                case 3:
                    MiMenu.cls();
                    opcion3();
                    MiMenu.pause();
                    break;
                case 4:
                    MiMenu.cls();
                    opcion4();
                    MiMenu.pause();
                    break;
                case 5:
                    MiMenu.cls();
                    opcion5();
                    MiMenu.pause();
                    break;
                case 6:
                    MiMenu.cls();
                    opcion6();
                    MiMenu.pause();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static void opcion1() {
        System.out.println("1. Insertar documentos en la colección");
        System.out.println("--------------------------------------");

        List<Empleado> empleados_al = Data.getListaEmpleado();
        coleccion.drop();
        for (Empleado empleado : empleados_al) {
            Document docEmpleado = empleado.getDocumentFromEmpleado();
            coleccion.insertOne(docEmpleado);
        }
    }

    public static void opcion2() {
        System.out.println("2. Mostrar todos los documentos de la coleccion");
        System.out.println("-----------------------------------------------");

        MongoCursor<Document> cursor = coleccion.find().iterator();
        while (cursor.hasNext()) {
            Document docEmpleado = cursor.next();
            System.out.println(docEmpleado.toJson());
            //System.out.println(docEmpleado);
        }
    }

    public static void opcion3() {
        System.out.println("3. Buscar un documento por la clave idEmpleado");
        System.out.println("----------------------------------------------");

        boolean encontro = false;

        int idEmpleadoBuscar = Entrada.entradaNumeroEntero("\nIngrese idEmpleado? ");

        Bson bson = Filters.eq("idEmpleado", idEmpleadoBuscar);

        FindIterable<Document> iterable = coleccion.find(bson);

        for (Document docEmpleado : iterable) {
            System.out.println(docEmpleado.toJson());
            encontro = true;
        }

        if (!encontro) {
            System.out.println("\nNO EXISTE IDEMPLEADO " + idEmpleadoBuscar);
        }
    }

    public static void opcion4() {
        System.out.println("4. Buscar un documento por la clave nombre");
        System.out.println("------------------------------------------");

        boolean encontro = false;

        String nombreBuscar = entradaNombre("\nIngrese nombre? ");
        String primeraletra = nombreBuscar.toUpperCase().charAt(0)+"";
        nombreBuscar = primeraletra + nombreBuscar.toLowerCase().substring(1);

        Bson bson = Filters.eq("nombre", nombreBuscar);

        FindIterable<Document> iterable = coleccion.find(bson);

        for (Document docEmpleado : iterable) {
            System.out.println(docEmpleado.toJson());
            encontro = true;
        }

        if (!encontro) {
            System.out.println("\nNO EXISTE NOMBRE " + nombreBuscar);
        }
    }

    public static void opcion5() {
        System.out.println("5. Buscar un documento por la clave calle");
        System.out.println("-----------------------------------------");

        boolean encontro = false;

        String calleBuscar = entradaNombre("\nIngrese calle? ");

        Bson bson = Filters.eq("direccion.calle", calleBuscar);

        FindIterable<Document> iterable = coleccion.find(bson);

        for (Document docEmpleado : iterable) {
            System.out.println(docEmpleado.toJson());
            encontro = true;
        }

        if (!encontro) {
            System.out.println("\nNO EXISTE CALLE " + calleBuscar);
        }
    }

    public static void opcion6() {
        System.out.println("6. Buscar un documento por la clava jobis con el valor Gamer");
        System.out.println("------------------------------------------------------------");

        String jobiBuscar = entradaNombre("Ingresar jobi? ");
        
        MongoCursor<Document> cursor = coleccion.find().iterator();
        List lista, jobis;
        while (cursor.hasNext()) {
            Document docEmpleado = cursor.next();
            lista = new ArrayList(docEmpleado.values());
            jobis = (List) lista.get(7);

            for (Object o : jobis) {
                String s = (String) o;
                if (s.equalsIgnoreCase(jobiBuscar)) {
                    System.out.println(docEmpleado.toJson());
                }
            }

            /*
            for (int i = 0; i < jobis.size(); i++) {
                String s = (String) jobis.get(i);
                if (s.equalsIgnoreCase("Gamer")) {
                    System.out.println(docEmpleado.toJson());
                }
            }
             */
            //System.out.println(jobis);
            //System.out.println(docEmpleado.toJson());
            //System.out.println(docEmpleado);
        }
    }

}
