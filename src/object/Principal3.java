package object;

import java.util.HashMap;
import java.util.Map;

public class Principal3 {

    static Map<String, Object> alumnos_hm = new HashMap<>();

    public static void main(String[] args) {

        alumnos_hm.put("idAlumno", 1);
        alumnos_hm.put("nombre", "Luis");
        alumnos_hm.put("edad", 24);
        alumnos_hm.put("estatura", 1.72);
        alumnos_hm.put("casado", true);

        System.out.println("Edad     : " + buscarPorClave("edad"));
        System.out.println("Casado   : " + buscarPorClave("casado"));
        System.out.println("Estarura : " + buscarPorClave("estatura"));

    }

    public static Object buscarPorClave(String clave) {
        return alumnos_hm.get(clave);
    }

}

/* clave      valor
"idAlumno"    1
"nombre"      "Luis"
"edad"        24
"estatura"    1.72
"casado"      true
 */
