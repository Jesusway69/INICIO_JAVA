package swing13;

public class Principal4 {

    public static void main(String[] args) {
        //INVERTIR UNA CADENA
        String s = "Hola Mundo";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c + "");
        }

        char[] x = s.toCharArray();
        char aux = ' ';
        for (int i = 0, j = x.length - 1; i < x.length / 2; i++, j--) {
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
        }
        s = String.valueOf(x);
        System.out.println();
        System.out.println("Original : " + s);
        System.out.println("Invertida: " + s);
    }

}
