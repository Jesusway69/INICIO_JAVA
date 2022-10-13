package vector;

public class Principal1 {

    public static void main(String[] args) {
       
        int[] enteros = {65,66,67,68};
        double[] reales_d = {8.0,9.1,2.3,0,1.7,2.9};
        float[] reales_f = {8.0f,9.1f,2.3f,0,1.7f,2.9f};
        char[] caracteres = {'a','?'};
        boolean[] logico = {true,false};
        
        
        //CAST: CONVERSTIONES DE TIPO RAPIDO (DOUBLE A INT)
        double x1 = 8.45;
        int y1 = (int)x1; //8 Guarda en la RAM
        System.out.println("Real  : " + x1);
        System.out.println("Entero: " + (int)x1);
        System.out.println("Entero: " + y1);
        
        //CAST: CONVERSION INT A CHAR
        int x2 = 65;
        char y2 = (char)x2;
        System.out.println("Entero  : " + x2);
        System.out.println("Caracter: " + y2);
        
        //RECORRER EL VECTOR DE ENTEROS
        for(int i=0; i<enteros.length; i++) {
            System.out.printf("%-5d  %-5s\n",enteros[i],(char)enteros[i]);
        }
        
        //IMPRIMIR TODO EL ALFABETO INGLES EN MAYUSCULAS
        for(int i=65; i<=90; i++) {
            System.out.printf("%-5d  %-5s\n",i,(char)i);
        }
        
        
        
    }

}
