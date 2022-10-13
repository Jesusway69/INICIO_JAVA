import os
import util_entrada as e
import util_cadena as c

os.system('cls')

#ENTRADA
y = e.entradaCadena('Ingrese cadena? ')
#PROCESO
cadenasinespacios = c.quitar_espacios_blanco(y)
caracteres_l = c.convertir_cadena_a_lista_libreria(cadenasinespacios)
#SALIDA
c.mostrar('Lista de caracteres: ',caracteres_l)
