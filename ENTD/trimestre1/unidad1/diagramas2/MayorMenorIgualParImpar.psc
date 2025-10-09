Algoritmo MayorMenorIgualParImpar
	Definir numero, i, mayores, menorigual, pares, impares Como Entero
	mayores <- 0
	menorigual <- 0
	pares <- 0
	impares <- 0
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir 'Ingrese el número ', i, ': '
		Leer numero
		// Verificar si es mayor o menor/igual a 10
		Si numero>10 Entonces
			Escribir numero, ' es mayor que 10'
			mayores <- mayores+1
		SiNo
			Escribir numero, ' es menor o igual que 10'
			menorigual <- menorigual+1
		FinSi
		// Verificar si es par o impar
		Si numero MOD 2=0 Entonces
			Escribir numero, ' es par'
			pares <- pares+1
		SiNo
			Escribir numero, ' es impar'
			impares <- impares+1
		FinSi
	FinPara
	Escribir '----------------------------'
	Escribir 'Cantidad de números mayores que 10: ', mayores
	Escribir 'Cantidad de números menores o iguales que 10: ', menorigual
	Escribir 'Cantidad de números pares: ', pares
	Escribir 'Cantidad de números impares: ', impares
	Escribir '----------------------------'
FinAlgoritmo
