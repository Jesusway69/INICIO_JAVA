Algoritmo ConversionMoneda
	//1.Euro a dolares o 2.Dolares a Euros
	//ENTRADA
	Escribir "1. Euro a Peso Colombiano" // 1euro = 4415.39 pesos
	Escribir "2. Peso Colombiano a Euro"
	Escribir "Ingrese Opción? "
	Leer x
	
	Si x = 1 o x = 2 Entonces
		Si x = 1 Entonces
				Escribir "Ingrese cantidad euros? "
				Leer euros
				pesos = euros * 4415.39
				Escribir euros," euros es igual a ",pesos," pesos"
		FinSi		
		Si x = 2 Entonces
				Escribir "Ingrese cantidad pesos? "
				Leer pesos
				euros = pesos / 4415.39
				Escribir pesos," pesos es igual a ",euros," euros"
		FinSi
	Sino
		Escribir "Opción Incorrecta"
	FinSi
FinAlgoritmo
