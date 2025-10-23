Algoritmo sumaymedia10
	Definir num, sum,x Como Entero;
	Definir media Como Real
	media<-0;
	sum<-0;
	x<-1;
	Mientras x <= 10 Hacer
		Escribir "Escribe 10 números enteros";
		Leer num
		sum <- sum+num;
		x<- x+1 ;
		Escribir sum;
		
	FinMientras
	media<- sum / 10;
	Escribir "La suma de los numeros es: ",sum;
	Escribir "La  media de los numeros es: ",media;
FinAlgoritmo
