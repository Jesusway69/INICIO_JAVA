Algoritmo CoordenadaPolar
	Definir xx,xy,r,a Como Real
	//ENTRADA
	Escribir "Ingrese x? "
	Leer xx
	Escribir "Ingrese y? "
	Leer xy
	//PROCESO
	r = Raiz(xx^2 + xy^2)
	a = Atan(xy/xx) * 180 / PI
	//SALIDA
	Escribir "Radio: ",r
	Escribir "Angulo: ",a
	Escribir "(",xx,",",xy,")","-->","(",r,",",a,")"
FinAlgoritmo
