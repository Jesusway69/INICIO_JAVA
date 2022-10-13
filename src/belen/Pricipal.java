package belen;

import tarea.ImplementacionTarea;
import tarea.MiClase;
import tarea.OtraClase;

public class Pricipal {

    public static void main(String[] args) {
         ImplementacionTarea it = new ImplementacionTarea();
         System.out.println("RC: " + it.raizcuadrada(10.5));
         
         
         MiClase mc = new MiClase();
         System.out.println("RC: " + mc.raizcuadrada(2.1));
         
         OtraClase oc = new OtraClase();
         System.out.println("RC: " + oc.raizcuadrada(3.1));
         
    }

}
