/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author WacheR
 */
/* Leer el nombre y la fecha de nacimiento de cada persona del 
grupo y obtener el nombre de la persona más joven y de la más 
mayor*/
import java.util.Scanner;
public class nombreFechaMayorMenor {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[10];
        int[] dias = new int[10];
        int[] meses = new int[10];
        int[] años = new int[10];

        // Leer datos
        for (int i = 0; i < 10; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();

            System.out.print("Día de nacimiento: ");
            dias[i] = sc.nextInt();

            System.out.print("Mes de nacimiento: ");
            meses[i] = sc.nextInt();

            System.out.print("Año de nacimiento: ");
            años[i] = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            System.out.println();
        }

        // Inicializamos con la primera persona
        int indiceMasJoven = 0;
        int indiceMasMayor = 0;

        for (int i = 1; i < 10; i++) {
            // --- Comparar para más joven (fecha más reciente) ---
            if (años[i] > años[indiceMasJoven] ||
                (años[i] == años[indiceMasJoven] && meses[i] > meses[indiceMasJoven]) ||
                (años[i] == años[indiceMasJoven] && meses[i] == meses[indiceMasJoven] && dias[i] > dias[indiceMasJoven])) {
                indiceMasJoven = i;
            }

            // --- Comparar para más mayor (fecha más antigua) ---
            if (años[i] < años[indiceMasMayor] ||
                (años[i] == años[indiceMasMayor] && meses[i] < meses[indiceMasMayor]) ||
                (años[i] == años[indiceMasMayor] && meses[i] == meses[indiceMasMayor] && dias[i] < dias[indiceMasMayor])) {
                indiceMasMayor = i;
            }
        }

        // Mostrar resultados
        System.out.println("La persona más joven es: " + nombres[indiceMasJoven] +
                " (Nació el " + dias[indiceMasJoven] + "/" + meses[indiceMasJoven] + "/" + años[indiceMasJoven] + ")");
        System.out.println("La persona más mayor es: " + nombres[indiceMasMayor] +
                " (Nació el " + dias[indiceMasMayor] + "/" + meses[indiceMasMayor] + "/" + años[indiceMasMayor] + ")");
    }
}
