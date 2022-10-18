package misrc;

import entrada.Metodos;


public class Principal {

    public static void main(String[] args) {
       Metodos m = new Metodos();
       String nombre = m.validarEntradaNombre("Ingresar Nombre? ");
       System.out.println("Nombre: " + nombre);
    }

}
