package ejercicios;

public class CombinacionTomado3en3 {

    public static void main(String[] args) {
        int[] enteros = {1,2,3,4,5};

        for (int i = 0; i < enteros.length - 2; i++) {
            for (int j = i + 1; j < enteros.length - 1; j++) {
                for (int z = j + 1; z < enteros.length; z++) {
                    System.out.println(enteros[i] + " " + enteros[j] + " " + enteros[z]);
                }
            }
        }

    }

}
