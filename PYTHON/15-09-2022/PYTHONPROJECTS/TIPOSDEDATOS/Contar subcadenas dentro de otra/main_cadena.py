import os
import util_entrada as e
import util_cadena as c

os.system('cls')

#ENTRADA
cadena = e.entradaCadena('Ingrese cadena? ')
subcadena = e.entradaCadena('Ingre subcadena a buscar? ')
#PROCESO
n = c.contar_subcadena_dentro_otra(cadena,subcadena)
#SALIDA
c.mostrar('Cantidad de veces encontro subcadena: ',n)