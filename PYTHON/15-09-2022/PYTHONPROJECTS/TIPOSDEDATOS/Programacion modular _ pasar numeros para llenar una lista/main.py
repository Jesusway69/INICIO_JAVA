import os
import random as r

def llenarlistaconpares(x,lista=[]):
    lista.append(x) 

os.system('cls')
# ENTRADA
lista = []
# PROCESO
for i in range(10): # i = 0 1 ... 9
    x = r.randint(1,6)
    if x % 2 == 0:
       llenarlistaconpares(x,lista)
    else:
       llenarlistaconpares(x)
# SALIDA
print(lista)

