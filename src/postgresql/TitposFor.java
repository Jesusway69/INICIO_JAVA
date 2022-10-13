package postgresql;

import java.util.*;

public class TitposFor {

    public static void main(String[] args) {
        System.out.println("RECORRER UN ARRAY UNIDIMENSIONAL");
        String[] cadenas = {"Luis", "Miguel", "Carlos", "María"};

        for (int i = 0; i < cadenas.length; i++) {
            String c = cadenas[i];
            System.out.println(c);
        }
        System.out.println();
        for (String c : cadenas) {
            System.out.println(c);
        }

        System.out.println("RECORRER UN ARRAYLIST");
        List<String> cadenas_al = new ArrayList<String>();
        cadenas_al.add("Luis");
        cadenas_al.add("Miguel");
        cadenas_al.add("Carlos");
        for (int i = 0; i < cadenas_al.size(); i++) {
            String c = cadenas_al.get(i);
            System.out.println(c);
        }
        System.out.println();
        for (String c : cadenas_al) {
            System.out.println(c);
        }

    }

}
