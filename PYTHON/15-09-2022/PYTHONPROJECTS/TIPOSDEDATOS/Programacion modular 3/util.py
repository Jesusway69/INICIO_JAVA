import re

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

def cuadrado(x):
    return x*x

def cubo(x):
    return x*x*x

def redondear(x,n):
    return round(x,n)