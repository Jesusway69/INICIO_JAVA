package mongodb_01;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Principal3 {

    //PASO 1: DEFINIMOS EL HOST(IP) Y EL PUERTO
    static MongoClient cliente = new MongoClient("localhost", 27017);
    //PASO 2: CONEXION A LA BASE DE DATOS
    static MongoDatabase conexion = cliente.getDatabase("campusfp");
    //PASO 3: OBTENER UNA COLECCION PARA TRABAJAR CON ELLA
    static MongoCollection<Document> coleccion = conexion.getCollection("alumno");

    public static void main(String[] args) {
        System.out.println("1. ELIMINAR ALUMNO");
        //eliminarDocumento("idAlumno","A3");
        //eliminarDocumento("idEmpleado","E1");
        eliminarDocumento("estatura", 1.7);
    }

    public static void eliminarDocumento(String clave, Object valor) {
        BasicDBObject documento = new BasicDBObject();
        if (valor instanceof String) {
            documento.put(clave, (String)valor);
        }else {
            documento.put(clave, (double)valor);
        }
        coleccion.deleteOne(documento);
    }

}
