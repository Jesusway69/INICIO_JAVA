package mongdb_menu;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

import libreria.Entrada;
import libreria.MiMenu;
import static libreria.Entrada.entradaNombre;
import org.bson.conversions.Bson;

public class Menu {

    static MongoClient cliente = new MongoClient("localhost", 27017);
    static MongoDatabase conexion = cliente.getDatabase("tienda");
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
            System.out.println("7. Mostrar todos los jobis distintos y la cantidad");
            System.out.println("8. Obtener el sueldo medio entre todos los empleados");
            System.out.println("9. Obtener la calle con el mayor número de empleados");

            // Filters
            System.out.println("10. Mostrar los empleados cuyo nombre sea Arturo o Miguel");
            System.out.println("11. Mostrar los empleados cuyo que nombre no sea ni Arturo ni Miguel");
            System.out.println("12. Mostrar los empleados que se llamen María y su edad sea 21 años");
            System.out.println("13. Mostrar los empleados que se llamen María y su edad sea mayor a 21 años");
            System.out.println("14. Mostrar los empleados cuyo idEmpleado este en el rango [8,15]");
            System.out.println("15. Mostrar los empleados que no se llame Carmen");
            System.out.println("16. Mostrar los empleados cuyo idEmpleado esten en los rangos siguientes  [..3]  [10,13]  [19..]");

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
                case 7:
                    MiMenu.cls();
                    opcion7();
                    MiMenu.pause();
                    break;
                case 8:
                    MiMenu.cls();
                    opcion8();
                    MiMenu.pause();
                    break;
                case 9:
                    MiMenu.cls();
                    opcion9();
                    MiMenu.pause();
                    break;
                case 10:
                    MiMenu.cls();
                    opcion10();
                    MiMenu.pause();
                    break;
                case 11:
                    MiMenu.cls();
                    opcion11();
                    MiMenu.pause();
                    break;
                case 12:
                    MiMenu.cls();
                    opcion12();
                    MiMenu.pause();
                    break;
                case 13:
                    MiMenu.cls();
                    opcion13();
                    MiMenu.pause();
                    break;
                case 14:
                    MiMenu.cls();
                    opcion14();
                    MiMenu.pause();
                    break;
                case 15:
                    MiMenu.cls();
                    opcion15();
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
        String primeraletra = nombreBuscar.toUpperCase().charAt(0) + "";
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

    public static void opcion7() {
        System.out.println("7. Mostrar todos los jobis distintos y la cantidad");
        System.out.println("--------------------------------------------------");

        Set<String> jobis_ts = new TreeSet<>();

        MongoCursor<Document> cursor = coleccion.find().iterator();
        while (cursor.hasNext()) {
            Document documento = cursor.next();
            for (Map.Entry<String, Object> entrada : documento.entrySet()) {

                if (entrada.getKey().equalsIgnoreCase("jobis")) {
                    List lista = (List) entrada.getValue();
                    System.out.printf("%-12s  %-40s\n", entrada.getKey(), entrada.getValue());
                    for (Object o : lista) {
                        String s = (String) o;
                        jobis_ts.add(s);
                    }

                }

            }
        }

        for (String s : jobis_ts) {
            System.out.println(s);
        }

        System.out.println("Cantidad de jobis: " + jobis_ts.size());

    }

    public static void opcion8() {
        System.out.println("8. Obtener el sueldo medio entre todos los empleados");
        System.out.println("----------------------------------------------------");
        double a = 0;
        MongoCursor<Document> cursor = coleccion.find().iterator();
        while (cursor.hasNext()) {
            Document documento = cursor.next();
            for (Map.Entry<String, Object> entrada : documento.entrySet()) {

                if (entrada.getKey().equalsIgnoreCase("sueldo")) {
                    int x = (int) entrada.getValue();
                    a = a + x;

                }

            }
        }
        System.out.println("Suma : " + a);
        System.out.println("Cantidad: " + coleccion.countDocuments());

        System.out.println("Promedio: " + a / coleccion.countDocuments());
    }

