import os

os.system('cls')

# CREAR UN CONJUNTO
def ejemplo1():
    # Crear un conjunto(set) vacio
    c1 = {}
    # Crear un conjunto de números enteros
    c2 = {1, 3, 9, 3, 1}
    print(c2)

# ELIMINAR DUPLICADOS DE UNA LISTA
def ejemplo2():
    lista = [1,3,9,3,1]
    print(lista)
    sinduplicados = list(set(lista))
    print(sinduplicados)

    lista = [1,3,9,3,1]
    sinduplicados1 = []
    for x in lista:
        if x not in sinduplicados1:
           sinduplicados1.append(x)
    print(sinduplicados1)

# RECORRER UN CONJUNTO(SET)
def ejemplo3():
    conjunto = {10, 3, 9, 3, 1}
    for x in conjunto:
        print(x)

    conjunto = {'Luis','Carlos','Arturo'}
    for x in conjunto:
        print(x) 

# ELIMINAR ELEMENTOS DE UN CONJUNTO(SET)
def ejemplo4():
    conjunto = {10, 3, 9, 3, 1}
    conjunto.remove(10)
    print(conjunto)

# SACAR  A LOS ELEMENTOS DE UN CONJUNTO(SET) Y LO ELIMINA A LA VEZ
#set:  pila: ultimo entrar primero salir(cola)
#list: cola: primero entrar primero salir(pila)
def ejemplo5():
    conjunto = {10, 3, 9, 3, 1} 
    print(conjunto)
    x1= conjunto.pop()
    print(x1)
    print(conjunto,' ',x1)
    x1= conjunto.pop()
    print(conjunto,' ',x1)

    conjunto = [10, 3, 9, 3, 1]
    conjunto.pop()
    print(conjunto)
    conjunto.pop()
    print(conjunto)

# Matematica: intersección, unión, diferencia, inclusión
def ejemplo6():
    a = {1,2,3,4}
    b = {1,2,5,6}

    interseccion = a & b
    print(interseccion) # {1, 2}

    union = a | b
    print(union) # {1, 2, 3, 4, 5, 6}

    diferencia = a - b
    print(diferencia) # {3, 4}

    a = {1,2,3,4}
    b = {1,2,5,6}
    inclusion = a >= b # a incluye b
    print(inclusion) # False

    a = {1,2}
    b = {1,2,5,6}
    inclusion = b >= a # b incluye a
    print(inclusion) # True

    # DISJUNTOS (NO TIENEN ELEMENTOS EN COMUN)

    a = {1,2}
    b = {1,2,5,6}
    print(a.isdisjoint(b)) # Falso

    a = {1,2}
    b = {5,6}
    print(a.isdisjoint(b)) # True

# AÑADIR ELEMENTOS A UN CONJUNTO
def ejemplo7():
    a = {1,2}
    x = 5
    a.add(x)
    print(a) # {1, 2, 5}

    conjunto = {}
    lista = [7, 9, 3, 15]
    conjunto = {*lista}
    print(conjunto) # {9, 3, 15, 7}





        


    



ejemplo7()
    