import os
import util_main as um

os.system('cls')

m = []

# ENTRADA
um.entrada(m)
print('ENTRADA')
print('-------')
um.salida(m)
# PROCESO
um.proceso_llenarlonumeroaleatorios(m)
print('ALEATORIA')
print('---------')
um.salida(m)
um.proceso_cambiarimparescero(m)
# SALIDA
print('IMPARES CERO')
print('------------')
um.salida(m)
