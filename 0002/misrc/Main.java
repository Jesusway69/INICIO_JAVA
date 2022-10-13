package misrc;

public class Main {

    public static void main(String[] args) {
       //DEFINIR Y CREAR UN ARRAY DE ENTEROS
       int[] id = {1,2,3,4,5};
       //DEFINIR Y CREAR UN ARRAY DE CADENAS
       String[] nombre = {"Delly","Walmi","Walter","Arturo","Jose"};
       //DEFINIR Y CREAR UN ARRAY DE DE OBJETOS TIPO ALUMNO
       Alumno[] alumnos_a = new Alumno[id.length];
       //LLENAR EL ARRAY DE OBJETOS TIPO ALUMNO
       for(int i=0; i<id.length; i++) {
           alumnos_a[i] = new Alumno(id[i], nombre[i]);
       }
       //MOSTRAR LOS ATRIBUTOS DE CADA OBJETO GUARDADO EN EL ARRAY
       for(int i=0; i<id.length; i++) {
           System.out.println("Alumno " + (i+1) + ":");
           System.out.println("Id     = " + alumnos_a[i].getId());
           System.out.println("Nombre = " + alumnos_a[i].getNombre());
       }       
    }
}
