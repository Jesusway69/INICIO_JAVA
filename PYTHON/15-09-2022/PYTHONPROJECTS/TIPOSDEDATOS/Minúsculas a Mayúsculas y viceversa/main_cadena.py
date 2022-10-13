import os
import util_entrada as e
import util_cadena as c

os.system('cls')

#ENTRADA
y = e.entradaCadena('Ingrese cadena? ')
#PROCESO
r = c.convertir_minuscula_mayuscula(y)
#SALIDA
c.mostrar('Convertir minuscula a mayusculas y viceversa: ',r)