import os
import re
import random

# CREAR UNA MATRIZ ESTATICA
def ejemplo1():
    print('1. DEFINIR UNA MATRIZ')
    matriz = [[8,9],
              [4,5],
              [3,1]] # 3x2 = fxc
    print(matriz) # [[8, 9], [4, 5], [3, 1]]
    print('2. MOSTRAR LAS FILAS POR SEPARADO')
    fila1 = matriz[0]
    fila2 = matriz[1]
    fila3 = matriz[2]
    print(fila1)
    print(fila2)
    print(fila3)
    print('3. RECORRE UNA MATRIZ POR INDICE PRIMERO FILA Y LUEGO COLUMNA')
    nf = len(matriz)
    nc = len(matriz[0])
    for i in range(nf):
        for j in range(nc):
            print('%2d' % (matriz[i][j]),end='')
        print()
    print('4. RECORRE UNA MATRIZ POR INDICE PRIMERO COLUMNA Y LUEGO FILA')
    for j in range(nc):
        for i in range(nf):
            print('%2d' % (matriz[i][j]),end='')
        print()

def ejemplo2():
    print('1. DEFINIR UNA MATRIZ')
    matriz = [[8,9],
              [4,5],
              [3,1]] # 3x2 = fxc
    print(matriz) # [[8, 9], [4, 5], [3, 1]]
    print('2. RECORRE UNA MATRIZ POR ELEMENTO PRIMERO FILA Y LUEGO COLUMNA')
    for filas_l in matriz:
        for x in filas_l:
            print('%2d' % (x), end='')
        print()
    print('3. RECORRE UNA MATRIZ POR ELEMENTO PRIMERO COLUMNA Y LUEGO FILA')
    for filas_l in matriz:
        print('%2d' % (filas_l[0]),end='')
    print()
    for filas_l in matriz:
        print('%2d' % (filas_l[1]),end='')
    print()
    print('3.1. RECORRE UNA MATRIZ POR ELEMENTO PRIMERO COLUMNA Y LUEGO FILA ')
    for j in range(len(matriz[0])):
        for filas_l in matriz:
            print('%2d' % (filas_l[j]),end='')
        print()

    # EJERCICIO        
    print('4. RECORRE UNA MATRIZ POR ELEMENTO PRIMERO COLUMNA Y LUEGO FILA(STEVEN)')
    bandera = False
    for filas_l in matriz:
        if bandera == False:
          for x in filas_l:
              if bandera == False:
                 print('%2d' % (x),end='')
                 bandera = True
        bandera = False
    bandera = True
    print()
    for filas_l in matriz:
        if bandera == True:
          for x in filas_l:
              if bandera == False:
                print('%2d' % (x),end='')
                bandera = False
              bandera = False
        bandera = True

    print('\n5. RECORRE UNA MATRIZ POR ELEMENTO PRIMERO COLUMNA Y LUEGO FILA(STEVEN)')
    bandera = False
    aviso = False
    for z in matriz[0]:
        for filas_l in matriz:
            if bandera == False:
               for x in filas_l:
                    print('%2d' % (x),end='')
                    break
                
            if aviso == True:
                for x in filas_l:
                        if aviso == False:
                            print('%2d' % (x),end='')
                            aviso = True
                            break
                        aviso = False
        aviso = True
        bandera = True
        print()


def numeroEntero(mensaje): # 
    patron = '[0-9]+'
    while True:
          cadena = input(mensaje)
          correcto = re.fullmatch(patron,cadena)
          if not correcto:
             print("Error: Vuelva a ingresar el dato")
          else:
             break
    return int(cadena)

# DEFINIR UNA MATRIZ DINAMICAMENTE
def ejemplo3():
    print('1. DEFINIR UNA MATRIZ DINAMICA')
    # Dimensión de la matriz
    nf = numeroEntero('Cantidad de filas   ? ') 
    nc = numeroEntero('Cantidad de columnas? ') 
    # Denir la matriz dinamicamente
    matriz = []
    for i in range(nf):
        matriz.append([0]*nc)
    # Llenar la matriz dinamicament
    for i in range(nf):
        for j in range(nc):
            matriz[i][j] = numeroEntero('Entero['+str(i)+']'+'['+str(j)+']=')
    # Mostrar la matriz
    for i in range(nf):
        for j in range(nc):
            print('%2d' % (matriz[i][j]),end='')
        print()

