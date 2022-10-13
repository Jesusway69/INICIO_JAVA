import os

os.system('cls')

print('EJEMPLO 0001')
print('------------')

entero = 3
real   = 3.0
logico = True

print('Entero: ',entero,'  ', type(entero))
print('Real  : ',real  ,'  ', type(real))
print('Logico: ',logico,'  ', type(logico))

print('EJEMPLO 0002')
print('------------')

lista       = [1,2,3]
tupla       = (1,2,3)
cadena      = "123"
rango       = (1,4,1) 
conjunto    = {1,2,3}
diccionario = {'uno':1,'dos':2,'tres':3}

print('Lista      : ', lista         , '  ', type(lista))         
print('Tupla      : ', tupla         , '  ', type(tupla))         
print('Cadena     : ', cadena        , '  ', type(cadena))        
print('Rango      : ', rango         , '  ', type(rango)) 
print('Conjunto   : ', conjunto      , '  ', type(conjunto))
print('Diccionario: ', diccionario   , '  ', type(diccionario))

print('EJEMPLO 0003')
print('------------')

lista       = [1,2,3]
tupla       = (1,2,3)
cadena      = "123"
rango       = (1,4,1) 
conjunto    = {1,2,3}
diccionario = {'uno':1,'dos':2,'tres':3}

print('Lista      : ', lista         , '  ', len(lista))         
print('Tupla      : ', tupla         , '  ', len(tupla))         
print('Cadena     : ', cadena        , '  ', len(cadena))        
print('Rango      : ', rango         , '  ', len(rango)) 
print('Conjunto   : ', conjunto      , '  ', len(conjunto))
print('Diccionario: ', diccionario   , '  ', len(diccionario))

print('EJEMPLO 0004')
print('------------')

lista       = [1,2,3]
tupla       = (1,2,3)
cadena      = "123"
rango       = (1,4,1) 
conjunto    = {1,2,3}
diccionario = {'uno':1,'dos':2,'tres':3}

print('Lista      : ', lista         , '  ', lista[2])         
print('Tupla      : ', tupla         , '  ', tupla[2])       
print('Cadena     : ', cadena        , '  ', cadena[2])      
print('Rango      : ', rango         , '  ', rango[2])
#print('Conjunto   : ', conjunto      , '  ', conjunto[2]) # No se puede acceder por index
#print('Diccionario: ', diccionario   , '  ', diccionario[2]) # No se puede acceder por index

print('EJEMPLO 0005')
print('------------')

sAlumno = 'A1;Luis;23;1.72'
partes_lstr = sAlumno.split(';')
sIdAlumno = partes_lstr[0]
sNombre = partes_lstr[1]
sEdad = partes_lstr[2]
sEstatura = partes_lstr[3]

print("Cadena        : ", sAlumno) 
print("Lista Cadenas : ", partes_lstr)
print("%5s  %5s  %5s  %5s\n" % (sIdAlumno,sNombre,sEdad,sEstatura))

print('EJEMPLO 0006')
print('------------')

cadena1 = 'Hola'
cadena2 = cadena1[::-1]
print('Cadena 1: ', cadena1)
print('Cadena 2: ', cadena2)

print('EJEMPLO 0007')
print('------------')

vocales1_ls = ['a','e','i','o','u']
vocales2_ls = list(reversed(vocales1_ls))
print('Vocales 1: ',vocales1_ls)
print('Vocales 2: ',vocales2_ls)

print('EJEMPLO 0008')
print('------------')

sCadena = 'Hola'
letras_ls = list(sCadena)
print('Cadena: ', sCadena)
print('Lista : ', letras_ls)

print('EJEMPLO 0009')
print('------------')

vector1 = [0]*2
vector1[0] = 1
vector1[1] = 2
# vector1[2] = 3 # Error no existe este index 2
vector1.append(3)
print('Vector 1: ',vector1)

vector2 = []
vector2.append(1)
vector2.append(2)
vector2.append(3)
print('Vector 2: ',vector2)

