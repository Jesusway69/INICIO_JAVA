Algoritmo EcuaciónCuadratica
	Definir a,b,c,x1,x2 Como Real
	//ENTRADA
	Escribir "Ingresar A? "
	Leer a
	Escribir "Ingresar B? "
	Leer b
	Escribir "Ingresar C? "
	Leer c
	//PROCESO
	x1 = (-b + Raiz(b^2-4*a*c)) / (2*a) 
	x2 = (-b - Raiz(b^2-4*a*c)) / (2*a)
	//SALIDA
	Escribir "X1: ",x1 //System.out.print,  print
	Escribir "X2: ",x2
FinAlgoritmo
