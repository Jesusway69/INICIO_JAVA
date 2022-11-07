package mongdb_menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

    public static List<Empleado> getListaEmpleado() {
        List<Empleado> empleados_al = new ArrayList<>();

        empleados_al.add(new Empleado(1, "Jose", 35, 1200, new Direccion("Marconi", 123, "Trujillo"), "627254123", Arrays.asList("Lectura", "Gamer", "Geopolítica")));
        empleados_al.add(new Empleado(2, "Miguel", 40, 1200, new Direccion("Ejercito", 637, "Cadiz"), "658234129", Arrays.asList("Documentales", "Geopolítica", "Casino")));
        empleados_al.add(new Empleado(3, "Carlos", 35, 1100, new Direccion("América", 414, "Valencia"), "627234124", Arrays.asList("Cine", "Lectura", "Pasear")));
        empleados_al.add(new Empleado(4, "María", 25, 1000, new Direccion("Santa", 622, "Madrid"), "657234123", Arrays.asList("Coleccionar", "Geopolítica")));
        empleados_al.add(new Empleado(5, "Delly", 26, 1200, new Direccion("Union", 627, "Bilbao"), "657234123", Arrays.asList("Lectura", "Documentales", "Pasear")));
        empleados_al.add(new Empleado(6, "Susana", 28, 1100, new Direccion("Salaverry", 644, "Jaen"), "657234123", Arrays.asList("Cine", "Documentales", "Casino")));
        empleados_al.add(new Empleado(7, "Vanessa", 19, 1000, new Direccion("Prado", 337, "Burgos"), "657234123", Arrays.asList("Cine", "Música", "Lectura")));
        empleados_al.add(new Empleado(8, "Melissa", 50, 1500, new Direccion("San Fernando", 237, "Barcelona"), "657234123", Arrays.asList("Coleccionar", "Pintar")));
        empleados_al.add(new Empleado(9, "Carlos", 40, 1300, new Direccion("Goya", 345, "Granada"), "657234123", Arrays.asList("Cina", "Escribir")));
        empleados_al.add(new Empleado(10, "Sandra", 30, 1700, new Direccion("Santa", 343, ""), "657234123", Arrays.asList("Documentales", "Geopolítica")));
        empleados_al.add(new Empleado(11, "Arturo", 31, 1400, new Direccion("Vera Cruz", 697, "Almería"), "657234123", Arrays.asList("Documentales", "Pintar")));
        empleados_al.add(new Empleado(12, "Jose", 32, 1200, new Direccion("Pardo", 137, "Alicante"), "659234345", Arrays.asList("Documentales", "Geopolítica")));
        empleados_al.add(new Empleado(13, "Valentino", 40, 1300, new Direccion("Girasoles", 237, "Cordoba"), "657334129", Arrays.asList("Documentales", "Cine")));
        empleados_al.add(new Empleado(14, "Micaela", 42, 1300, new Direccion("Ejercito", 434, "Oviedo"), "657224128", Arrays.asList("Gamer", "Cine", "Farandula")));
        empleados_al.add(new Empleado(15, "Rosa", 23, 1000, new Direccion("Marconi", 298, "Bilbao"), "659234121", Arrays.asList("Pasear", "Lectura")));
        empleados_al.add(new Empleado(16, "María", 22, 1200, new Direccion("Union", 392, "Pamplona"), "657274127", Arrays.asList("Documentales", "Geopolítica")));
        empleados_al.add(new Empleado(18, "Javier", 35, 1100, new Direccion("Independencia", 248, "Zaragoza"), "657264126", Arrays.asList("Bailar", "Pasear")));
        empleados_al.add(new Empleado(19, "Arturo", 45, 1400, new Direccion("Gamarra", 189, "Burgos"), "657284128", Arrays.asList("Película", "Geopolítica")));
        empleados_al.add(new Empleado(20, "Lucía", 34, 1200, new Direccion("Orbegozo", 291, "Salamanca"), "657734127", Arrays.asList("Leer", "Documentales", "Geopolítica")));

        return empleados_al;
    }
}
