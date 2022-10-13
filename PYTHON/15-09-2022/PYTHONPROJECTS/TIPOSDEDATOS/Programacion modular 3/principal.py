# El programa pedirá n números reales que se guardarán en una lista y luego serán procesados para generar otras dos listas con los cuadrados y cubos y finalmente se mostrará en pantalla de las dos listas resultantes.

import os
import util

os.system('cls')

#ENTRADA
n = util.numeroEntero('Cuantos números reales desea ingresar a su lista? ')
numerosreales_l = []
for i in range(n): #i = 0 1 2
    numerosreales_l.append(util.numeroReal('Ingrese numero real ' + str(i+1) + "? " ))
#PROCESO
cuadrados_l = []
cubos_l = []
for x in numerosreales_l:
    cuadrados_l.append(util.cuadrado(x))
    cubos_l.append(util.cubo(x))
#SALIDA
print('%10s  %10s' % ('CUADRADO','CUBO'))
print('%10s  %10s' % ('--------','----'))
for x2, x3 in zip(cuadrados_l,cubos_l):
    print('%10.2f  %10.2f' % (util.redondear(x2,2),util.redondear(x3,2)))

