package mongodb_01;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

public class Principal2 {

    //PASO 1: DEFINIMOS EL HOST(IP) Y EL PUERTO
    static MongoClient cliente = new MongoClient("localhost", 27017);
    //PASO 2: CONEXION A LA BASE DE DATOS
    static MongoDatabase conexion = cliente.getDatabase("campusfp");
    //PASO 3: OBTENER UNA COLECCION PARA TRABAJAR CON ELLA
    static MongoCollection<Document> coleccion = conexion.getCollection("alumno");

    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        System.out.println("2. MOSTRAR TODOS LOS DOCUMENTOS DE LA COLECCION");
        mostrarDocument();

    }

    public static void mostrarDocument() {
        MongoCursor<Document> cursor = coleccion.find().iterator();
        while (cursor.hasNext()) {
            Document documento = cursor.next();
            System.out.println(documento.toJson());
        }
    }

    public static void mostrarNombre() {
        MongoCursor<Document> cursor = coleccion.find().iterator();
        List lista;
        while (cursor.hasNext()) {
            Document documento = cursor.next();
            lista = new ArrayList(documento.values());
            //System.out.println(Arrays.asList(lista));
            Object nombre = lista.get(2);
            System.out.println(nombre.toString());
        }
    }
    
    public static void mostrarNombre_1() {
        MongoCursor<Document> cursor = coleccion.find().iterator();
        List lista;
        while (cursor.hasNext()) {
            Document documento = cursor.next();
            lista = new ArrayList(documento.values());
            //System.out.println(Arrays.asList(lista));
            
            Object nombre = lista.get(2);
            System.out.println(nombre.toString());
        }
    }

}


/*
DBObject doc = cursor.next();
Map<String, Integer> map = (Map<String, Integer>)doc.get("docOccurrence");
*/