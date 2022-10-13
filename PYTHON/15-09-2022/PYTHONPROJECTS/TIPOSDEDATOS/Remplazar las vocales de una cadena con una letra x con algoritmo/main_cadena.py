import os
import util_entrada as e
import util_cadena as c

os.system('cls')

#ENTRADA
cadena = e.entradaCadena('Ingrese cadena? ')
#PROCESO
textomodificado = c.reemplazarvocales(cadena)
#SALIDA
c.mostrar('Texto modificado vocales con x: ',textomodificado)
