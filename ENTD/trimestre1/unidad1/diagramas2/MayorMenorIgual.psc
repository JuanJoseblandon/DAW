Algoritmo MayorMenorIgual
	Definir numero, i, mayores, menores, iguales Como Entero
	mayores <- 0
	menores <- 0
	iguales <- 0
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir 'Ingrese el n�mero ', i, ': '
		Leer numero
		Si numero>10 Entonces
			mayores <- mayores+1
		SiNo
			Si numero<10 Entonces
				menores <- menores+1
			SiNo
				iguales <- iguales+1
			FinSi
		FinSi
	FinPara
	Escribir 'Cantidad de n�meros mayores que 10: ', mayores
	Escribir 'Cantidad de n�meros menores que 10: ', menores
	Escribir 'Cantidad de n�meros iguales a 10: ', iguales
FinAlgoritmo
