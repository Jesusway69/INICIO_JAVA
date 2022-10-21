package vector;

public class Perfecto {

    public static void main(String[] args) {
        
        for(int i=2; i<=100; i++) {
            
            if(perfecto(i)) {
                System.out.println("PERFECTO " + i);
            }else {
               System.out.println("NO PERFECTO " + i); 
            }
            
        } 
    }
    
    public static boolean perfecto(int n) {
        int s = 0;
        for(int i=1; i<n; i++) {
            if(n%i==0) {
                s = s + i;
            }
        }
        if(n == s) {
            return true;
        }else {
            return false;
        }
    }
    
    
    

}
