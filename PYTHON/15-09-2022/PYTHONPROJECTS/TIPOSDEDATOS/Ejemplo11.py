# Validar la entrada de números enteros con expresiones regulares
# Sumar 2 números ingresados por teclado

import re
import os

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

def entradaReal(mensaje):
    patron = "([0-9]+\\.[0-9]+)||[0-9]+"
    snumero = ""
    while True:
          snumero = input(mensaje) 
          correcto = re.fullmatch(patron,snumero)
          if not correcto:
             print("Error vuelva a ingresar el dato")
          if correcto:
             break

    return float(snumero)

def entradaNombre(mensaje):
    patron = "[a-zA-ZÑáéíóú]+" 
    nombre = ""
    while True:
          nombre = input(mensaje) 
          correcto = re.fullmatch(patron,nombre) #True
          if not correcto:
             print("Error vuelva a ingresar el dato")
          if correcto:
             break
    return nombre

def entradaLogico(mensaje):
    patron = "[True|False]+" 
    logico = ""
    while True:
          logico = input(mensaje) 
          correcto = re.fullmatch(patron,logico)
          if not correcto:
             print("Error vuelva a ingresar el dato")
          if correcto:
             break

    return bool(logico)

def main():
    os.system('cls')
    nombre = entradaLogico('Ingrese valor logico? ')
    # ENTRADA
    n1 = entradaReal('Ingrese numero real 1? ')
    n2 = entradaReal('Ingrese numero real 2? ')
    # PROCESO
    s = n1 + n2
    # SALIDA
    print("Suma:",s)

main()

