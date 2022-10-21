package ejercicios;

public class CombinacioTomado2en2 {

    public static void main(String[] args) {

        int[] enteros = {8, 0, 1, 4, 5};
        for (int i = 0; i < enteros.length - 1; i++) {
            for (int j = i + 1; j < enteros.length; j++) {
                System.out.println(enteros[i] + "  " + enteros[j]);
            }
        }
        /*

   l = len(lista)-1
   for c1 in lista:
     for c2 in range(c1+1,lista[l]+1,1): 
         print (c1 ,' ', c2)
        
        
   lista = [1,2,3,4,5]
   pregunta1(lista)*/

    }

}
