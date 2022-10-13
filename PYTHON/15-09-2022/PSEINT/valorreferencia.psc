Funcion entrada (v Por Referencia)
	Escribir "Ingresa un número 1? "
	Leer a
	Escribir "Ingresa un número 2? "
	Leer b
	v[1] = a
	v[2] = b
Fin Funcion

Funcion s <- procesar (v Por Referencia)
   s = v[1]+v[2]
Fin Funcion
	
Funcion salida(s)
	Escribir "Suma: ", s
Fin Funcion

Algoritmo Suma
	Definir v Como Entero
	Dimension v[2]
	//ENTRADA
	entrada(v)
	//PROCESO
	s = procesar(v)
    //SALIDA	
	salida(s)
FinAlgoritmo
