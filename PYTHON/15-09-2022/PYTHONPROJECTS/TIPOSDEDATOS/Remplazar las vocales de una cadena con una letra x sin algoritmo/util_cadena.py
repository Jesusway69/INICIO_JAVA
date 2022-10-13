import re

def remplazar_vocales_con_x(cadena):
    patron = '[aeiouAEIOUáéíóúÁÉÍÓÚ]'
    textomodificado = re.sub(patron, 'X', cadena)
    return textomodificado
    
def mostrar(mensaje,x):
    print(mensaje,x)