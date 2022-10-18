package vector;


import java.util.Scanner;
import libreria.Metodos;

public class Principal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //INGRESAR NUMEROS ENTEROS A UN VECTOR DINAMICO
        try {
            int n = Metodos.validarEntradaEntero("Ingrese tamaño vector? ");
            int[] vector = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("vector[" + i + "]=");
                vector[i] = Metodos.validarEntradaEntero("Ingrese elemento vector? ");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
            //e.printStackTrace();
        }

        System.out.println("EL PROGRAMA CONTINUA");

    }

}
