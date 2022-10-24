package swing13;

public class Principal1 {

    public static void main(String[] args) {
        int[] x = {2, 3, 7, 8, 1};
        
        invertir(x);
        
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

    }

    public static void invertir(int[] x) {
        for (int i = 0; i <= (x.length / 2); i++) {
            for (int j = (x.length - 1); j >= (x.length / 2); j--) {
                int y = x[i];
                int z = x[j];
                x[i] = z;
                x[j] = y;
                i++;
            }
        }

    }

}
