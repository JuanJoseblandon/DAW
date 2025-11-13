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
public class ContarPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, positivos = 0, negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        System.out.println("----------------------------");
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("----------------------------");

    }
}
