Proceso MayorYMenorDeDiezNumeros_Mientras
	Definir numero, mayor, menor, i Como Entero
	
	// Inicializar variables
	i <- 1
	Escribir "Ingrese el n�mero ", i, ": "
	Leer numero
	
	// Como es el primer n�mero, lo tomamos como referencia
	mayor <- numero
	menor <- numero
	
	// Continuar con los siguientes
	i <- i + 1
	
	Mientras i <= 10 Hacer
		Escribir "Ingrese el n�mero ", i, ": "
		Leer numero
		
		Si numero > mayor Entonces
			mayor <- numero
		FinSi
		
		Si numero < menor Entonces
			menor <- numero
		FinSi
		
		i <- i + 1
	FinMientras
	
	Escribir "El mayor n�mero es: ", mayor
	Escribir "El menor n�mero es: ", menor
FinProceso
