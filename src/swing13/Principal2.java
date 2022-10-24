package swing13;

import static swing13.Principal1.invertir;

public class Principal2 {

    public static void main(String[] args) {
        int[] vector = {0, 1, 2, 3, 4, 5, 6, 7, 8, 11, 12};
        int backup;

        for (int indice = 0; indice < vector.length; indice++) {

            backup = vector[indice];
            vector[indice] = vector[vector.length - 1 - backup];
            vector[vector.length - 1 - indice] = backup;

            System.out.print(vector[backup] + " ");
            //System.out.print(indice + "  \n");

        }

    }

}
