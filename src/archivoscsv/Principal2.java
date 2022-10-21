package archivoscsv;

public class Principal2 {

    public static void main(String[] args) {
         String nra = "data/transacciones3.csv";
         //ESCRITURA
         String cadena = "38;Alicante;Levante;30000;Tarjeta;Audio y televisión";
         if(MetodosArchivoCsv.escribir_2(nra, cadena)) {
             System.out.println("Escritura Correcta");
         }else {
             System.out.println("Escritura Incorrecta");
         }
    }

}
