package metodos_resumen;

import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Bienvenido a Java");

        int x = 5;           //Integer.java
        double y = 5.0;      //Double.java
        String z = "Hola";   //String
        boolean w = true;    //Boolean
        char t = '?';        //Character
        {
            System.out.println("CLASE: INTEGER");
            System.out.println("--------------");

            // METODO DE CLASE
            int numero_decimal_int = 10;
            String numero_binario_str = Integer.toBinaryString(numero_decimal_int); // Convierte un número decimal int a numero binario str
            System.out.println("Método de Clase 1: " + numero_binario_str);

            int numero_int1 = 5;
            String numero_str1 = Integer.toString(numero_int1); // Convierte un número int a número String
            System.out.println("Método de Clase 2: " + numero_str1);

            String numero_str2 = "30";
            int numero_int2 = Integer.parseInt(numero_str2); // Convierte un número String a un número int
            System.out.println("Método de Clase 3: " + (numero_int2 * 2));

            // METODO DE INTANCIA(OBJETO)
            Integer a = 5;
            String b = a.toString();
            System.out.println("Método de Instancia 1: " + b);
        }

        {
            System.out.println("CLASE: STRING");
            System.out.println("-------------");
            //METODOS DE CLASE
            int a = 5;
            String b = String.valueOf(a);
            System.out.println("Método de Clase 1: " + b);
            char[] lista_letras = {'H', 'o', 'l', 'a'};
            String cadena1 = String.valueOf(lista_letras);
            System.out.println("Método de Clase 2: " + cadena1);
            String cadena2 = String.valueOf(lista_letras, 1, 2);
            System.out.println("Método de Clase 3: " + cadena2);
            //METODOS DE INSTANCIA(OBJETO)
            //String c = "   5   ".trim();
            String c = "   5   ";
            int d = Integer.parseInt(c.trim());
            System.out.println("Método de Instancia 1: " + d);
            String cadena3 = "Luis Ledezma";
            String subcadena1 = cadena3.substring(5, 12);
            System.out.println("Método de Instancia 2: " + subcadena1);
            String subcadena2 = cadena3.substring(5, cadena3.length());
            System.out.println("Método de Instancia 3: " + subcadena2);
            String patron1 = "[aeiouáéíóúAEIOU]";
            String x1 = "k";
            boolean r1 = x1.matches(patron1);
            System.out.println("Método de Instancia 4: " + r1);
            String patron2 = "(Luis|Carlos)";
            String x2 = "Carlos1";
            boolean r2 = x2.matches(patron2);
            System.out.println("Método de Instancia 5: " + r2);

            String cadena4 = "En un puerto italiano al pie de la montaña";
            int a4 = cadena4.indexOf("puerto", 6);
            System.out.println("Método de Instancia 6: " + a4);

            String password1 = "axyz";
            String password2 = "AXYZ";
            System.out.println("Método de Instancia 7: " + password1.equals(password2));
            System.out.println("Método de Instancia 8: " + password1.equalsIgnoreCase(password2));

            String palabra2 = "A1turo"; //65
            String palabra1 = "Angel"; //67
            System.out.println("Método de Instancia 9: " + palabra1.compareTo(palabra2)); //-2
            if (palabra1.compareTo(palabra2) > 0) {
                System.out.println(palabra1 + " es despúes que " + palabra2);
            } else {
                System.out.println(palabra2 + " es despúes que " + palabra1);
            }

            String cadena5 = "En un puerto italiano al pie de la montaña";
            char r5 = cadena5.charAt(0);
            System.out.println("Método de Instancia 10: " + r5);
            for (int i = 0; i < cadena5.length(); i++) {
                System.out.println(cadena5.charAt(i));
            }

            String cadena6 = "";
            //String cadena6 = null; // Esto no es una cadena vacia
            boolean r6 = cadena6.isEmpty();
            System.out.println("Método de Instancia 11: " + r6);

            String cadena7 = "En un puerto italiano al pie de la montaña";
            String r7 = cadena7.replace('o', 'x');
            System.out.println("Método de Instancia 12: " + r7);

            String cadena8 = "En     un      puerto      italiano     al  pie     de la montaña";
            //String patron8 = "[\\s]+";
            String patron8 = "[\\s]{2,}";
            String r8 = cadena8.replaceAll(patron8, " ");
            System.out.println("Método de Instancia 13: " + r8);

            String cadena9 = "A1;Luis;23;1.72";
            String[] r9 = cadena9.split(";");
            System.out.println("Método de Instancia 14: " + Arrays.asList(r9));
            for (int i = 0; i < r9.length; i++) {
                System.out.println(r9[i]);
            }

            System.out.println("CLASE: ARRAYS");
            System.out.println("-------------");

            Integer[] listaOriginal1 = {7, 1, 0, 8, 2, 4};
            Arrays.sort(listaOriginal1);
            System.out.println("Método de Clase 1: " + Arrays.asList(listaOriginal1));
            for (int i = 0; i < listaOriginal1.length; i++) {
                System.out.println(listaOriginal1[i]);
            }

            String[] listaOriginal = {"Zapato", "Armario", "Mesa", "Calzado"};
            String[] listaOriginal2 = listaOriginal.clone();
            Arrays.sort(listaOriginal2);
            System.out.println("Método de Clase 2: " + Arrays.asList(listaOriginal2));
            System.out.println("Método de Clase 3: " + Arrays.asList(listaOriginal));

        }

    }

}
