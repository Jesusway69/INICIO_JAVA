import os
from sqlite3 import SQLITE_ALTER_TABLE


os.system('cls')

bandera = 1
try:
    x = int(input('Ingrese un número entero? '))
    print(x)
#except ValueError:
except:
    print('Entrada incorrecta')
    bandera = 0

if bandera == 1:
   print('Programa sigue funcionando')
else:
   print('NO PUEDO SEGUIR CON EL PROGRAMA SUCEDIO UNA SITUACION MUY CRITICA')




os.system('pause')

