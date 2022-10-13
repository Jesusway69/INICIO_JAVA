Algoritmo EvaluarNota
	//De 0 a 4,9: suspenso. De 5 a 6,9: aprobado. 
    //De 7 a 8,9: notable. De 9 a 10: sobresaliente
	Definir nota Como Real
	//ENTRADA
	Escribir "Ingrese nota? "
	Leer nota
	//EVALUAR - PROCESO - SALIDA
	Si nota < 0 o nota > 10 Entonces
	   Escribir "Nota no valida"
    SiNo
		Si nota >= 0 y nota<5 Entonces
			Escribir "Suspenso"
		FinSi
		Si nota >=5 y nota<7 Entonces
			Escribir "Aprobado"
		FinSi
		Si nota >=7 y nota<9 Entonces
			Escribir "Notable"
		FinSi
		Si nota >=9 y nota<=10 Entonces
			Escribir "Sobresaliente"
		FinSi
	FinSi
FinAlgoritmo
