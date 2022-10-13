********************
***   LIBRERIA   ***
********************

#util.py

import re

def cuadrado(x):
    return x*x

def cubo(x):
    return x*x*x

def mostrar(mensaje,x):
    print(mensaje,x)

def entradaReal(mensaje): # 3434 o 234.24
    patron = '[0-9]+||[0-9]+\.[0-9]{1,2}'
    while True:
          cadena = input(mensaje)
          correcto = re.fullmatch(patron,cadena)
          if not correcto:
             print("Error: Vuelva a ingresar el dato")
          else:
             break
    return float(cadena)
	
#main.py

import os
import util

os.system('cls')

# Mostrar el cuadrado de un número real.

#ENTRADA
y = util.entradaReal('Ingrese número real? ')
#PROCESO
c = util.cuadrado(y)
#SALIDA
util.mostrar('Cuadrado: ',c)




