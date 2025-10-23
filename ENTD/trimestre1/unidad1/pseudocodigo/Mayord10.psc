Proceso Mayord10
	Definir num, men,x  Como Entero;
	may <-- 0;
	x <--1;
	Mientras x <= 10 Hacer
		Escribir "ingrese el numero ",i," :";
		Leer  num
		si num > may Entonces
			men <- num;
			
		FinSi
		x <- x+1;
	FinMientras
	Escribir "El mayor es: ", men;
FinProceso
