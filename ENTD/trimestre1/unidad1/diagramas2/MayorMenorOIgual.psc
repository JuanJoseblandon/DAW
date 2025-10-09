Algoritmo MayorMenorOIgual
	Definir numero, i, mayores, menorigual Como Entero
	mayores <- 0
	menorigual <- 0
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir 'Ingrese el número ', i, ': '
		Leer numero
		Si numero>10 Entonces
			Escribir numero, ' es mayor que 10'
			mayores <- mayores+1
		SiNo
			Escribir numero, ' es menor o igual  que 10'
			menorigual <- menorigual+1
		FinSi
	FinPara
	Escribir '----------------------------'
	Escribir 'Cantidad de números mayores que 10: ', mayores
	Escribir 'Cantidad de números menores  o iguales  que 10: ', menorigual
	Escribir '----------------------------'
FinAlgoritmo
