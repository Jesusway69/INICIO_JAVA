Algoritmo EvaluarNumeroParImpar
	Definir n Como Entero
	Definir mensaje Como Caracter
	//ENTRADA
	Escribir "Ingrese número n? "
	Leer n
	//PROCESO
	Si (n%2) = 0 Entonces
	    mensaje = "Par"
	SiNo
	    mensaje = "Impar"
	Fin Si
	//SALIDA
	Escribir mensaje
FinAlgoritmo
