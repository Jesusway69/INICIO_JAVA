package swing11;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static boolean existe(String idObrero) {
        boolean existe = false;
        for (Obrero o : Ventana.obreros_al) {
            if (o.getIdObrero().equalsIgnoreCase(idObrero)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            return false;
        } else {
            return true;
        }

    }

    public Obrero getObreroMayorSueldo1() {
        double mayorSueldo = -99999;
        Obrero o1 = null;
        for (Obrero o : Ventana.obreros_al) {
            if (o.getSueldo() > mayorSueldo) {
                mayorSueldo = o.getSueldo();
                o1 = o;
            }
        }
        return o1;
    }

    public static List<Obrero> getObreroMayorSueldo2() {
        List<Obrero> obreros_al = new ArrayList<Obrero>();
        double mayorSueldo = -99999;
        Obrero o1 = null;
        for (Obrero o : Ventana.obreros_al) {
            if (o.getSueldo() > mayorSueldo) {
                mayorSueldo = o.getSueldo();
            }
        }
        for (Obrero o : Ventana.obreros_al) {
            if (o.getSueldo() == mayorSueldo) {
                obreros_al.add(o);
            }
        }
        return obreros_al;
    }

    public static double sumarSueldos() {
        double sueldos = 0;
        for (Obrero o : Ventana.obreros_al) {
            sueldos = sueldos + o.getSueldo();
        }
        return sueldos;
    }

    public static List<Obrero> getObreroMenorHorasTrabajadasSemana() {
        double menor = 999999;
        List<Obrero> obreros_al = new ArrayList<Obrero>();
        for (Obrero o : Ventana.obreros_al) {
            if (o.getCantidadHorasSemana() < menor) {
                menor = o.getCantidadHorasSemana();
            }
        }
        for (Obrero o : Ventana.obreros_al) {
            if (o.getCantidadHorasSemana() == menor) {
                obreros_al.add(o);
            }
        }
        return obreros_al;
    }

    public static List<Obrero> getObreroMayorHorasExtras() {
        double mayor = -999999;
        List<Obrero> obreros_al = new ArrayList<Obrero>();
        for (Obrero o : Ventana.obreros_al) {
            if (o.getHorasExtras() > mayor) {
                mayor = o.getHorasExtras();
            }
        }
        for (Obrero o : Ventana.obreros_al) {
            if (o.getHorasExtras() == mayor) {
                obreros_al.add(o);
            }
        }
        return obreros_al;
    }

}
