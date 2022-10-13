import re

def entradaCadena(mensaje): # letras del alfabeto
    patron = '[a-zA-Z0-9ñÑáéíóúÁÉÍÓÚ\s;\.]+'
    while True:
          cadena = input(mensaje)
          correcto = re.fullmatch(patron,cadena)
          if not correcto:
             print("Error: Vuelva a ingresar el dato")
          else:
             break
    return cadena