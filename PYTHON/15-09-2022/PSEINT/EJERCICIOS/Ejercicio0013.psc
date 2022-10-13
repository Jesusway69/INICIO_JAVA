Algoritmo LanzarDado
	//Hacer un programa que lance n veces un dado y nos diga cuantas veces aparece cada número
	//Aleatorio(1,6)      a = a + 1
	Definir x1,x2,x3,x4,x5,x6 Como Entero
	x1 = 0;
	x2 = 0;
	x3 = 0;
	x4 = 0;
	x5 = 0;
	x6 = 0;
	Escribir "Ingrese número de lanzamientos? "; Leer n
	Para i=1 hasta n Hacer
		 a = Aleatorio(1,6)             //Azar(n)  0...n-1 = Azar(5) = 0 1 2  3 4 = Azar(6) + 1 = 0 1 2 3 4 5
		 Escribir "Lanzamiento ",i," es: ",a
		 Segun a Hacer
				1:x1 = x1+1
				2:x2 = x2+1
				3:x3 = x3+1
				4:x4 = x4+1
				5:x5 = x5+1
				6:x6 = x6+1
		 Fin Segun
 	FinPara
	Escribir "n#1 = ",x1," n#2 = ",x2," n#3 = ",x3," n#4 = ",x4," n#5 = ",x5," n#6 = ",x6
FinAlgoritmo

	
