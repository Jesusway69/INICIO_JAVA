import os
import re

os.system('cls')

def entrada_cadena(mensaje):
    patron = '[a-zA-ZñÑáéíóú\s]+'
    while True:
        cadena = input(mensaje)
        correcto = re.fullmatch(patron, cadena)
        if not correcto:
            print("Error. Vuelva a ingresar la cadena")
            print()
        else:
            break
    return cadena

def comprobar():
    cadena = entrada_cadena("Ingrese la cadena? ").lower() # En caso que no importan las minúsculas o mayúscula, no case sensitive
    print()

    subcadena = entrada_cadena("Ingrese la subcadena? ").lower() 
    print()

    if cadena[0:len(subcadena)] == subcadena:
        print("La cadena empieza por la subcadena indicada")
    else:
        print("La cadena NO empieza por la subcadena indicada")

comprobar()
print()
