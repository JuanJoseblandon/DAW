Proceso MenorDeDiezNumeros_Mientras
	Definir numero, menor, i Como Entero
	
	// Inicializar el menor con un valor muy grande
	menor <- 999999
	i <- 1
	
	Mientras i <= 10 Hacer
		Escribir "Ingrese el n�mero ", i, ": "
		Leer numero
		
		Si numero < menor Entonces
			menor <- numero
		FinSi
		
		i <- i + 1
	FinMientras
	
	Escribir "El menor n�mero es: ", menor
FinProceso
