import os
import util_entrada as e
import util_cadena as c

os.system('cls')

print('invertir_por_indice_sin_algorimo')
#ENTRADA
cadena = e.entradaCadena('Ingrese cadena? ')
#PROCESO
invertida = c.invertir_por_indice_sin_algorimo(cadena)
#SALIDA
c.mostrar('Cadena invertida: ',invertida)

print('invertir_por_indice_con_algoritmo_1')
#ENTRADA
cadena = e.entradaCadena('Ingrese cadena? ')
#PROCESO
invertida = c.invertir_por_indice_con_algoritmo_1(cadena)
#SALIDA
c.mostrar('Cadena invertida: ',invertida)

print('invertir_por_elemento_con_algoritmo_1')
#ENTRADA
cadena = e.entradaCadena('Ingrese cadena? ')
#PROCESO
invertida = c.invertir_por_elemento_con_algoritmo_1(cadena)
#SALIDA
c.mostrar('Cadena invertida: ',invertida)

print('invertir_por_funcion_sin_algorimo')
#ENTRADA
cadena = e.entradaCadena('Ingrese cadena? ')
#PROCESO
invertida = c.invertir_por_funcion_sin_algorimo(cadena)
#SALIDA
c.mostrar('Cadena invertida: ',invertida)