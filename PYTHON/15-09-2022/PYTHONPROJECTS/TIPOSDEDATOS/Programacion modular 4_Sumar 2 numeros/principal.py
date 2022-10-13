# Hacer un programa modular que pida 2 números reales y se proces para luego mostrar el resultado de la suma.

import os
import util

os.system('cls')

#ENTRADA
n1 = util.numeroReal('Ingrese número real 1? ')
n2 = util.numeroReal('Ingrese número real 2? ')
#PROCESO
s = n1 + n2
#SALIDA 
print("Suma: ", s)