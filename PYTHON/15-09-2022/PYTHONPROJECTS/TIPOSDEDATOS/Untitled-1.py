import os
import math

os.system('cls')

print(5/2) # 2.5      División real (punto decimal)
print(4/2) # 2.0 

print(5//2) #2        División entera (si punto decimal)
print(4//2) #2

print(5 % 2) #1       Resto división entera

print(5.0 % 2) #1.0

print(int(5.0 % 2))

print(int(33.89)) # 33

print(float(1))  # 1.0

print(bool('True'))   #   'True' 

print('Ejemplo 1')
a = 'True'  # str
b = True    # bool
c = a == b
print('c: ',c) # False

print('Ejemplo 2')
a = 'True'  # str
b = True    # bool
c = bool(a) == b
print('c: ',c) # True

print('Ejemplo 3')
a = 'True'  # str
b = True    # bool
c = a == str(b)
print('c: ',c) # True

print('Ejemplo 4')
a = 0       # str
b = True    # bool
print(bool(a)) # False
print(bool(4)) # True

if 0:
   print('Verdadero')
else:
   print('Falso') 

if -1:
   print('Verdadero') #
else:
   print('Falso')

if '':
   print('Verdadero') 
else:
   print('Falso') #

if []:
   print('Verdadero') 
else:
   print('Falso') #

"""
Entero: 0(False)    Todo lo demas True
Real  : 0.0(False)  Todo lo demás True
Cadena: ''(False)   Todo lo demás True

Lista : [](False)   Todo lo demás True
"""

print('Ejemplo 5')

print(2**3)

print(2**0.5) # Raiz cuadrada                 1.4142
print(math.sqrt(2)) # Raiz cuadra               "
print(math.pow(2,0.5)) #Raiz cuadrada           "



