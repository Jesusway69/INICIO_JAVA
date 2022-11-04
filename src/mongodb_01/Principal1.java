package mongodb_01;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Principal1 {

    //PASO 1: DEFINIMOS EL HOST(IP) Y EL PUERTO
    static MongoClient cliente = new MongoClient("localhost", 27017);
    //PASO 2: CONEXION A LA BASE DE DATOS
    static MongoDatabase conexion = cliente.getDatabase("campusfp");
    //PASO 3: OBTENER UNA COLECCION PARA TRABAJAR CON ELLA
    static MongoCollection<Document> coleccion = conexion.getCollection("alumno");

    public static void main(String[] args) {
        System.out.println("1. INSERTAR ALUMNO");
        //Alumno alumno = new Alumno("A1","Luis",23,1.72);
        //Alumno alumno = new Alumno("A2", "Miguel", 1.70);
        //Alumno alumno = new Alumno("A3","Carlos",24,1.68);
        //String direccion = "Ejercito 123";
        /*
        Alumno alumno = new Alumno("A4","María",21,1.70);
        AlumnoExtendido alumnoe = new AlumnoExtendido("A5","Sylvia",22,1.69,"Marconi 123");
        
        insertarDocumentoAlumno(alumno);
         */
        //insertarDocumentoAlumno_3("E1", "Jaime");
        insertarDocumentoAlumno_4();
        System.out.println("OK");

    }

    public static void insertarDocumentoAlumno(Alumno alumno) {
        Document documento = new Document("idAlumno", alumno.getIdAlumno())
                .append("nombre", alumno.getNombre())
                .append("edad", alumno.getEdad())
                .append("estatura", alumno.getEstatura());
        coleccion.insertOne(documento);
    }

    public static void insertarDocumentoAlumno_1(Alumno alumno, String direccion) {
        Document documento = new Document("idAlumno", alumno.getIdAlumno())
                .append("nombre", alumno.getNombre())
                .append("edad", alumno.getEdad())
                .append("estatura", alumno.getEstatura())
                .append("direccion", direccion);
        coleccion.insertOne(documento);
    }

    public static void insertarDocumentoAlumno_2(AlumnoExtendido alumno) {
        Document documento = new Document("idAlumno", alumno.getIdAlumno())
                .append("nombre", alumno.getNombre())
                .append("edad", alumno.getEdad())
                .append("estatura", alumno.getEstatura())
                .append("direccion", alumno.getDireccion());
        coleccion.insertOne(documento);
    }

    public static void insertarDocumentoAlumno_3(String idEmpleado, String nombre) {
        Document documento = new Document("idEmpleado", idEmpleado)
                .append("nombre", nombre);
        coleccion.insertOne(documento);
    }

    public static void insertarDocumentoAlumno_4() {
        Document documento = new Document("idAlumno", "A6")
                .append("nombre", 123)
                .append("edad", 23)
                .append("estatura", 1.70);
        coleccion.insertOne(documento);
    }

}
