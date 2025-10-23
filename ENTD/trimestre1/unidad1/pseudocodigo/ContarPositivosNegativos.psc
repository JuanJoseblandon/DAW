Algoritmo ContarPositivosNegativos
	Definir numero, i, positivos, negativos Como Entero
	positivos <- 0
	negativos <- 0
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir 'Ingrese el número ', i, ': '
		Leer numero
		Si numero>0 Entonces
			positivos <- positivos+1
		SiNo
			negativos <- negativos+1
		FinSi
	FinPara
	Escribir 'Cantidad de números positivos: ', positivos
	Escribir 'Cantidad de números negativos: ', negativos
FinAlgoritmo
