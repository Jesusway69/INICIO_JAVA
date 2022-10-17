package swing07;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

public class Principal {

    public static void main(String[] args) {
        //int[] nprimos = {1, 3, 5, 7, 11, 13};//0,1,2,3,4,5
        //for (int i = 0; i < 10; i++) {
        
        MiVentana v = new MiVentana();
        JTextArea ta = v.getTextArea();

        for (int i = 0; i < 10000; i++) {
            int n1 = (int) nprimos().get(aleatorio());
            int n2 = (int) nprimos().get(aleatorio());

            if (Math.abs(n1 - n2) == 2) {
                System.out.println(n1 + "  " + n2 + "   S");
                
                String x1 = String.format("%4d  %4d  %4s\n", n1,n2,"S");
                
                ta.append(x1);
            } else {
                System.out.println(n1 + "  " + n2 + "   N");
                String x2 = String.format("%4d  %4d  %4s\n", n1,n2,"N");
                ta.append(x2);
            }
        }

        /*
      List<Integer> n_primos =  nprimos(); //0,1,2...24
      for(int i=0; i<n_primos.size(); i++) {
          System.out.println(n_primos.get(i));
      }
      System.out.println("Tamaño: " + n_primos.size());
         */
    }

    public static int aleatorio() {
        int x = (int) (Math.random() * 25);
        return x;
    }

    public static List<Integer> nprimos() {
        int n = 100;
        List<Integer> n_primos = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {

            if (esPrimo(i)) {
                n_primos.add(i);
                //System.out.println(i);
            }
        }

        return n_primos;
    }

    public static boolean esPrimo(int n) {
        int i = 2;
        boolean primo = true;
        while ((primo == true) && (i != n)) {
            if (n % i == 0) {
                primo = false;
            }
            i++;
        }
        return primo;
    }

}
