package ejercicios1;

public class Principal {

    public static void main(String[] args) {
      String[] nombre = {"Luis","Miguel","Carlos","María"};  
      int[] cantidadHoras = {50,40,89,60};
      Obrero.cabecera();
      for(int i=0; i<nombre.length; i++) {
          String n = nombre[i];
          int ch = cantidadHoras[i];
          Obrero obrero = new Obrero(n,ch);
          obrero.cuerpo();
      }
       
    }

}

/*
    NOMBRE  CANTIDAD_HORAS  HORAS_EXTRAS SUELDO
    -------------------------------------------
    Luis    50              ?               ?
    Miguel  40              ?               ?
    Carlos  89              ?               ?
    María   60              ?               ?
 */