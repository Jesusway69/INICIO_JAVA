package unicode;

public class Principal1 {

    public static void main(String[] args) {
       //System.out.println("\u0411");
       
       for(int i=0x0410; i<=0x0474; i++) {
          // System.out.println((char)i + "\t" + i);
          System.out.printf("%3C  %h\n",(char)i,i);
       }
       
    }

}
