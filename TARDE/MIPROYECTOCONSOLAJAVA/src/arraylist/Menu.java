package arraylist;

import static entrada.Metodos.validarEntradaEntero;
import java.io.IOException;

public class Menu {

    public static void main(String[] args) {

        do {

            cls();
            System.out.println("1. Mostrar");
            System.out.println("2. Buscar por su id");
            System.out.println("3. Eliminar por su id");
            System.out.println("4. Actualizar");
            System.out.println("0. Salir");

            int opcion = validarEntradaEntero("Ingrese opción? ");

            switch (opcion) {
                case 1:
                    mostrar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    actualizar();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static void mostrar() {
        cls();
        System.out.println("1. MOSTRAR");
        pause();

    }

    public static void buscar() {
        cls();
        System.out.println("2. BUSCAR");
        pause();
    }

    public static void eliminar() {
        cls();
        System.out.println("3. ELIMINAR");
        pause();
    }

    public static void actualizar() {
        cls();
        System.out.println("1. ACTUALIZAR");
        pause();
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
