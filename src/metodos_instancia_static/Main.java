package metodos_instancia_static;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        int x = 5;
        Alumno a;
        Alumno a1 = new Alumno("A1","Luis",16,1.72);
        Alumno a2 = new Alumno("A2","Miguel",24,1.73);
        Alumno a3 = new Alumno("A3","Carlos",17,1.70);
        
        Alumno a4 = new Alumno();
        a4.setIdAlumno("A4");
        a4.setNombre("Carmen");
        a4.setEdad(21);
        a4.setEstatura(1.65);
        
        Alumno a5 = new Alumno("A5","",0,0.0);
        
        System.out.println("Instituto: " + Alumno.instituto);
        System.out.println("Nombre A1:" + a1.getNombre());
        
               
        Ventana v = new Ventana();
        v.setVisible(true);
        
        Alumno.cabecera();
        a1.cuerpo();
        a2.cuerpo();
        a3.cuerpo();
        a4.cuerpo();
        a5.cuerpo();
        
        System.out.println("Nombre Alumno A2:" + a2.getNombre());
        
        System.out.println("Evaluar Edad A1: " + a1.evaluarEdad() + " " + a1.getNombre());
        System.out.println("Evaluar Edad A2: " + a2.evaluarEdad() + " " + a2.getNombre());
    
        String[] lista = {"Luis","Miguel"};
        int longitud = lista.length;
        
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        alumnos_al.add(a1);
        alumnos_al.add(a2);
        alumnos_al.add(a3);
        alumnos_al.add(a4);
        alumnos_al.add(a5);
        
        for(int i=0; i<alumnos_al.size(); i++) {
            Alumno z = alumnos_al.get(i);
           System.out.println("Evaluar Edad: " + z.evaluarEdad() + " " + z.getNombre()); 
        }
    }

}
