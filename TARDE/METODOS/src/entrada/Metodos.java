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

}
