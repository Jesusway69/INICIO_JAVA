package ejercicios;

public class CombinacionTomado4en4 {

    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 5};

        for (int i = 0; i < enteros.length - 3; i++) {
            for (int j = i + 1; j < enteros.length - 2; j++) {
                for (int z = j + 1; z < enteros.length - 1; z++) {
                    for (int w = z + 1; w < enteros.length; w++) {
                        System.out.println(enteros[i] + " " + enteros[j] + " " + enteros[z] + " " + enteros[w]);
                    }
                }
            }
        }
    }

}
