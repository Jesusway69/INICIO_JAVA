package object;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import static object.Menu.clientes_hm;

public class Principal2 {

    public static void main(String[] args) {
        Map<Integer, String> personas_hm = new HashMap<>();

        personas_hm.put(3, "Silvia");
        personas_hm.put(2, "Miguel");
        personas_hm.put(1, "Luis");
        personas_hm.put(3, "Carlos");
        personas_hm.put(1, "Arturo");

        monstrarPersonas_3(personas_hm);
    }

    public static void mostrarPersonas_1(Map<Integer, String> personas_hm) {
        Iterator<Integer> clavesPersonas = personas_hm.keySet().iterator();
        while (clavesPersonas.hasNext()) {
            int clave = clavesPersonas.next();
            System.out.printf("%4d  %-8s\n", clave, personas_hm.get(clave));
        }
    }

    public static void mostrarPersonas_2(Map<Integer, String> personas_hm) {
        Iterator clavevalorPersonas = personas_hm.entrySet().iterator();
        while (clavevalorPersonas.hasNext()) {
            Map.Entry clavevalor = (Map.Entry) clavevalorPersonas.next();
            System.out.printf("%4d  %-8s\n", clavevalor.getKey(), clavevalor.getValue());
        }
    }

    public static void monstrarPersonas_3(Map<Integer, String> personas_hm) {
        Set<Integer> claves = personas_hm.keySet();
        for (int clave : claves) {
            String valor = personas_hm.get(clave);
            System.out.printf("%4d  %-8s\n",clave,valor);
        }
    }

}
/*
1     "Luis"
2     "Miguel"
3     "Carlos"



 */
