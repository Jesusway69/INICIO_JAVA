import re

def reemplazarvocales(cadena):
      patron = '[aeiouáéíóúAEIOUÁÉÍÓÚ]'
      textomodificado=''
      for i in cadena:
           correcto = re.fullmatch(patron,i)
           if correcto:
            i = 'x'
           textomodificado = textomodificado + i
      return textomodificado
    
def mostrar(mensaje,x):
    print(mensaje,x)