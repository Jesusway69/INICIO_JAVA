package ejercicio3_22;

public class Principal {

    public static void main(String[] args) {
       int[] nprimos = {1,3,5,7,11,13};//0,1,2,3,4,5
       
       for(int i=0; i<10; i++) {
           int n1 = nprimos[aleatorio()];
           int n2 = nprimos[aleatorio()];
           if(Math.abs(n1-n2) == 2) {
              System.out.println(n1 + "  " + n2 + "   S");
           }else {
              System.out.println(n1 + "  " + n2 + "   N");
           }
       }
    }
    
    public static int aleatorio() {
        int x = (int)(Math.random()*6);
        return x;
    }

}
