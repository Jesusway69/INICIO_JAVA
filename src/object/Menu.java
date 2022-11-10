package object;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import static libreria.Entrada.*;
import static libreria.MiMenu.*;
import libreria.ConexionMysql;

public class Menu {

    static Connection conexion;
    static OperacionesCrud crud;
    static Map<Integer, Cliente> clientes_hm;

    public static void main(String[] args) {

        ConexionMysql c = new ConexionMysql("tiendarabanal");
        conexion = ConexionMysql.getConexion();
        crud = new OperacionesCrud(conexion);
        opcion1();

        do {
            cls();
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1. Restaurar original los objetos de la tabla cliente y ponerlos en un hashmap");
            System.out.println("2. Eliminar un cliente por la clave del hashmap");
            System.out.println("3. Actualizar un cliente del hashmap pero solo el nombre");
            System.out.println("4. Añadir un cliente en el hashmap");
            System.out.println("5. Mostrar todos los clientes en el hashmap");
            System.out.println("6. Actualizar la tabla cliente de la base de datos"); //PENDIENTE
            System.out.println("7. Crear un archivo html con los datos del cliente");

            System.out.println("0. Salir");

            int opcion = entradaNumeroEntero("Ingrese opcion? ");

            switch (opcion) {
                case 1:
                    cls();
                    opcion1();
                    pause();
                    break;
                case 2:
                    cls();
                    opcion2();
                    pause();
                    break;
                case 3:
                    cls();
                    opcion3();
                    pause();
                    break;
                case 4:
                    cls();
                    opcion4();
                    pause();
                    break;
                case 5:
                    cls();
                    opcion5();
                    pause();
                    break;
                case 6:
                    cls();
                    //opcion6();
                    pause();
                    break;

                case 7:
                    cls();
                    opcion7();
                    pause();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (true);

    }

    public static void opcion1() {
        System.out.println("1. Recuperar los objetos de la tabla cliente y ponerlos en un hashmap");
        System.out.println("---------------------------------------------------------------------");
        if (conexion != null) {
            if ((clientes_hm = crud.getHashMapClientes()) != null) {
                Collection<Cliente> clientes_c = clientes_hm.values();
                Cliente.cabecera();
                for (Cliente c : clientes_c) {
                    c.cuerpo();
                }
            } else {
                System.out.println("ERROR: HASHMAP VACIO");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public static void opcion2() {
        System.out.println("2. Eliminar un cliente por la clave del hashmap");
        System.out.println("-----------------------------------------------");
        int clave = entradaNumeroEntero("Ingrese clave a eliminar? ");
        if (clientes_hm.containsKey(clave)) {
            clientes_hm.remove(clave);
            monstrarClientes_2();
            System.out.println("OK: CLIENTE ELIMINADO");
        } else {
            System.out.println("ERROR: CLAVE NO EXISTE");
        }
    }

    public static void opcion3() {
        System.out.println("3. Actualizar un cliente del hashmap sólo el nombre");
        System.out.println("---------------------------------------------------");
        int clave = entradaNumeroEntero("Ingrese clave del cliente actualizar? ");
        if (clientes_hm.containsKey(clave)) {
            clientes_hm.get(clave).setNombre(entradaNombreYApellido("Ingrese nuevo nombre? "));
            monstrarClientes_2();
        } else {
            System.out.println("ERROR: CLAVE NO EXISTE");
        }
    }

    public static void opcion4() {
        System.out.println("4. Añadir un cliente en el hashmap");
        System.out.println("----------------------------------");
        int codigo = entradaNumeroEntero("Ingrese clave del cliente? ");
        if (clientes_hm.containsKey(codigo)) {
            System.out.println("ERROR: CLAVE YA EXISTE");
        } else {
            String nombre = entradaNombreYApellido("Ingrese nombre y apellido? ");
            String domicilio = entradaDomicilio("Ingrese domicilio? ");
            Cliente cliente = new Cliente(codigo, nombre, domicilio);
            clientes_hm.put(codigo, cliente);
            mostrarClientes_1();

        }
    }

    public static void opcion5() {
        System.out.println("5. Mostrar todos los clientes en el hashmap");
        System.out.println("-------------------------------------------");

        mostrarClientes_1();

    }

    public static void opcion7() {
        System.out.println("7. Crear un archivo html con los datos del cliente");
        System.out.println("--------------------------------------------------");
        FileOutputStream fos;
        PrintStream ps;
        try {
            fos = new FileOutputStream("data/cliente.html");
            ps = new PrintStream(fos);
            ps.println("<html><head><title>Cliente</title></head><body><center>DATOS DEL CLIENTE</center>");
            ps.println("<table border='1'>");
            ps.println("<thead><tr><th>CODIGO</th><th>NOMBRE</th><th>DOMICILIO</th></tr></thead>");
            ps.println("<tbody>");
            
            
            Collection<Cliente> clientes_c = clientes_hm.values();

            for (Cliente c : clientes_c) {
               
               ps.println("<tr><td>" + c.getCodigo() + "</td><td>" + c.getNombre() + "</td><td>" + c.getDomicilio() + "</td></tr>");

                
            }

     
            ps.println("</tbody></table>");
            ps.println("</body></html>");
            ps.close();

        } catch (Exception e) {
            System.out.println("ERROR: ESCRIBIR ARCHIVO HTML");
        }

    }

    public static void mostrarClientes_1() {
        Iterator<Integer> clavesClientes = clientes_hm.keySet().iterator();
        Cliente.cabecera();
        while (clavesClientes.hasNext()) {
            int clave = clavesClientes.next();
            Cliente c = clientes_hm.get(clave);
            c.cuerpo();
        }
    }

    public static void monstrarClientes_2() {
        Collection<Cliente> clientes_c = clientes_hm.values();
        Cliente.cabecera();
        for (Cliente c : clientes_c) {
            c.cuerpo();
        }
    }

}