# MODIFICAR UNA MATRIZ
def ejemplo4():
    print('1. DEFINIR UNA MATRIZ')
    matriz = [[8,9],
              [4,5],
              [3,1]] # 3x2 = fxc
    print(matriz) # [[8, 9], [4, 5], [3, 1]]
    print('2. MOFIFICAR FILA, ELEMENTO BASICO')
    matriz[1] = [7,6]
    matriz[2][1] = 7
    print(matriz)
    print('3. INSERTARTAR UNA FILA')
    matriz.insert(3,[7,6])
    print(matriz)

# SUMAR 2 MATRICES 
def ejemplo5():
    a = [[2,0,1],[3,0,0],[5,1,1]]
    b = [[1,0,1],[1,2,1],[1,1,0]]
    nf = len(a)
    nc = len(a[0])
    # Denir la matriz dinamicamente
    c = []
    for i in range(nf):
        c.append([0]*nc)
    # Recorrer matriz a y b e ir sumando
    for i in range(nf):
        for j in range(nc):
            c[i][j] = a[i][j] + b[i][j]
    # Mostrar
    print(a)
    print(b)
    print(c)

# DEFINIR UNA MATRIZ IDENTIDAD DINAMICAMENTE NFxNC
def ejemplo6():
    n = numeroEntero("Ingrese el número de filas y columnas ")
    matriz = []
    for i in range(n):
        matriz.append([0]*n)
    
    for i in range(n):
        for j in range(n):
            if i == j:
                matriz[i][j] = 1
            else:
                matriz[i][j] = 0
    print("Matriz identidad:", matriz )

    for filas_l in matriz:
        for x in filas_l:
            print("%3d" % (x), end = " ")
        print()

#De STEVEN JESUS DELGADO BENAVIDES para todos 01:41 PM
def ejemplo7():
      fc = int(input('INGRESE NUMERO DE FILAS Y COLUMNAS?: '))
      m = []
      for i in range(fc):
           m.append([0]*fc)
      for i in range(fc):
           m[i][i] = 1 
      print(m)

      for filas_l in m:
        for x in filas_l:
            print("%3d" % (x), end = " ")
        print()
    
# CREAR UNA MATRIZ DINAMICA DE NFxNC CON NUMEROS ALEATORIOS DONDE DEBEN MOSTRARSE SOLO LOS PARES Y CASO CONTRARIO MOSTRARÁ UN CERO
# LENA
def ejemplo8(): 

    n = numeroEntero("Ingrese el número de filas y columnas? ")
    '''
    matriz = []
    for i in range(n):
        fila_l = []
        for j in range(n):
            fila_l.append(numeroEntero("Ingrese elemento [" + str(i) + "]" + "[" + str(j) + "] = "))
        matriz.append(fila_l)
    '''
    matriz = []
    for i in range(n):
        fila_l = []
        for j in range(n):
            fila_l.append(random.randint(1,6))
        matriz.append(fila_l)

    print()
    print("Matriz original: ")
    for filas_l in matriz:
        for x in filas_l:
            print("%3d" % (x), end = " ")
        print()

    for i in range(n):
        for j in range(n):
            if (matriz[i][j] % 2) != 0:
                matriz[i][j] = 0
    print()
    print("Matriz modificada: ")
    for filas_l in matriz:
        for x in filas_l:
            print("%3d" % (x), end = " ")
        print()

#steven
def ejemplo8():
     nf = random.randint(1,6)
     nc = random.randint(1,6)
     # Definir la dimesión de la matriz
     m = []
     for i in range(nf):
          m.append([0]*nc)

     for i in range (nf):
        for j in range(nc):
            m[i][j] = random.randint(1,6)
            print("%3d" % (m[i][j]), end = " ")
            if (m[i][j]% 2) != 0:
               m[i][j] = 0
        print()
     print(m)
     for filas_l in m:
        for x in filas_l:
            print("%3d" % (x), end = " ")
        print()


'''
2 3 4    2 0 4
1 2 5    0 2 0

'''




    


os.system('cls')
ejemplo8()            

    