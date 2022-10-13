import os
import re


print("CONCATENAR CADENA")
os.system('cls')

s = 'Hola' + ' ' + 'Mundo'
print(s)

x = 1
s = 'Hola' + str(x) + 'Mundo'
print(s)

x = True
s = 'Hola' + str(x) + 'Mundo'
print(s)

print("MULTIPLICAR CADENA")

s = 'Hola' * 3
print(s)

print("AÑADIR CADENAS")
c = ''
s = 'walter '
c = c + s  #--> c = 'walter '
s = 'ismael'
c = c + s  #--> c = 'walterismael'
print(c)

# FORMAR UNA CADENA
lista = ['walter','ismael','sagastegui','lescano']
a = ''
for x in lista:
    a = a + x + ' '
print(type(lista),'  ', lista)
print(type(a),'  ',a)

print('CONVERTIR EN MAYUSCULA LA PRIMERA LETRA DE CADA PALABRA')

s = 'walter      ismael      sagastegui          lescano'
r = s.title()  
print(r)



def convertirMayuscula():
  print('EJEMPLO STEVEN')
  os.system('cls')
  texto = 'steven jesus delgado benavides'
  p = re.compile('[a-zA-Z]+')
  lista = p.findall(texto)
  print(lista)
  a = ''
  for x in lista:
    print(type(x))
    s = x.capitalize()
    a = a + s + " "
  print(a)

convertirMayuscula()



