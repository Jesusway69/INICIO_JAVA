package Probando;

public class Main {

    public static void main(String[] args) {
       Alumno a1 = new Alumno(1,"Luis",23);
       
       Alumno a2 = new Alumno();
       a2.setIdAlumno(2);
       a2.setNombre("Miguel");
       a2.setEdad(23);
       
       Alumno.cabecera();
       a1.cuerpo();
       a2.cuerpo();
       
       System.out.println("Hipotenusa: " + Matematica.hipotenusa(5,6));
    }

}

/*
CENTRO: CAMPUSFP

IDALUMNO NOMBRE EDAD  CENTRO
   1     Luis   23    CampusFP
   2     Miguel 22    CampusFP


HAY DOS TIPOS DE ATRIBUTOS PARA UNA CLASE
- Atributos de instancia
- Atributos de clase

HAY DOS TIPOS DE METODOS PARA UNA CLASE
- Métodos de instancia
- Métodos de clase

*/
