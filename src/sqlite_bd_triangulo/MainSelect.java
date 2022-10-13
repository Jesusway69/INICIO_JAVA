package sqlite_bd_triangulo;

public class MainSelect {

    public static void main(String[] args) {
        if (OperacionesCrud.conexion != null) {
            if (OperacionesCrud.mostrar() == true) {
                System.out.println("OK: MOSTRAR");
            } else {
                System.out.println("ERROR: MOSTRAR");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

}
