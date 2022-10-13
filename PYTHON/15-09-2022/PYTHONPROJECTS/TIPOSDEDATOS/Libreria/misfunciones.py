# Definir una función que me retorne el número aleatorio de un dado (1,2,3,4,5,6)

import random
import re
import os
import numpy

def dado():
    return random.randint(1,6) # [1,6]

def aleatorio10_20():
    return random.randint(10,20)

def numeroReal(mensaje): # 3434 o 234.24
    patron = '[0-9]+||[0-9]+\.[0-9]{1,2}'
    while True:
          cadena = input(mensaje)
          correcto = re.fullmatch(patron,cadena)
          if not correcto:
             print("Error: Vuelva a ingresar el dato")
          else:
             break
    return float(cadena)

def entradaCadena(mensaje): # letras del alfabeto
    patron = '[a-zA-ZñÑáéíóúÁÉÍÓÚ\s]+'
    while True:
          cadena = input(mensaje)
          correcto = re.fullmatch(patron,cadena)
          if not correcto:
             print("Error: Vuelva a ingresar el dato")
          else:
             break
    return cadena

def entradaNombre(mensaje): # letras del alfabeto
    patron = '[a-zA-ZñÑáéíóúÁÉÍÓÚ]+'
    while True:
          cadena = input(mensaje)
          correcto = re.fullmatch(patron,cadena)
          if not correcto:
             print("Error: Vuelva a ingresar el dato")
          else:
             break
    return cadena

def numeroEntero(mensaje): 
    patron = '[0-9]+'
    while True:
          cadena = input(mensaje)
          correcto = re.fullmatch(patron,cadena)
          if not correcto:
             print("Error: Vuelva a ingresar el dato")
          else:
             break
    return int(cadena)  

def fecha(mensaje):  # dd/mm/aaaa  
    patron = '[0-9]{2}/(01|02|03|04|05|06|07|08|09|10|11|12)/[0-9]{4}'
    while True:
          cadena = input(mensaje)
          correcto = bool(re.fullmatch(patron,cadena)) and fechaCorrecta(cadena)
          if not correcto:
             print("Error: Vuelva a ingresar el dato")
          else:
             break
    return cadena

def fechaCorrecta(cadena):
    parte = cadena.split('/')   
    anio = int(parte[2])
    diasxmes_d = {'01': '31', '03': '31', '04': '30', '05': '31',
                      '06': '30', '07': '31', '08': '31', '09': '30', '10': '31', '11': '30', '12': '31'}
    
    if ((anio % 4 == 0) and ((anio % 100 != 0) or (anio % 400 == 0))):
        diasxmes_d['02']='29'
    else:
        diasxmes_d['02']='28'

    if int(parte[0]) >= 1 and int(parte[0]) <= int(diasxmes_d[parte[1]]):
        return True
    else:
        return False









