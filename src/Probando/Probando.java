package Probando;

//AMBITO DE UNA VARIABLE
public class Probando {

    public static void main(String[] args) {//BLOQUE 0
        String y = "Hola";
        
        {//BLOQUE 1
            String x = "Bloque 1";
            System.out.println(x);
            System.out.println(y);
        }

        {//BLOQUE 2
            String x = "Bloque 2";
            System.out.println(x);
        }

        String x = "Bloque 0";
        System.out.println(x);
    }

}
