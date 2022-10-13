import os
import util_entrada as e
import util_cadena as c

os.system('cls')

#ENTRADA
cadena = e.entradaCadena('Ingrese cadena? ')
#SALIDA
c.recorrer_cadena_indice(cadena)
