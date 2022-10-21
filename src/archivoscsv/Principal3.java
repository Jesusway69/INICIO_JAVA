package archivoscsv;

import java.util.Arrays;
import java.util.List;

public class Principal3 {
    
    static String nra = "data/transacciones.csv";
    static List<Transaccion> transacciones_al = MetodosArchivoCsv.leer(nra);

    //DADO UN ARCHIVO CREAR OTROS ARCHIVOS POR CADA CIUDAD Y GRABAR EN EL TODO LO QUE LE CORRESPONDE.
    public static void main(String[] args) {
       List<String> ciudades_al = MetodosArchivoCsv.ciudadesDistinas(nra);
       System.out.println("Ciudades: " + ciudades_al);
        
       for(Transaccion t: transacciones_al) {
           
           String nra1 = "data/" + t.getCiudad() + ".csv";
           
           String cadena = t.getIdTransaccion()+";"+
                           t.getCiudad()+";"+
                           t.getZona()+";"+
                           t.getVentas()+";"+
                           t.getFormaPago()+";"+
                           t.getCategoria();
           if(MetodosArchivoCsv.escribir_2(nra1, cadena)) {
               System.out.println("ESCRITURA CORRECTA");
           }
       }
        
        
    }
    
    
    


}
