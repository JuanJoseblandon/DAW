/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author WacheR
 */
//leer edades de cada persona del grupo y optener la edad media del grupo
public class mediaedad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[10];
        int[] edades = new int[10];
        int sumaEdades = 0;

        // Leer datos de las 10 personas
        for (int i = 0; i < 30; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            sumaEdades += edades[i];
        }

        // Calcular edad media
        double edadMedia = (double) sumaEdades / 10;

        // Mostrar resultados
        System.out.println("\n--- Datos ingresados ---");
        for (int i = 0; i < 30; i++) {
            System.out.println(nombres[i] + " tiene " + edades[i] + " años.");
        }

        System.out.printf("\nLa edad media es: %.2f años\n", edadMedia);
    }
}
