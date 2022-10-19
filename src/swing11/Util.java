package swing11;

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

}
