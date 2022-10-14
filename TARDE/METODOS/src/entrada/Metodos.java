package entrada;

import java.util.Scanner;

public class Metodos {

    public static int validarEntradaEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]"; // 2, 9, 3, 4, 2
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
