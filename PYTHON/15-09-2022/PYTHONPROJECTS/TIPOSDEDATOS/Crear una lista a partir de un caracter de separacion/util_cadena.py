import re

def crear_lista_por_caracter_separacion(cadena,caracterseparacion):
    
    patron = '\s+'
    textomodificado = re.sub(patron, ' ', cadena).strip()
   
    partes_l = str(textomodificado).split(caracterseparacion)
    return partes_l

def mostrar(mensaje,x):
    print(mensaje,x)