Funcion x <- xor (a,b)
	Si a = b Entonces 
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

Algoritmo CircuitoLogicoSumarDosBits
	Escribir Sin Saltar "Ingrese a? "; Leer a
	Escribir Sin Saltar "Ingrese b? "; Leer b
	s = xor(a,b)
	c = and(a,b)
	Escribir "Resultado: ",a,b,"-",c,s
FinAlgoritmo
