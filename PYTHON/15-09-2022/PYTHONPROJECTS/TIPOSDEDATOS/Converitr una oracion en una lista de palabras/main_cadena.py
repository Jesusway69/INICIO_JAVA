import os
import util_entrada as e
import util_cadena as c

os.system('cls')

#ENTRADA
oracion = e.entradaCadena('Ingrese oración? ')
#PROCESO
palabras_l = c.convertir_oracion_a_lista_palabras(oracion)
#SALIDA
c.mostrar('Lista de palabras: ',palabras_l)
