import os
import re

os.system('cls')

def validar():
    #patron = '[a-zA-ZñÑ\s]+' # CORRECTO
    #patron = '[a-zA-ZñÑ]+\s+[a-zA-ZñÑ]+\s+[a-zA-ZñÑ]+' 
    #patron = '[a-zA-Z\s]{2,}' # CORRECTO
    #patron = '([a-zA-Z]+\s){4}'
    patron = '[a-zA-Z0-9\_]+@hotmail\.com'
    while True:
          cadena = input('Ingrese cadena? ')
          correcto = re.fullmatch(patron, cadena)
          if not correcto:
             print('Error: Vuelva a ingresar la cadena')
          if correcto:
             break
    print('OK')

def buscarPalabras():
    #texto = 'Hola 1234 como estas 345  tengo 23'
    #p = re.compile('[0-9]+')
    #texto = 'Hola .3 como estas 1.3 tengo 4.4 espero 234.3'
    #p = re.compile('[0-9]*\.[0-9]')
    texto = 'Holaaa .3 como estaaaas 1.3 tengo 4.4 espero 234.3 casa' # Recuperar las secuencias de a
    p = re.compile('a+')
    lista = p.findall(texto)
    print(lista)

def remplazarPalabras():
    #texto = 'Hola 1234 como estas 345  tengo 23'
    #patron = '[0-9]+'
    #texto = 'Hola .3 como estas 1.3 tengo 4.4 espero 234.3'
    #patron = '[0-9]*\.[0-9]'
    texto = 'Holaaa .3 como estaaaas 1.3 tengo 4.4 espero 234.3 casa' # Recuperar las secuencias de a
    patron = 'a+'
    textomodificado = re.sub(patron, 'a', texto)
    print(textomodificado)

remplazarPalabras()
