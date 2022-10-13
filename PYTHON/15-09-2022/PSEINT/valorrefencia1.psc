Funcion incrementaV (b Por Valor)
	b <- b + 5
	Escribir "b1 = ",b
Fin Funcion

Funcion incrementaR (a Por Referencia)
	a <- a + 5
	Escribir "a1 = ",a
Fin Funcion

Algoritmo Principal
	b <- 15
	incrementaV(b)
	Escribir "b2 = ", b	
	
	a <- 15
	incrementaR(a)
	Escribir "a2 = ", a
FinAlgoritmo
