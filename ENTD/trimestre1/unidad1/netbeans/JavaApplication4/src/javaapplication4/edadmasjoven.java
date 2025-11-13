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
/*Leer el nombre y la fecha de nacimiento de cada persona del 
grupo y obtener el nombre de la persona más joven 
*/
public class edadmasjoven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[10];
        int[] edades = new int[10];

        // Leer datos de las 10 personas
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = sc.nextInt();
        }

        // Encontrar el más joven
        int edadMinima = edades[0];
        String nombreMasJoven = nombres[0];

        for (int i = 1; i < 10; i++) {
            if (edades[i] < edadMinima) {
                edadMinima = edades[i];
                nombreMasJoven = nombres[i];
            }
        }
        
        System.out.println("La persona más joven es " + nombreMasJoven + " con " + edadMinima + " años.");
    }
}
