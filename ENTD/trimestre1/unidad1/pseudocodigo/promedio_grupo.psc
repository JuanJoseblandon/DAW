Proceso EdadMediaGrupoMientras
    Definir i, edad, suma Como Entero
    Definir promedio Como Real
	
    i <- 1
    suma <- 0
	
    Mientras i <= 30 Hacer
        Escribir "Ingrese la edad de la persona ", i, ":"
        Leer edad
        suma <- suma + edad
        i <- i + 1
    FinMientras
	
    promedio <- suma / 30
	
    Escribir "La edad media del grupo es: ", promedio
FinProceso
