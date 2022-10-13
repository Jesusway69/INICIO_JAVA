def invertir_por_indice_sin_algorimo(cadena):
    invertida = cadena[::-1]
    return invertida

def invertir_por_funcion_sin_algorimo(cadena):
    invertida = ''.join(reversed(cadena))
    return invertida

def invertir_por_indice_con_algoritmo_1(cadena):
    longitud = len(cadena)
    s = ''
    for i in range(longitud-1,-1,-1):
        s = s + cadena[i]
    return s

def invertir_por_elemento_con_algoritmo_1(cadena):
    s = ''
    for x in cadena:   #HOLA  
        s = x + s
    return s

def mostrar(mensaje,x):
    print(mensaje,x)

'''
ITERACION 1: x = H
             s = H
ITERACION 2: x = O
             s = O + s = OH
ITERACION 3: x = L
             s = L + OH = LOH
ITERACION 4: x = A
             s = A + LOH = ALOH
'''