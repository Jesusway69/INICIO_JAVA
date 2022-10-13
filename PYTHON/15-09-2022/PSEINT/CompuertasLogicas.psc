Funcion x <- Disyuncion (a,b)
	Si a=0 y b=0 Entonces
		x = 0
	SiNo
		x = 1
	FinSi
Fin Funcion

Funcion x <- conjuncion (a,b)
	Si a=1 y b=1 Entonces
		x = 1
	SiNo
		x = 0
	FinSi
Fin Funcion

Algoritmo CompuertaLogicas
    Escribir Sin Saltar "Ingrese a? "; Leer a
	Escribir Sin Saltar "Ingrese b? "; Leer b
	Escribir Sin Saltar "Ingrese c? "; Leer c
	x1 = Disyuncion(a,b)
	x2 = Conjuncion(x1,c)
	Escribir "Resultado: ",x2
FinAlgoritmo
