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

def entrada(numerosreales_l):
    n1 = numeroReal('Ingrese número real 1? ')
    n2 = numeroReal('Ingrese número real 2? ')
    numerosreales_l.append(n1)
    numerosreales_l.append(n2)

def proceso(numerosreales_l, suma_l):
    suma_l.append(numerosreales_l[0]+numerosreales_l[1])

def salida(suma_l):
    print('Suma: ', suma_l[0])