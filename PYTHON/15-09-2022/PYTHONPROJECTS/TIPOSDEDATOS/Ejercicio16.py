# Recorrer una lista de números enteros: List = Array = Vector

import os
import re
os.system('cls')

def entradaEntero(mensaje):
    patron = "[0-9]+"
    snumero = ""
    while True:
          snumero = input(mensaje) 
          correcto = re.fullmatch(patron,snumero)
          if not correcto:
             print("Error vuelva a ingresar el dato")
          if correcto:
             break

    return int(snumero)

def ejemplo1():
    print('EJEMPLO 1') # Recorrer la lista y mostrar todos los elementos
    print('---------')
    lista = [8, 9, 3, 2, 6]
    for elemento in lista:
        print(elemento)

def ejemplo2():
    print('EJEMPLO 2') #Recorrer la lista y mostrar todos los números pares
    print('---------')
    lista = [8, 9, 3, 2, 6]
    for elemento in lista:
        if elemento % 2 == 0:
           print(elemento)

def ejemplo3():
    print('EJEMPLO 3') #Llenar la lista de números enteros
    print('---------')
    lista = []
    n = entradaEntero('Cuantos números desea ingresar? ') #5
    for elemento in range(n):
        entero = entradaEntero('Ingrese un entero? ')
        lista.append(entero)
    print(lista)

def ejemplo4(): #Formar una lista a partir de otra. Formar una lista sin duplicados
    lista = [8,2,1,9,4,5,4,3]
    sinduplicados = []
    for x in lista:
        if x not in sinduplicados:
           sinduplicados.append(x)
    print(lista)
    print(sinduplicados)

def ejemplo5(): #Formar una lista a partir deotra. Formar solo con los múmeros pares
    lista = [8,9,2,1,9,4,5,4,3]
    pares = []
    for a in lista:
        if a%2 == 0:
           pares.append(a)
    print(pares)

def ejemplo6(): # Sumar sólo los valore de tipo numerico(int, float)
    lista = [8,9,2,1,9,4,5,4,3]
    print(type(lista))
    lista = [8,1,'Arturo',True,False,1.5]
    s = 0
    for elemento in lista:
        if type(elemento) is int or type(elemento) is float:
           s = s + elemento
    print("Suma: ",s)

def ejemplo7(): # Por Valor y Por referencia
    a = 100
    b = 100
    x = a == b #True
    print(x)
    print(id(a))
    print(id(b))

    a = [1,2,3]
    b = [1,2,3]
    x = a == b #True
    y = a is b #False
    print(x)
    print(y)
    print(id(a))
    print(id(b))

def anadir(x,milista):
    milista.append(x)

def ejemplo8():
    lista = []
    anadir(5,lista)
    anadir(6,lista)
    print(lista)

def ejemplo9():
    lista = [1,8,2,9]
    lista2 = lista.copy()
    lista.sort()
    print(lista)
    print(lista2)

ejemplo7()




