import util

def entrada(numerosreales_l):
    n = util.numeroEntero('Cuantos números reales desea ingresar a su lista? ')
    for i in range(n): #i = 0 1 2
        numerosreales_l.append(util.numeroReal('Ingrese numero real ' + str(i+1) + "? " ))

def proceso(numerosreales_l, cuadrados_l, cubos_l):
    for x in numerosreales_l:
        cuadrados_l.append(util.cuadrado(x))
        cubos_l.append(util.cubo(x))

def salida(numerosreales_l,cuadrados_l,cubos_l):
    print('%10s  %10s  %10s' % ('REAL','CUADRADO','CUBO'))
    print('%10s  %10s  %10s' % ('----','--------','----'))
    for x, x2, x3 in zip(numerosreales_l,cuadrados_l,cubos_l):
        print('%10.2f  %10.2f  %10.2f' % (x, util.redondear(x2,2),util.redondear(x3,2)))
