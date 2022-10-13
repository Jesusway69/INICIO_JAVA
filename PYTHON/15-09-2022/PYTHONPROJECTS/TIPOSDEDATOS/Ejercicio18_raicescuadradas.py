import os
import math

os.system('cls')

# Resolver una ecución cuadratica
# La función a implementar recibe los coeficientes a,b,c
# Retorna una tupla con los valores de las raices.

def obtener_raices(x):
    x1 = x2 = 0
    y = 0
    a = x[0]
    b = x[1]
    c = x[2]
    d = b**2 - 4*a*c
    if(d >= 0):
       x1 = (-b + math.sqrt(d))/(2*a)
       x2 = (-b - math.sqrt(d))/(2*a)
       y = 1
    else:
       y = 0
    return x1,x2,y

def mostrar(tupla):
    if(tupla[2] == 1):
       print("Raiz 1: ", tupla[0])
       print("Raiz 2: ", tupla[1])
    else:
       print("No tiene solución real")

# ENTRADA
tupla_abc = 5,19,2
# PROCESO
tuplax1_x2_b = obtener_raices(tupla_abc)
# SALIDA
mostrar(tuplax1_x2_b)

