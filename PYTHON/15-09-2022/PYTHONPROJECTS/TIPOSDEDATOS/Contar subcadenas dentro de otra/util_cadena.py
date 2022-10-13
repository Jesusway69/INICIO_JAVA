def contar_subcadena_dentro_otra(cadena,subcadena):
    cantidad_veces = str(cadena).lower().count(subcadena.lower())
    return cantidad_veces

def mostrar(mensaje,x):
    print(mensaje,x)