Algoritmo PersonaMasJovenMientras
	Definir i, dia, mes, anio Como Entero
	Definir nombre, nombreMasJoven Como Cadena
	Definir diaJoven, mesJoven, anioJoven Como Entero
	i <- 1
	// Pedir los datos de la primera persona
	Escribir 'Ingrese el nombre de la persona ', i, ':'
	Leer nombre
	Escribir 'Ingrese su fecha de nacimiento (dia, mes, anio):'
	Leer dia, mes, anio
	// Inicializamos con la primera persona
	nombreMasJoven <- nombre
	diaJoven <- dia
	mesJoven <- mes
	anioJoven <- anio
	i <- i+1
	Mientras i<=30 Hacer
		// Pedir los datos de la persona i
		Escribir 'Ingrese el nombre de la persona ', i, ':'
		Leer nombre
		Escribir 'Ingrese su fecha de nacimiento (dia, mes, anio):'
		Leer dia, mes, anio
		// Comparar si esta persona es más joven
		Si (anio>anioJoven) O (anio=anioJoven Y mes>mesJoven) O (anio=anioJoven Y mes=mesJoven Y dia>diaJoven) Entonces
			nombreMasJoven <- nombre
			diaJoven <- dia
			mesJoven <- mes
			anioJoven <- anio
		FinSi
		i <- i+1
	FinMientras
	// Mostrar el resultado
	Escribir 'La persona más joven es: ', nombreMasJoven
FinAlgoritmo
