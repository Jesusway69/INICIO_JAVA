'''
# Mostrar el cuadrado y cubo de un número real.
Autor: Walter Ismael Sagástegui Lescano.
Fecha: 20/09/2022
'''

import os
from util import numeroReal, cuadrado, cubo, redondear, mostrar

os.system('cls')

#ENTRADA
x = numeroReal('Ingrese número real? ')
#PROCESO
cuadrado = cuadrado(x)
cubo = cubo(x)
#SALIDA
mostrar('Cuadrado: ',redondear(cuadrado,2))
mostrar('Cubo    : ',redondear(cubo,2))