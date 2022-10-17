package arraylist;

import java.util.Scanner;

public class Metodos {

    public static int validarEntradaEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+"; // 2, 9, 3, 4, 2
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next(); //2
            correcto = n.matches(patron);// "2".matches(patron)   verdadero
            if (!correcto) { //falso
                System.out.println("ERROR: ENTRADA INCORRECTA");
            }
        } while (!correcto);//falso
        return Integer.parseInt(n); //"2" --> 2
    }

    public static double validarEntradaReal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+\\.[0-9]{1,2}";//    .
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next();
            correcto = n.matches(patron);// "2".matches(patron)   verdadero
            if (!correcto) { //falso
                System.out.println("ERROR: ENTRADA INCORRECTA");
            }
        } while (!correcto);//falso
        return Double.parseDouble(n);   // "1.23" ---> 1.23
    }

    public static String validarEntradaNombre(String mensaje) {
        Scanner sc = new Scanner(System.in);

        //Aqui ponemos el patron
        String patron = "[a-zA-ZñÑáéíóú]+";//numeros de 1 cifra, esto puede variar y poner lo que se busque
        boolean correcto;
        String n;

        do {
            System.out.println(mensaje);
            // next es para cadenas
            n = sc.next();
            //matches busca coincidencias
            correcto = n.matches(patron);//"2".matches(patron) verdadero

            if (!correcto) {
                System.out.println("Entrada Incorrecta");
            }

        } while (!correcto);
        return n;//devuelve la cadena

    }

    public static int[][] copiaMatriz(int[][] enteros) {
        int nf = enteros.length;
        int nc = enteros[0].length;
        int[][] copia = new int[nf][nc];
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                copia[i][j] = enteros[i][j];
            }
        }
        return copia;
    }

    public static void mostrar(int[][] enteros) {
        int nf = enteros.length;
        int nc = enteros[0].length;
        System.out.println("MOSTRAR MATRIZ");
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.printf("%4d", enteros[i][j]);
            }
            System.out.println();
        }
    }

}
