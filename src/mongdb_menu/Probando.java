package mongdb_menu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Probando {

    public static void main(String[] args) {
        ArrayList<String> nombres_al = new ArrayList();
        nombres_al.add("Luis");
        nombres_al.add("Miguel");
        mostrar(nombres_al);

        LinkedList<String> nombres_lk = new LinkedList();
        nombres_lk.add("Luis");
        nombres_lk.add("Miguel");
        mostrar(nombres_lk);
    }

    public static void mostrar(List<String> lista) {
        for (String s : lista) {
            System.out.println(s);
        }

    }

}
