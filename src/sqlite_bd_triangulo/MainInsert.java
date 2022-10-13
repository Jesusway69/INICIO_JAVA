package sqlite_bd_triangulo;

import libreria.Entrada;

public class MainInsert {
    
    public static void main(String[] args) {
        if (OperacionesCrud.conexion != null) {
            double cateto1 = Entrada.entradaNumeroReal("Ingrese cateto1? ");
            double cateto2 = Entrada.entradaNumeroReal("Ingrese cateto2? ");
            Triangulo t = new Triangulo(1,cateto1,cateto2);
            if(OperacionesCrud.insertar(t) == true) {
                System.out.println("OK: INSERTAR");
            }else {
                System.out.println("ERROR: INSERTAR");
            }
        }else {
            System.out.println("ERROR: CONEXION");
        }
    }



}
