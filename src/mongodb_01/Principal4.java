package mongodb_01;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Principal4 {

    //PASO 1: DEFINIMOS EL HOST(IP) Y EL PUERTO
    static MongoClient cliente = new MongoClient("localhost", 27017);
    //PASO 2: CONEXION A LA BASE DE DATOS
    static MongoDatabase conexion = cliente.getDatabase("campusfp");
    //PASO 3: OBTENER UNA COLECCION PARA TRABAJAR CON ELLA
    static MongoCollection<Document> coleccion = conexion.getCollection("alumno");

    public static void main(String[] args) {
        System.out.println("1. ACTUALIZAR ALUMNO");
        Alumno alumno = new Alumno("A1","Arturo");
        actualizarDocumento(alumno,"idAlumno");

    }
    
    public static void actualizarDocumento(Alumno alumno, String clave) {
        String valor = alumno.getIdAlumno();
        Document buscar = new Document(clave,valor);
        Document actualizar = new Document("$set",new Document("nombre",alumno.getNombre()));
        coleccion.findOneAndUpdate(buscar, actualizar);
    }

    

}
