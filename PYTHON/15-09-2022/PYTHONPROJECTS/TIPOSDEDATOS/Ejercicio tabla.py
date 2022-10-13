import os

os.system('cls')

def promedio(numeros_l):
    s = 0
    for x in numeros_l:
        s = s + x
    return s / len(numeros_l)

def promedio1(fila1,fila2,fila3):
    
    suma1 = fila1[2] + fila2[2] + fila3[2]

    for  in zip(fila1,fila2,fila3):
        s = s + x
    return s / len(numeros_l)

def mostrar(idAlumno,nombre,edad,estatura):
    print('%9s  %-10s  %5s  %10s' % ('idAlumno','nombre','edad','estatura'))
    print('%9s  %-10s  %5s  %10s' % ('--------','------','----','--------'))
    for a,b,c,d in zip(idAlumno,nombre,edad,estatura):
        print('%9s  %-10s  %5d  %10.2f' % (a,b,c,d))

# ENTRADA
fila1 = ['A1','Luis',23, 1.72]
fila2 = ['A2','Miguel',24, 1.87]
fila3 = ['A3','Maria',20, 1.60]
# PROCESO
proeda = promedio(edad)
proest = promedio(estatura)
# SALIDA
mostrar(idAlumno,nombre,edad,estatura)
print('%20s  %7.2f' % ('Promedio Edad    : ',round(proeda,2)) )
print('%20s  %7.2f' % ('Promedio Estatura: ',round(proest,2)) )








