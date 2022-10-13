import os

def division_entre_cero(a,b):
    try:
        return a/b
    except BaseException:
        return None

os.system('cls')
try:
    y = division_entre_cero(5)
except TypeError:
    print('Falta argumentos')

