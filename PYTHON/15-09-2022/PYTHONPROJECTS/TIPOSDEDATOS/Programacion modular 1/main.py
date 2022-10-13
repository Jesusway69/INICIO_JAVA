'''
# Mostrar el cuadrado y cubo de un número real.
Autor: Walter Ismael Sagástegui Lescano.
Fecha: 20/09/2022
'''

import os
import util

os.system('cls')

#ENTRADA
x = util.entradaReal('Ingrese número real? ')
#PROCESO
cuadrado = util.cuadrado(x)
cubo = util.cubo(x)
#SALIDA
util.mostrar('Cuadrado: ',util.redondear(cuadrado,2))
util.mostrar('Cubo    : ',util.redondear(cubo,2))