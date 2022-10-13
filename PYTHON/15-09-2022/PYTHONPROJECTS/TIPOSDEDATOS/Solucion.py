import os

def entrada(filas_l):
    filas_l.append(['A1','Luis',23, 1.72])
    filas_l.append(['A2','Miguel',24, 1.87])
    filas_l.append(['A3','Maria',20, 1.60])

def promedio(filas_l):
    n = len(filas_l)
    ed = 0
    es = 0
    for x in filas_l:
        ed = ed + x[2]
        es = es + x[3]
    return ed/n, es/n

def salida(filas_l,pedad,pestatura):
    print('%9s  %-7s  %5s  %9s' % ('IDALUMNO','NOMBRE','EDAD','ESTATURA'))
    print('%9s  %-7s  %5s  %9s' % ('--------','------','----','--------'))
    for x in filas_l:
        print('%9s  %-7s  %5d  %9.2f' % (x[0],x[1],x[2],x[3]))
    print()
    print('%18s  %5.2f' % ('Promedio Edad    :',pedad))
    print('%18s  %5.2f' % ('Promedio Estatura:',pestatura))
    print()

os.system('cls')

filas_l = []
# ENTRADA
entrada(filas_l)
# PROCESO
pedad,pestatura = promedio(filas_l)
# SALIDA
salida(filas_l,pedad,pestatura)
