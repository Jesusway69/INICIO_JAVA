import re

def convertir_oracion_a_lista_palabras(oracion):
    p = re.compile('[a-zA-ZñÑáéíóúÁÉÍÓÚ]+')
    palabras_l = p.findall(oracion)
    return palabras_l

def mostrar(mensaje,x):
    print(mensaje,x)