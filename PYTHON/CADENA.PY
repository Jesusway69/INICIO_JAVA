***************************
***   METODOS CADENAS   ***
***************************

capitalize() 				devuelve una copia de la cadena con la primera letra en mayúscula.
center(n) 					devuelve una copia de la cadena centrada y con longitud n.

find(sub,[,desde[,hasta]]) 	devuelve la posición de la primera aparición de sub en la cadena; si se incluye desde, la búsqueda comienza en esa posición y termina en hasta, si se especifica.

isalnum() 		devuelve cierto si la cadena es no vacía y sólo contiene letras y dígitos.
isalpha() 		devuelve cierto si la cadena es no vacía y sólo contiene letras.
isdigit() 		devuelve cierto si la cadena es no vacía y sólo contiene dígitos.
islower() 		devuelve cierto si todas las letras de la cadena son minúsculas y hay al menos una minúscula.
isspace() 		devuelve cierto si la cadena es no vacía y todos sus caracteres son espacios.
isupper() 		devuelve cierto si todas las letras de la cadena son mayúsculas y hay al menos una mayúscula.
lower() 		devuelve una copia de la cadena con las letras convertidas a minúsculas.
lstrip() 		devuelve una copia de la cadena con los blancos iniciales omitidos.
replace(v, n) 	devuelve una copia de la cadena donde se han sustituido todas las apariciones de la cadena v por n.
rstrip() 		devuelve una copia de la cadena con los blancos finales omitidos.
split([s]) 		devuelve una lista que contiene las palabras de la cadena. Si se incluye la cadena s, se utiliza como separador.
strip() 		devuelve una copia de la cadena con los blancos iniciales y finales omitidos.
upper() 		devuelve una copia de la cadena convertida a mayúsculas.
count()         devuelve la cantidad de veces que se repite una subcadena dentro de otra

*************************************
***   ACCIONES SOBRE UNA CADENA   ***
*************************************

- Concatenar cadenas (+)

s = 'Hola' + ' ' + 'Mundo'
print(s)

x = 1
s = 'Hola' + str(x) + 'Mundo'
print(s)

x = True
s = 'Hola' + str(x) + 'Mundo'
print(s)    

- Multiplicar cadenas (*)

s = 'Hola' * 3
print(s)

- Añadir cadenas

(1)

c = ''
s = 'walter'
c = c + s  --> c = 'walter '
s = 'ismael '
c = c + s  --> c = 'walterismael'

(2)

print("AÑADIR CADENAS")
c = ''
s = 'walter '
c = c + s  #--> c = 'walter '
s = 'ismael'
c = c + s  #--> c = 'walterismael'
print(c)

# FORMAR UNA CADENA
lista = ['walter','ismael','sagastegui','lescano']
a = ''
for x in lista:
    a = a + x + ' '
print(type(lista),'  ', lista)
print(type(a),'  ',a)
  
- Convertir la primera letra de cada palabra de una oración en mayusculas

def convertirMayuscula():
  print('EJEMPLO STEVEN')
  os.system('cls')
  texto = 'steven jesus delgado benavides'
  p = re.compile('[a-zA-Z]+')
  lista = p.findall(texto)
  print(lista)
  a = ''
  for x in lista:
    print(type(x))
    s = x.capitalize()
    a = a + s + " "
  print(a)

- Convertir las mayúsculas a minúsculas y viceversa

def convertir_minuscula_mayuscula(cadena):
    resultado = str(cadena).swapcase()
    return resultado

- Convertir toda la cadena a mayusculas

def convertir_todo_mayuscula(cadena):
    resultado = str(cadena).upper()
    return resultado

- Convertir toda la cadena a minúsculas

def convertir_todo_minuscula(cadena):
    resultado = str(cadena).lower()
    return resultado

- Contar las apareciones de una subcadena dentro de una cadena

def contar_subcadena_dentro_otra(cadena,subcadena):
    cantidad_veces = str(cadena).lower().count(subcadena.lower())
    return cantidad_veces

