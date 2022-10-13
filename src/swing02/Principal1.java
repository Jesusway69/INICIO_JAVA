package swing2;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
       List<Ventana> ventanas_al = new ArrayList<Ventana>();
       
       Ventana v1 = new Ventana();
       Ventana v2 = new Ventana();
       Ventana v3 = new Ventana();
       
       ventanas_al.add(v1);
       ventanas_al.add(v2);
       ventanas_al.add(v3);
       
       for(int i=0; i<ventanas_al.size(); i++) {
           Ventana x = ventanas_al.get(i);
           x.setVisible(true);
       }
    }

}
