package swing01;

import java.util.Scanner;

public class Prubas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//"ISO-8859-1"
        String patron = "[a-zA-ZáéíóúÑñ\\s]+";

        while (true) {
            System.out.print("Ingrese nombres y apellidos? ");
            String entrada = sc.nextLine();
            boolean correcto = entrada.matches(patron);
            if (correcto) {
                break;
            } else {
                System.out.println("Entrada Incorrecta");
            }
        }
        System.out.println("CORRECTO");
    }

}
