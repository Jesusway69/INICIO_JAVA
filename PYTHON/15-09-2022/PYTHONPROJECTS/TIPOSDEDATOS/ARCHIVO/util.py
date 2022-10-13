import csv
import misfunciones as mf


def escribir_1():
    rna = r'C:\Users\RYZEN\Documents\NetBeansProjects\INICIOJAVA\PYTHON\15-09-2022\PYTHONPROJECTS\TIPOSDEDATOS\ARCHIVO\archivo2.csv' 
    # rna = 'ARCHIVO\\archivo1.csv'

    with open(rna, 'w', encoding='UTF8') as f:
         escritor = csv.writer(f,delimiter=';', skipinitialspace=True, lineterminator='\n')
         escritor.writerow(['numero','palabra'])
         for i in range(1,11):
             escritor.writerow([i,'Linea '+str(i)])

def leer_1():
    rna = 'ARCHIVO\\archivo1.csv'
    with open(rna, 'r', encoding='UTF8') as f:
         lector = csv.reader(f,delimiter=';', skipinitialspace=True, lineterminator='\n')
         for fila in lector:
             cadena = ';'.join(fila)
             print(cadena)

def leer_1_1():
    try:
        rna = 'ARCHIVO\\archivo1X.csv'
        with open(rna, 'r', encoding='UTF8') as f:
            lector = csv.reader(f,delimiter=';', skipinitialspace=True, lineterminator='\n')
            print(list(lector))
            bandera = True
            for fila in lector:
                cadena = ';'.join(fila)
                parte = cadena.split(';')
                numero = parte[0]
                palabra = parte[1]
                if bandera == True:
                    print(('%6s  %7s') % (numero.upper(),palabra.upper()))
                    print(('%6s  %7s') % ('------','-------'))
                    bandera = False
                else:
                    print(('%6s  %7s') % (numero,palabra))
    except FileNotFoundError:
        print('Archivo no existe')

'''
[['numero', 'palabra'],
 ['1', 'Linea 1'], 
 ['2', 'Linea 2'], 
 ['3', 'Linea 3'], 
 ['4', 'Linea 4'], 
 ['5', 'Linea 5'],
 ['6', 'Linea 6'], 
 ['7', 'Linea 7'], 
 ['8', 'Linea 8'],
 ['9', 'Linea 9'],
 ['10', 'Linea 10']]    11x2
'''

def ejercicio():
    datos_l = []
    if not siHayRegistro():
       cabecera = ['idAlumno','nombre','edad']
       escribir(cabecera)
    n = mf.numeroEntero('Cantidad de alumnos que desea ingresar? ')
    for i in range(n):
        leerdatos(datos_l)
        escribir(datos_l)
        datos_l = []

def escribir(lista):
    rna = 'ARCHIVO\\alumno.csv'
    with open(rna, 'a', encoding='UTF8') as f:
         escritor = csv.writer(f,delimiter=';', skipinitialspace=True, lineterminator='\n')
         escritor.writerow(lista)

def siHayRegistro():
    rna = 'ARCHIVO\\alumno.csv'
    with open(rna, 'r', encoding='UTF8') as f:
         lector = csv.reader(f,delimiter=';', skipinitialspace=True, lineterminator='\n')
         True
    if bool(lector):
       return True
    else:
       return False

def leerdatos(datos_l):
    idAlumno = mf.numeroEntero('Ingrese Id Alumno? ')
    nombre = mf.entradaNombre('Ingrese nombre? ')
    edad = mf.numeroEntero('Ingrese edad? ')
    datos_l.append(idAlumno)
    datos_l.append(nombre)
    datos_l.append(edad)

def lectura():
    try:
        rna = 'ARCHIVO\\alumno.csv'
        with open(rna, 'r', encoding='UTF8') as f:
            lector = csv.reader(f,delimiter=';', skipinitialspace=True, lineterminator='\n')
            bandera = True
            for fila in lector:
                cadena = ';'.join(fila)
                parte = cadena.split(';')
                idAlumno = parte[0]
                nombre = parte[1]
                edad = parte[2]
                if bandera == True:
                    print(('%8s  %-7s  %4s') % (idAlumno.upper(),nombre.upper(),edad.upper()))
                    print(('%8s  %-7s  %4s') % ('--------','------','----'))
                    bandera = False
                else:
                    print(('%8s  %-7s  %4s') % (idAlumno,nombre,edad))
    except FileNotFoundError:
        print('Archivo no existe')



