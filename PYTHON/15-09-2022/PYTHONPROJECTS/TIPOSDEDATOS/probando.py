import os
import re

def remplazar_cadena(cadena):
    patron = '[0-9]+'
    textomodificado = re.sub(patron, 'X', cadena)
    return textomodificado

os.system('cls')
s = 'hola3mun222do'
x = remplazar_cadena(s)
print(x)
'''
cadena = 'Hola Mundo'
r = ';'.join(reversed(cadena))
print(r)
'''