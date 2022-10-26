package archivo_serial;

public class Principal1 {

    public static void main(String[] args) {
       String nra = "data/objeto.ser"; 
        
       if(MetodoArchivoSerial.crear(nra)) {
           System.out.println("OK: CREAR");
       }else {
           System.out.println("ERROR: CREAR");
       }
        
       Rectangulo r1 = new Rectangulo("R1",4,5);
       Rectangulo r2 = new Rectangulo("R2",6,7);
       
       if(MetodoArchivoSerial.escribir(nra, r1)) {
          System.out.println("OK: ESCRIBIR"); 
       }else {
          System.out.println("ERROR: ESCRIBIR"); 
       }
       
    }

}
