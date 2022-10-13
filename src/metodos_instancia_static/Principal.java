package metodos_instancia_static;

public class Principal {

    public static void main(String[] args) {
       AlumnoExtension a1 = new AlumnoExtension("A1","Luis",16,1.72,"Av. Ejercito 123");
    
       AlumnoExtension.cabecera();
       a1.cuerpo();
       System.out.println(a1.evaluarEdad());
    }

}