    public static void opcion9() {
        System.out.println("9. Obtener la calle con el mayor número de empleados");
        System.out.println("----------------------------------------------------");

        Set<String> calles_ts = new TreeSet<>();
        List<String> calles_al = new ArrayList<>();

        MongoCursor<Document> cursor = coleccion.find().iterator();

        while (cursor.hasNext()) {
            Document documento = cursor.next();
            for (Map.Entry<String, Object> entrada : documento.entrySet()) {

                if (entrada.getKey().equalsIgnoreCase("direccion")) {
                    Document docDireccion = (Document) entrada.getValue();
                    for (Map.Entry<String, Object> entradad : docDireccion.entrySet()) {
                        if (entradad.getKey().equalsIgnoreCase("calle")) {
                            String c = (String) entradad.getValue();
                            calles_ts.add(c);
                            calles_al.add(c);
                        }

                    }
                }

            }
        }

        for (String s1 : calles_ts) {
            int a = 0;
            for (String s2 : calles_al) {
                if (s1.equalsIgnoreCase(s2)) {
                    a++;
                }
            }
            System.out.printf("%-20s  %3d\n", s1, a);
        }

    }

    public static void opcion10() {
        System.out.println("10. Mostrar los empleados cuyo nombre sea Arturo o Miguel");
        System.out.println("---------------------------------------------------------");
        Bson bson = Filters.or(
                Filters.eq("nombre", "Arturo"),
                Filters.eq("nombre", "Miguel")
        );
        FindIterable<Document> iterable = coleccion.find(bson);
        for (Document doc : iterable) {
            System.out.println(doc.toJson());
        }
    }

    public static void opcion11() {
        System.out.println("11. Mostrar los empleados cuyo que nombre no sea ni Arturo ni Miguel");
        System.out.println("--------------------------------------------------------------------");
        Bson bson = Filters.nor(
                Filters.eq("nombre", "Arturo"),
                Filters.eq("nombre", "Miguel")
        );
        FindIterable<Document> iterable = coleccion.find(bson);
        for (Document doc : iterable) {
            System.out.println(doc.toJson());
        }
    }

    public static void opcion12() {
        System.out.println("12. Mostrar los empleados que se llamen María y su edad sea 21 años");
        System.out.println("-------------------------------------------------------------------");
        Bson bson = Filters.and(
                Filters.eq("nombre", "María"),
                Filters.eq("edad", 21)
        );
        FindIterable<Document> iterable = coleccion.find(bson);
        for (Document doc : iterable) {
            System.out.println(doc.toJson());
        }
    }

    public static void opcion13() {
        System.out.println("13. Mostrar los empleados que se llamen María y su edad sea mayor a 21 años");
        System.out.println("---------------------------------------------------------------------------");
        Bson bson = Filters.and(
                Filters.eq("nombre", "María"),
                Filters.gt("edad", 21)
        );
        FindIterable<Document> iterable = coleccion.find(bson);
        for (Document doc : iterable) {
            System.out.println(doc.toJson());
        }
    }

    public static void opcion14() {
        System.out.println("14. Mostrar los empleados cuyo idEmpleado este en el rango [8,15]");
        System.out.println("-----------------------------------------------------------------");
        Bson bson = Filters.and(
                Filters.gte("idEmpleado", 8),
                Filters.lte("idEmpleado", 15)
        );
        FindIterable<Document> iterable = coleccion.find(bson);
        for (Document doc : iterable) {
            System.out.println(doc.toJson());
        }
    }

    public static void opcion15() {
        System.out.println("15. Mostrar los empleados que no se llame Carmen");
        System.out.println("------------------------------------------------");

        //Bson bson = Filters.ne("nombre", "Jose");
        /*
        Bson bson = Filters.nor(
                Filters.eq("nombre", "Jose")
        );
         */
        Bson bson = Filters.or(
                Filters.ne("nombre", "Jose")
        );

        FindIterable<Document> iterable = coleccion.find(bson);
        for (Document doc : iterable) {
            System.out.println(doc.toJson());
        }
    }

}
