# Evaluar una nota para indicar si esta aprobado o desaprobado  0..5..10
# Invalida Aprobado Desaprobado
import os

os.system('cls')

# ENTRADA
nota = float(input('Ingrese su nota? '))

# PROCESO - SALIDA
if nota < 0 or nota > 10:
   print("NOTA INCORRECTA")
else:
   if nota >=5 and nota <= 10:
      print('NOTA APROBADA')
   else:
      print('NOTA DESAPROBADA')

