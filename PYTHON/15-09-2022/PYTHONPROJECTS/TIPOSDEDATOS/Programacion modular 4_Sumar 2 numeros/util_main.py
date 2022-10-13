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

def redondear(x,n):
    return round(x,n)

def entrada():
    n1 = numeroReal('Ingrese número real 1? ')
    n2 = numeroReal('Ingrese número real 2? ')
    return n1,n2

def proceso(n1,n2):
    return (n1+n2)

def salida(s):
    print('Suma: ',redondear(s,2))