- Obtener la longitud de una cadena

s = 'En un puerto italiano al pie de la montaña'
n = len(s)
print(n) # 42

- Convertir una cadena en una lista de caracteres

def convertir_cadena_a_lista_libreria(cadena):
    caracteres_l = list(cadena)
    return caracteres_l

def convertir_cadena_a_lista_algoritmo(cadena): 
    caracteres_l = []
    for x in cadena:
        caracteres_l.append(x)
    return caracteres_l

Resolverlo libreria propia de python
Resolverlo algoritmicamente

- Remplazar un caracter por otro en toda la cadena. Vamos a quitar los espacios en blanco

def quitar_espacios_blanco(cadena):
    resultado = str(cadena).replace(' ','')
    return resultado
	
- Crear una lista de palabras a partir de una oracion.

def convertir_oracion_a_lista_palabras(oracion):
    p = re.compile('[a-zA-ZñÑáéíóúÁÉÍÓÚ]+')
    palabras_l = p.findall(oracion)
    return palabras_l
	
- Crear una lista a partir de un caracter de separacion.

import re

def crear_lista_por_caracter_separacion(cadena,caracterseparacion):
    patron = '\s+'
    textomodificado = re.sub(patron, ' ', cadena).strip()
    partes_l = str(textomodificado).split(caracterseparacion)
    return partes_l
	
- Recorrer una cadena por su indice

def recorrer_cadena_indice(cadena):
    longitud = len(cadena)
    for i in range(longitud): # 0 1 2 3     Hola(4)
        print(cadena[i],end='')

**********************
***   EJERCICIOS   ***
**********************

1.	Invertir una cadena sin algoritmo.

def invertir_por_indice_sin_algorimo(cadena):
    invertida = cadena[::-1]
    return invertida

2.	Invertir una cadena con algoritmo.

def invertir_por_elemento_con_algoritmo_1(cadena):
    s = ''
    for x in cadena:   #HOLA  
        s = x + s
    return s

3.	Convertir una cadena en una lista de caracteres.

def convertir_cadena_a_lista_libreria(cadena):
    caracteres_l = list(cadena)
    return caracteres_l

4.	Remplazar las vocales de una cadena con una letra x con algoritmo.

def reemplazarvocales(cadena):
      patron = '[aeiouáéíóúAEIOUÁÉÍÓÚ]'
      textomodificado=''
      for i in cadena:
           correcto = re.fullmatch(patron,i)
           if correcto:
            i = 'x'
           textomodificado = textomodificado + i
      return textomodificado

5.	Remplazar las vocales de una cadena con una letra x sin algoritmo.

def remplazar_vocales_con_x(cadena):
    patron = '[aeiouAEIOUáéíóúÁÉÍÓÚ]'
    textomodificado = re.sub(patron, 'X', cadena)
    return textomodificado

6.	Convertir todos los números dentro de una cadena con x.

s = hola3mun222do
s = holaXmunXdo

def remplazar_cadena(cadena):
    patron = '[0-9]+'
    textomodificado = re.sub(patron, 'X', cadena)
    return textomodificado

7.	Eliminar todos los números de una cadena.

8.	Eliminar todas las comas de una cadena.

9.	Convertir una cadena en minúsculas.

10.	Convertir una cadena en mayúsculas.

11.	Escribir por pantalla cada carácter de una cadena introducida por teclado.

12.	Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.

13.	Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces aparece el carácter en la cadena.

14.	Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.

15.	Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en mayúsculas.

16.	Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena por el segundo carácter.

17.	Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.

18.	Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.

19.	Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.

20.	Se pide recorrer una lista de cadenas para determinar por cada cadena si estas están solo formadas por letras del alfabeto o no.

21.	Escribir un programa que pregunte el nombre del usuario en la consola y un número entero e imprima por pantalla en líneas distintas el nombre del usuario tantas veces como el número introducido.


