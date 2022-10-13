import os

os.system('cls')

def promedio(numeros_l):
    s = 0
    for x in numeros_l:
        s = s + x
    return s / len(numeros_l)

def mostrar(idAlumno,nombre,edad,estatura):
    print('%9s  %-10s  %5s  %10s' % ('idAlumno','nombre','edad','estatura'))
    print('%9s  %-10s  %5s  %10s' % ('--------','------','----','--------'))
    for a,b,c,d in zip(idAlumno,nombre,edad,estatura):
        print('%9s  %-10s  %5d  %10.2f' % (a,b,c,d))

# ENTRADA
idAlumno = ['A1','A2','A3']
nombre   = ['Luis','Miguel','Maria']
edad     = [23,24,20]
estatura = [1.72,1.87,1.60]
# PROCESO
proeda = promedio(edad)
proest = promedio(estatura)
# SALIDA
mostrar(idAlumno,nombre,edad,estatura)
print('%20s  %7.2f' % ('Promedio Edad    : ',round(proeda,2)) )
print('%20s  %7.2f' % ('Promedio Estatura: ',round(proest,2)) )








