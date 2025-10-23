Algoritmo PersonaMasJovenYMayorMientras
    Definir i, dia, mes, anio Como Entero
    Definir nombre, nombreMasJoven, nombreMasMayor Como Cadena
    Definir diaJoven, mesJoven, anioJoven Como Entero
    Definir diaMayor, mesMayor, anioMayor Como Entero
	
    i <- 1
	
    // Pedir los datos de la primera persona
    Escribir "Ingrese el nombre de la persona ", i, ":"
    Leer nombre
    Escribir "Ingrese su fecha de nacimiento (dia, mes, anio):"
    Leer dia, mes, anio
	
    // Inicializamos con la primera persona
    nombreMasJoven <- nombre
    nombreMasMayor <- nombre
	
    diaJoven <- dia
    mesJoven <- mes
    anioJoven <- anio
	
    diaMayor <- dia
    mesMayor <- mes
    anioMayor <- anio
	
    i <- i + 1
	
    Mientras i <= 30 Hacer
        // Pedir los datos de la persona i
        Escribir "Ingrese el nombre de la persona ", i, ":"
        Leer nombre
        Escribir "Ingrese su fecha de nacimiento (dia, mes, anio):"
        Leer dia, mes, anio
		
        // Comparar si es más joven
        Si (anio > anioJoven) O (anio = anioJoven Y mes > mesJoven) O (anio = anioJoven Y mes = mesJoven Y dia > diaJoven) Entonces
            nombreMasJoven <- nombre
            diaJoven <- dia
            mesJoven <- mes
            anioJoven <- anio
        FinSi
		
        // Comparar si es más mayor
        Si (anio < anioMayor) O (anio = anioMayor Y mes < mesMayor) O (anio = anioMayor Y mes = mesMayor Y dia < diaMayor) Entonces
            nombreMasMayor <- nombre
            diaMayor <- dia
            mesMayor <- mes
            anioMayor <- anio
        FinSi
		
        i <- i + 1
    FinMientras
	
    // Mostrar los resultados
    Escribir "La persona más joven es: ", nombreMasJoven
    Escribir "La persona más mayor es: ", nombreMasMayor
FinAlgoritmo
