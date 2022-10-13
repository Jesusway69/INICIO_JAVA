import os

os.system('cls')

def cuadrado(x):
    if type(x) is str:
       return int(x)*int(x)
    return x*x

def mostrar1(x):
    print('Cuadrado: ',x)

def mostrar2(x):
    print('Cuadrado: ',x)
    return 

def milista():
    lista = []
    lista.append(8)
    lista.append(3)
    return lista

y1 = cuadrado(5)
print('y1: ',type(y1), '  ',y1)
y2 = cuadrado(1.5)
print('y2: ',type(y2), '  ',y2)
y3 = cuadrado('5')
print('y3: ',type(y3), '  ',y3)

