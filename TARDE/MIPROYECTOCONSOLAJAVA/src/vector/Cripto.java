package vector;

import libreria.Metodos;

public class Cripto {
    
    public static String encriptar(String cadena) { // HOLA   
        char[] alfabeto =  {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] sustituir = {'Z','C','Q','V','A','J','G','Ñ','W','N','F','B','U','M','R','H','I','O','D','Y','X','T','P','E','S','L','K'};
        cadena = cadena.toUpperCase();
        char[] encriptado = new char[cadena.length()];
        for(int i=0; i<cadena.length(); i++) {
            char x = cadena.charAt(i);
            for(int j=0; j<alfabeto.length; j++) {
                if(x == alfabeto[j]) {
                   encriptado[i] = sustituir[j]; 
                }
            }
        }
        return String.valueOf(encriptado);
    }
 
    public static String desencriptar(String cadena) { // HOLA   
        char[] alfabeto =  {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] sustituir = {'Z','C','Q','V','A','J','G','Ñ','W','N','F','B','U','M','R','H','I','O','D','Y','X','T','P','E','S','L','K'};
        cadena = cadena.toUpperCase();
        char[] desencriptar = new char[cadena.length()];
        for(int i=0; i<cadena.length(); i++) {
            char x = cadena.charAt(i);
            for(int j=0; j<sustituir.length; j++) {
                if(x == sustituir[j]) {
                   desencriptar[i] = alfabeto[j]; 
                }
            }
        }
        return String.valueOf(desencriptar);
    }

    public static void main(String[] args) {
       String cadena = Metodos.validarEntradaNombre("Ingrese cadena? ");
       String encriptado = encriptar(cadena);
       String desencriptado = desencriptar(encriptado);
       System.out.println("Encriptado   : " + encriptado);
       System.out.println("Desencriptado: " + desencriptado);
    }

}
