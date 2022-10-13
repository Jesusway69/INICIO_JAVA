Funcion x <- inversor (a)
	Si a=1 Entonces
		x = 0
	SiNo
		x = 1
	FinSi
Fin Funcion

Funcion x <- nor (a,b)
	Si a=0 y b=0 Entonces
		x = 1
	SiNo
		x = 0
	FinSi
Fin Funcion

Funcion x <- nand (a,b)
	Si a=1 y b=1 Entonces
		x = 0
	SiNo
		x = 1
	FinSi
Fin Funcion

Funcion x <- and (a,b)
	Si a=1 y b=1 Entonces
		x = 1
	SiNo
		x = 0
	FinSi
Fin Funcion

Algoritmo CircuitoLogico
	Escribir Sin Saltar "Ingrese a? "; Leer a
	Escribir Sin Saltar "Ingrese b? "; Leer b
	Escribir Sin Saltar "Ingrese c? "; Leer c
	Escribir Sin Saltar "Ingrese d? "; Leer d
	x1 = nand(a,b)
	x2 = nor(c,d)
	x3 = inversor(x1)
	x4 = inversor(x2)
	yy = and(x3,x4)
	Escribir "Resultado: ", yy
FinAlgoritmo
