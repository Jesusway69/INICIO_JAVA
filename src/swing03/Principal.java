package swing03;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;

public class Principal {

    public static void main(String[] args) {
        List<Integer> enteros_al = new ArrayList<Integer>();
        enteros_al.add(5);
        enteros_al.add(3);
        enteros_al.add(1);
        for (int i = 0; i < enteros_al.size(); i++) {
            int x = enteros_al.get(i);
            System.out.println(x);
        }

        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        alumnos_al.add(new Alumno(1, "Luis"));
        alumnos_al.add(new Alumno(2, "Miguel"));
        alumnos_al.add(new Alumno(3, "Carlos"));
        for (int i = 0; i < alumnos_al.size(); i++) {
            Alumno x = alumnos_al.get(i);
            System.out.println(x);
        }

        List<JCheckBox> checkboxs_al = new ArrayList<JCheckBox>();

        List<Ventana1> ventanas_al = new ArrayList<Ventana1>();
        ventanas_al.add(new Ventana1());
        ventanas_al.add(new Ventana1());
        ventanas_al.add(new Ventana1());
        for (int i = 0; i < alumnos_al.size(); i++) {
            Ventana1 x = ventanas_al.get(i);
            x.setVisible(true);
        }
        
        char z = '+';
        String w = "hola";

    }

}
