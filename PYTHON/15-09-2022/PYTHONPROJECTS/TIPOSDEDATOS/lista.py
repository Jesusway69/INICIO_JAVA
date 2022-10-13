import os
from typing import OrderedDict

os.system('cls')

# ELIMINAR UN ELEMENTO DE LA LISTA
'''
           #   0       1        2        3        4    
nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
del nombres_l[3]
print(nombres_l) # ['Luis', 'Carlos', 'Miguel', 'María']
del nombres_l[3]
print(nombres_l) # ['Luis', 'Carlos', 'Miguel']
'''
'''
nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l.remove('Luis')
print(nombres_l) # ['Carlos', 'Miguel', 'Carlos', 'María']
'''

'''
# ELIMINAR MUCHOS ELEMENTOS DE LA LISTA A LA VEZ
nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l[2:] = []
print(nombres_l) # ['Luis', 'Carlos']
'''
'''
# GENERAR UNA COPIA PARA SALVAR EL ORIGINAL
nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
copia1_l = nombres_l.copy()
copia2_l = nombres_l
nombres_l[1:2] = []
print(nombres_l) # ['Luis', 'Carlos', 'María']
print(copia1_l) # ['Luis', 'Carlos', 'Miguel', 'Carlos', 'María']
print(copia2_l) # ['Luis', 'Carlos', 'María']
'''
'''
# AÑADIR ELEMENTOS A UNA LISTA
nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l = nombres_l + ['Ismael',6,1.3,['Andres','Vanessa']]
print(nombres_l) # ['Luis', 'Carlos', 'Miguel', 'Carlos', 'María', 'Ismael', 6, 1.3, ['Andres', 'Vanessa']] 
for x in nombres_l:
    print(x)
print('IMPRIMIR SOLO LOS ELEMENTOS')
for x in nombres_l:
    if type(x) is list:
       for y in x:
           print(y)
    else:
       print(x)

print(nombres_l.index(['Andres','Vanessa']))
'''

'''
otros_l = ['Luis', 'Carlos', ['Arturo'],'Miguel', 'Carlos', 'María', 'Ismael', 6, 1.3, ['Andres', 'Vanessa']] 
del otros_l[2]
del otros_l[8]
print(otros_l)

otros_l = ['Luis', 'Carlos', ['Arturo'],'Miguel', 'Carlos', 'María', 'Ismael', 6, 1.3, ['Andres', 'Vanessa']] 
otros_l[2:3] = []
otros_l[8:9] = []
print(otros_l)

otros_l = ['Luis', 'Carlos', ['Arturo'],'Miguel', 'Carlos', 'María', 'Ismael', 6, 1.3, ['Andres', 'Vanessa']] 
for x in otros_l:
    if type(x) is list:
       del otros_l[otros_l.index(x)]
print(otros_l)

otros_l = ['Luis', 'Carlos', ['Arturo'],'Miguel', 'Carlos', 'María', 'Ismael', 6, 1.3, ['Andres', 'Vanessa']] 
otros_l.insert(0,'Julissa')
print(otros_l)
'''


'''
nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l.append('Ismael')
nombres_l.append(['Ismael','Miguel','Miguel'])
nombres_l.append(5)
nombres_l.append(5.1)
print(nombres_l) # ['Luis', 'Carlos', 'Miguel', 'Carlos', 'María', 'Ismael', ['Ismael', 'Miguel', 'Miguel'], 5, 5.1]
'''

'''
int
str
bool
float   5.1
list   []
'''

# ORDENAR UNA LISTA
enteros_l = [9,1,8,0,4,3,2,5,6]
enteros_l.sort()
print(enteros_l) # [0, 1, 2, 3, 4, 5, 6, 8, 9]
enteros_l.sort(reverse=True)
print(enteros_l) # [9, 8, 6, 5, 4, 3, 2, 1, 0]

cadenas_l = ['Luis','Carlos','Miguel','Carlos','María']
cadenas_l.sort()
print(cadenas_l) # ['Carlos', 'Carlos', 'Luis', 'María', 'Miguel']
cadenas_l.sort(reverse=True)
print(cadenas_l) # ['Miguel', 'María', 'Luis', 'Carlos', 'Carlos']

# LIMPIAR UNA LISTA
cadenas_l.clear()
print(cadenas_l) # []

# AÑADIR ELEMENTOS DE UNA LISTA EN OTRA
enteros_l = [9,1,8,0,4,3,2,5,6]
lista = [10,20,30]
enteros_l.extend(lista)
print(enteros_l) # [9, 1, 8, 0, 4, 3, 2, 5, 6, 10, 20, 30]

enteros_l = [9,1,8,0,4,3,2,5,6]
lista = [10,20,30]
enteros_l = enteros_l + lista
print(enteros_l) # [9, 1, 8, 0, 4, 3, 2, 5, 6, 10, 20, 30]

# CALCULO CON LISTAS
enteros_l = [9,1,8,0,4,3,2,5,6]
print('Maximo: ',max(enteros_l))

# ELIMINAR DUPLICADOS
enteros_l = [9,1,8,0,4,3,2,5,6,7,9,4,2,2]
sinduplicados_l = list(OrderedDict.fromkeys(enteros_l))
print(enteros_l) # [9, 1, 8, 0, 4, 3, 2, 5, 6, 7, 9, 4, 2, 2]
print(sinduplicados_l) # [9, 1, 8, 0, 4, 3, 2, 5, 6, 7]

'''
Dada la siguiente tabla de datos:

idAlumno nombre edad estatura
A1       Luis   23   1.72
A2       Miguel 24   1.87
A3       María  20   1.60

Representar los datos anteriores en lista para luego recorrer dichas listas
y mostrarlo en pantalla en una tabla indicando el promedio de edad y estatura.
'''











