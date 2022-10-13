import random as r

def entrada(m):
    nf = 3
    nc = 4
    for i in range(nf):
        m.append([0]*nc) # [0, 0, 0, 0, 0]  

def proceso_llenarlonumeroaleatorios(m):
    nf = len(m)
    nc = len(m[0])
    for i in range (nf):
        for j in range(nc):
            m[i][j] = r.randint(1,6)

def proceso_cambiarimparescero(m):
    nf = len(m)
    nc = len(m[0])
    for i in range (nf):
        for j in range(nc):
            if (m[i][j]% 2) != 0:
                m[i][j] = 0
            
def salida(m):
    for filas_l in m:
        for x in filas_l:
            print("%3d" % (x), end = " ")
        print()

