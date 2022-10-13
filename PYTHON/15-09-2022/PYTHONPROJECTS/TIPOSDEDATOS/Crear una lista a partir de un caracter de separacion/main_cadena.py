import os
import util_entrada as e
import util_cadena as c

os.system('cls')

#ENTRADA
cadena = e.entradaCadena('Ingrese cadena? ')
caracterseparacion = e.entradaCadena('Ingrese caracter separación? ')
#PROCESO
palabras_l = c.crear_lista_por_caracter_separacion(cadena,caracterseparacion)
#SALIDA
c.mostrar('Lista palabras: ',palabras_l)