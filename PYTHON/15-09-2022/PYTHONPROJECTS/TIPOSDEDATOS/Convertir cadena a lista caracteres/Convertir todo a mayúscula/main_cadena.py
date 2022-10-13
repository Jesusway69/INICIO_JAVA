import os
import util_entrada as e
import util_cadena as c

os.system('cls')

print("LIBRERIA")
#ENTRADA
y = e.entradaCadena('Ingrese cadena? ')
#PROCESO
caracteres_l = c.convertir_cadena_a_lista_libreria(y)
#SALIDA
c.mostrar('Lista de caracteres: ',caracteres_l)
print("ALGORITMO")
#ENTRADA
y = e.entradaCadena('Ingrese cadena? ')
#PROCESO
caracteres_l = c.convertir_cadena_a_lista_algoritmo(y)
#SALIDA
c.mostrar('Lista de caracteres: ',caracteres_l)