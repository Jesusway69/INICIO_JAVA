***************************
***   TIPOS DE DATOS   ****
***************************

Entero      int
Real        float
Logico      bool (True,False)
Cadena      str

Bytes       bytes    

x = b'x'

************************************
***   OPERADORES DE ASIGNACION   ***
************************************

a = 1
b = 1
c = 1

a = b = c = 1

a, b, c = 1, 2, 3

=	Asignación
+=	Suma y asignación (a = a + t)
-=	Resta y asignación (a = a - t)
*=	Multiplicación y asignación (a = a * t)
/=	División y asignación (a = a / t)
%=	Módulo(Residuo de una división) y asignación (a = a % t)
//=	División y asignación (a = a // t)
**=	Exponencial y asignación (a = a ** t)

*********************************
***   OPERADORES DE LOGICOS   ***
*********************************

Conjución            : and  (Es verdadero cuando ambos son verdaderos)
Disyunción inclusivo : or   (Es falso cuando ambos son falsos)  
Disyunción exclusivo : ^    (Es verdadero cuando uno de los dos es verdadero pero no ambos)
Negación             : not  (Si es verdadero al negarse cambia a falso y si es falso al negarse cambia a verdadero)

**********************************
***   OPERADORES ARITMETICOS   ***
**********************************

+	Suma
-	Resta
*	Multiplicación
/	División normal (entera)
//	División con redondeo hacia abajo (cociente entero de una división entre enteros)
%	Módulo(Residuo de una división)
**	Exponensial

*************************************
***   OPERADORES DE COMPARACION   ***
*************************************

==       Igual que
!= ó <>  Distinto que
<        Menor que
<=       Menor o igual que
>        Mayor que
>=       Mayor o igual que

*********************************
***   EXPRESIONES REGULARES   ***
*********************************

* : Cero a mas
+ : Uno a mas

[0-9]+  ---> 111, 2341234, dfads(no valido)

123.34535
5
([0-9]+\\.[0-9]+)||[0-9]+

[a-zA-Z]+

*********************************
***   OPERADORES ESPECIALES   ***
*********************************

is       Es True si los operadores son idénticos
is not   Es True si los operadores no son idénticos
in       Es True si el valor o variable se encuentra en la secuencia
not in   Es True si el valor o variable no se encuentra en la secuencia

******************************
***   SALIDA EN PANTALLA   ***
******************************

print("Hola", end=" ")
print("Hola", end="")
print("Hola", end="\t")

************************************
***   REDONDEAR UN NUMERO REAL   ***
************************************

round(-0.9999260022512232, 4) ---> -0.9999
round(0.7499415829903138, 4)  --->  0.7499

*********************************
***   FUNCIONES MATEMATICAS   ***
*********************************

import math

print( "CONSTANTS IN PYTHON")

print(" PI value : ", math.pi)
print(" E value : ", math.e)
print(" nan value : ", math.nan)
print(" E value : ", math.inf)

math.atan(x)
math.sqrt(x)
math.pow(base,exponente)
math.trunc(x)

https://docs.python.org/es/3.10/library/math.html

***************************************************
***   ESTRUCTURA CONDICIONAL SIMPLE Y BINARIA   ***
***************************************************

(1)

def main():
    nota = 4
    clasificacion = "Aprobado"
    if nota < 5:
       clasificacion = "Desaprobado"
    print(clasificacion)

(2)

def main():
    nota = 4
    if nota < 5:
       clasificacion = "Desaprobado"
    else:
       clasificacion = "Aprobado" 
    print(clasificacion)
	
(3)

# Evaluar una nota para indicar si esta aprobado o desaprobado  0..5..10
# Invalida Aprobado Desaprobado
import os

os.system('cls')

# ENTRADA
nota = float(input('Ingrese su nota? '))

# PROCESO - SALIDA
if nota < 0 or nota > 10:
   print("NOTA INCORRECTA")
else:
   if nota >=5 and nota <= 10:
      print('NOTA APROBADA')
   else:
      print('NOTA DESAPROBADA')

*******************************************
***   ESTRUCTURA CONDICIONAL MULTIPLE   ***
*******************************************

(1)

Se puede omitir else cuando se abarca todas las posibilidades. 

if expresionlogica_1:
   sentencia_1
   sentencia_2
   ...
   sentencia_n  
elif expresionlogica_2:
   sentencia_1
   sentencia_2
   ...
   sentencia_n 
elif expresionlogica_3:
   sentencia_1
   sentencia_2
   ...
   sentencia_n 
elif expresionlogica_4:
   sentencia_1
   sentencia_2
   ...
   sentencia_n 
else:
   sentencia_1
   sentencia_2
   ...
   sentencia_n 

(2)

#!/usr/bin/env python
# -*- coding: utf8 -*-

def main():
    dia = int(input("Ingrese el número del día? "))
    if dia == 1:
       print('lunes')
    elif dia == 2:
        print('martes')
    elif dia == 3:
        print('miércoles')
    elif dia == 4:
        print('jueves')
    elif dia == 5:
        print('viernes')
    elif dia == 6:
        print('sábado')
    elif dia == 7:
        print('domingo')
    else:
        print('Error en la entrada')

if __name__ == "__main__":
   main()
   
************************
***   BUCLE: WHILE   ***
************************

(1)

def main():
    i = 0
    while i < 10:
          print(i)
          i = i + 1

*****************************
***   BUCLE: DO...WHILE   ***
*****************************

No existe pero lo podemos simular con un while infinito y un if al final		  
		  
def main():
    i = 0
    while True:
        print(i)
        i = i + 1
        if i >= 10:
           break

**********************
***   BUCLE: FOR   ***
**********************

def main1():
    print("FORMA 1")
    print("-------")
    for i in range(10):
        print(i)

def main2():
    print("FORMA 2")
    print("-------")
    for i in range(0,10,1):
        print(i)

def main3():
    print("FORMA 3")
    print("-------")
    for i in range(2,8,1):
        print(i)

def main4():
    for i in range(0,9,2):
        print(i)
		
def main5():
    os.system("cls")
    n = Entrada.numeroEnteroPositivo("Introduce un número entero positivo? ")
    for i in range(1, n+1, 2):
        print(i, end=", ")
		
def main6():
    os.system("cls")
    n = Entrada.numeroEnteroPositivo("Introduce un número entero positivo? ")
    for i in range(n, -1, -1):
        print(i, end=", ")
		
def main():
    os.system("cls")
    palabra = Entrada.nombre("Introduce una palabra? ")
    for i in range(len(palabra)-1, -1, -1):
        print(palabra[i])