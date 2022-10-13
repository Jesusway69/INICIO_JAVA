package metodos_instancia_static;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
       List<Ventana> ventanas_al = new ArrayList<Ventana>();
       
       ventanas_al.add(new Ventana());
       ventanas_al.add(new Ventana());
       ventanas_al.add(new Ventana());
       
       for(int i=0; i<ventanas_al.size(); i++) {
           Ventana x = ventanas_al.get(i);
           x.setVisible(true);
       }
    }

}
