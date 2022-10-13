import os
from re import X

# tuple(no modificar = inmutable) = list(modificar = mutable)

os.system('cls')

# CREAR TUPLA
def ejemplo1():
    tupla1 = 1, 2, 3, 4
    tupla2 = (1,2,3,4)
    print(type(tupla1))
    print(tupla1)
    print(tupla2)
    tupla3 = ()

# CONVERTIR UNA LISTA A UNA TUPLA
def ejemplo2():
    lista= [1,7,'A',[1,3]]
    t = tuple(lista)
    print(t)

# RECORRER UNA TUPLA
def ejemplo3():
    tupla = (1,7,'A',[1,3],{'uno':1})
    for x in tupla:
        print(x)

    a,b,c,d,e = tupla
    print(a,' ',b,' ',c,' ',d,' ',e)

# TUPLA CON UN ELMENTO
def ejemplo4():
    tupla = (2,) # tupla = 2,
    print(type(tupla))
    # TUPLA VACIA
    tupla1 = ()
    print(type(tupla1))

# FUNCIONES PROPIAS DE LA TUPLA
def ejemplo5():
    tupla = (1,5,7,1,3,1)
    # contar cuantas veces aparece el 1
    print(tupla.count(1)) # 3
    print(tupla.index(7)) # posicion dentro de la tupla dos
    # acceder a un elemento por su indice
    print(tupla[2]) #7
    del tupla; tupla = () # Vaciar una tupla

def ejemplo6():
    tupla = (1,['a','b'],'hola',1.7)
    tupla[1].append('c')
    print(tupla[0])
    print(tupla)

# CONCATENAR TUPLAS
def ejemplo7():
    t1 = (1,2,3)
    t2 = (4,5,6)
    t1 = t1 + t2 
    print(t1)

# PERTENENCIA A UNA TUPLA
def ejemplo8():
    t1 = (1,2,3)
    if 2 in t1:
       print('si')
    else:
       print('no')


ejemplo7()

