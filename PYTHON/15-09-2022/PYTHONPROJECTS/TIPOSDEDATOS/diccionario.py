import os
os.system('cls')
# DEFINIR UN DICCIONARIO: CLAVE:VALOR
def ejemplo1():
    x = dict({'uno':1, 'dos':2, 'tres':3})
    print(type(x)) # dict 
    print(x['dos'])
    # x = {} 
    # Recorrer un diccionario
    for elemento in x:
        print(elemento)
    #
    for elemento in x.values():
        print(elemento)
    # 
    for k,v in x.items():
        print(k, '  ', v)

def ejemplo2(): # ACCEDER A UN DICCIONARIO
    diccionario = {'A1':['Luis',23,1.72], 'A2':['Miguel',24,1.73] }
    print(type(diccionario['A1'])) # <class 'list'>
    print('Nombre del Alumno: ', diccionario['A1'][0])
    
    x = diccionario['A1']

    print('%-7s  %5s  %9s' % ('NOMBRE','EDAD','ESTATURA'))
    print('%-7s  %5s  %9s' % ('------','----','--------'))
    print('%-7s  %5d  %9.2f' % (x[0],x[1],x[2]))

# ELIMINAR UN ELEMENTO
def ejemplo3():
    diccionario = {'A1':['Luis',23,1.72], 'A2':['Miguel',24,1.73] }
    # Eliminar alumno A2
    del diccionario['A2']
    print(diccionario)

# COMPARAR DICCIONARIOS
def ejemplo4():
    d1 = {'uno':1, 'dos':2}
    d2 = {'dos':2, 'uno':1}
    print(d1 == d2)

# DICCIONARIOS ANIDADOS
def ejemplo5():
    d = {'par':{'dos':2,'cuatro':4,'seis':6}, 'impar':{'uno':[1.1,1.2,1.3]}}
    print(d['par']['dos'])
    print(d['impar']['uno'][0])

    listavalores = list(d.values())
    print(listavalores)

    listaclaves = list(d.keys())
    print(listaclaves)

# ACTUALIZAR UN DICCIONARIO
def ejemplo6():
    diccionario = {'A1':['Luis',23,1.72], 'A2':['Miguel',24,1.73]}
    d = {'A1':['Carlos',22,1.70]}
    diccionario.update(d)
    print(diccionario)

    diccionario = {'A1':['Luis',23,1.72], 'A2':['Miguel',24,1.73]}
    d = {'A2':None}
    diccionario.update(d)
    print(diccionario)

    diccionario = {'A1':['Luis',23,1.72], 'A2':['Miguel',24,1.73]}
    diccionario1 = dict.fromkeys(diccionario) # POR DEFECTO None
    print(diccionario1)
    diccionario2 = dict.fromkeys(diccionario,[])
    print(diccionario2)

ejemplo6()
    


    