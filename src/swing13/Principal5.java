package swing13;

public class Principal5 {

    //
    public static void main(String[] args) {
        String cadena = "En     un   puerto          italiano        al  pie de    la montaña";
        
        
        String patron = "[\\s]{2,}";
        String corregir = cadena.replaceAll(patron, " ");
        System.out.println("Orginal  : " + cadena);
        System.out.println("Corregido: " + corregir);
    }

}