print('EJEMPLO 0010')
print('------------')

letras_ls = ['H','o','l','a']
sCadena = "".join(letras_ls) #Caracter de separación ningún espacio entre cada elemento de la lista
print('Cadena: ',sCadena)

palabras_ls = ['A1','Luis','23','1.72']
sCadena = ";".join(palabras_ls)
print('Cadena: ', sCadena)

print('EJEMPLO 0011')
print('------------')

cadena = "Hola Mundo"
subcadena1 = cadena[5:10]
subcadena2 = cadena[0:4]
subcadena3 = cadena[0:]
subcadena4 = cadena[::-1]
subcadena5 = cadena[0:-1]

print('Cadena      : ', cadena)
print('Sub Cadena 1: ', subcadena1)
print('Sub Cadena 2: ', subcadena2)
print('Sub Cadena 3: ', subcadena3)
print('Sub Cadena 4: ', subcadena4)
print('Sub Cadena 5: ', subcadena5)

print('EJEMPLO 0012')
print('------------')

cadena = 'HolaMundo'
longitud = len(cadena)
c = 1
for i in range(longitud):
    print(cadena[0:c])
    c = c + 1

print()

cadena = 'HolaMundo'
longitud = len(cadena)
for i in range(longitud):
    print(cadena[0:i])
print(cadena)

print('EJEMPLO 0013')
print('------------')

from collections.abc import Iterable

lista       = [1,2,3]
tupla       = (1,2,3)
cadena      = "123"
rango       = range(1,4,1) 
conjunto    = {1,2,3}
diccionario = {'uno':1,'dos':2,'tres':3}

print('Lista      : ',lista,'  ',type(lista))
print('Tupla      : ',tupla,'  ',type(tupla))
print('Cadena     : ',cadena,'  ',type(cadena))
print('Rango      : ',rango,'  ',type(rango))
print('Conjunto   : ',conjunto,'  ',type(conjunto))
print('Diccionario: ',diccionario,'  ',type(diccionario))

'''
Lista      :  [1, 2, 3]                             <class 'list'>
Tupla      :  (1, 2, 3)                             <class 'tuple'>
Cadena     :  123                                   <class 'str'>
Rango      :  range(1, 4)                           <class 'range'>
Conjunto   :  {1, 2, 3}                             <class 'set'>
Diccionario:  {'uno': 1, 'dos': 2, 'tres': 3}       <class 'dict'>
'''

print(isinstance(lista, Iterable))          #True
print(isinstance(tupla, Iterable))          #True
print(isinstance(cadena, Iterable))         #True
print(isinstance(rango, Iterable))          #True
print(isinstance(conjunto, Iterable))       #True
print(isinstance(diccionario, Iterable))    #True

lista_it = iter(lista)
tupla_it = iter(tupla)
cadena_it = iter(cadena)
rango_it = iter(rango)
conjunto_it = iter(conjunto)
diccionario_it = iter(diccionario.items())

print('\nLISTA')
while True:
      y = next(lista_it,-1)
      if y == -1:
         break
      else:
        print(y, end='  ')

print('\nTUPLA')
while True:
      y = next(tupla_it,-1)
      if y == -1:
         break
      else:
        print(y, end='  ')

print('\nCADENA')
while True:
      y = next(cadena_it,-1)
      if y == -1:
         break
      else:
        print(y, end='  ')

print('\nRANGO')
while True:
      y = next(rango_it,-1)
      if y == -1:
         break
      else:
        print(y, end='  ')

print('\nCONJUNTO')
while True:
      y = next(conjunto_it,-1)
      if y == -1:
         break
      else:
        print(y, end='  ')

print('\nDICCIONARIO')
while True:
      y = next(diccionario_it,-1)
      if y == -1:
         break
      else:
        print(y, end='  ')

'''
LISTA
1  2  3
TUPLA
1  2  3
CADENA
1  2  3
RANGO
1  2  3
CONJUNTO
1  2  3
DICCIONARIO
('uno', 1)  ('dos', 2)  ('tres', 3)  
'''