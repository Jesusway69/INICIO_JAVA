package swing12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controlador {

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

    public static List<Obrero> leer(String nra) {
        List<Obrero> obreros_al = new ArrayList<>();
        String fila = "";

        File f;
        FileReader fr;
        BufferedReader br;

        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            int i = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    String[] campo = fila.split(";");
                    //System.out.println(Arrays.asList(campo));
                    Obrero o = new Obrero(campo[0],
                            campo[1],
                            Integer.parseInt(campo[2]));
                    obreros_al.add(o);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA");
        }

        return obreros_al;
    }

    public static void escribir(List<Obrero> obreros_al) {
        File f = new File(Ventana.nra);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Obrero o : obreros_al) {
                bw.write(o.getIdObrero() + ";" + o.getNombre() + ";" + o.getCantidadHorasSemana() + "\n");
                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println("ERROR ESCRITURA");
        }
    }

}
