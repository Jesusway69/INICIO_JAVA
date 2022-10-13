Algoritmo OpcionCambioMoneda
	//1.Euro a dolares o 2.Dolares a Euros
	//ENTRADA
	Escribir "1. Euro a Peso Colombiano" // 1euro = 4415.39 pesos
	Escribir "2. Peso Colombiano a Euro"
	Escribir "Ingrese Opción? "
	Leer x
	
	Segun x Hacer
		1:
			Escribir "Ingrese cantidad euros? "
			Leer euros
			pesos = euros * 4415.39
			Escribir euros," euros es igual a ",pesos," pesos"
	    2:
			Escribir "Ingrese cantidad pesos? "
			Leer pesos
			euros = pesos / 4415.39
			Escribir pesos," pesos es igual a ",euros," euros"
		De Otro Modo:
			Escribir "Opción Incorrecta"
	Fin Segun
	
FinAlgoritmo
