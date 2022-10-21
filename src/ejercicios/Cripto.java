package ejercicios;


public class Cripto {
    
    public static String monoGeneEncripta(String cadena) {
        char[] alfabeto  = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] sustituto = {'Z','C','Q','V','A','J','G','Ñ','W','N','F','B','U','M','R','H','I','O','D','Y','X','T','P','E','S','L','K'};
        char[] encriptado = new char[cadena.length()];
        cadena = cadena.toUpperCase();
        for(int i=0; i<cadena.length(); i++) {
            char x = cadena.charAt(i);
            for(int j=0; j<alfabeto.length; j++) {
                if(x == alfabeto[j]) {
                  encriptado[i] = sustituto[j];  
                  break;
                }
            }
        }
        return String.valueOf(encriptado);
    }
    
    public static String monoGeneDesencripta(String cadena) {
        char[] alfabeto  = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] sustituto = {'Z','C','Q','V','A','J','G','Ñ','W','N','F','B','U','M','R','H','I','O','D','Y','X','T','P','E','S','L','K'};
        char[] encriptado = new char[cadena.length()];
        cadena = cadena.toUpperCase();
        for(int i=0; i<cadena.length(); i++) {
            char x = cadena.charAt(i);
            for(int j=0; j<sustituto.length; j++) {
                if(x == sustituto[j]) {
                  encriptado[i] = alfabeto[j];  
                  break;
                }
            }
        }
        return String.valueOf(encriptado);
    }
    
    public static void main(String[] args) {
        String encriptado = monoGeneEncripta("CASA");
        String desencriptado = monoGeneDesencripta(encriptado);
        System.out.println("Encripto : " + encriptado);
        System.out.println("DEncripto: " + desencriptado);
    }
}
