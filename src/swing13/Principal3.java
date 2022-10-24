package swing13;

public class Principal3 {

    public static void main(String[] args) {
        int[] x = {12, 3, 7, 8, 1};
        int[] y = x.clone();
        int aux = 0;

        for (int i = 0, j = x.length - 1; i < x.length / 2; i++, j--) {
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + "  ");
        }

    }

}
