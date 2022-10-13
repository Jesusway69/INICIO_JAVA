import os
import re
os.system('cls')

def steven():
    lista = ['hola','*ssa','sadasd','adad11']
    patron = '[a-zA-ZñÑ]+'
    for i in lista:
        correcto = re.fullmatch(patron,i)
        if not correcto:
           print(i,'   ','no correcto')
        if correcto:
           print(i,'   ','correcto')

def otraforma():
    lista = ['hola','*ssa','sadasd','adad11', 'fasd=', 'niño','corazón']
    for cadena in lista:
        correcto = cadena.isalpha()
        if not correcto:
           print(cadena,'   ','no correcto')
        if correcto:
           print(cadena,'   ','correcto')  

otraforma()
