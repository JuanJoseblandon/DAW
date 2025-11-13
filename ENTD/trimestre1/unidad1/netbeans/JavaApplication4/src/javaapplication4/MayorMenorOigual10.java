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
public class MayorMenorOigual10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int numero, mayores = 0, menorigual = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            if (numero > 10) {
                System.out.println(numero + " es mayor que 10");
                mayores++;
            } else {
                System.out.println(numero + " es menor o igual que 10");
                menorigual++;
            }
        }

        System.out.println("----------------------------");
        System.out.println("Cantidad de números mayores que 10: " + mayores);
        System.out.println("Cantidad de números menores o iguales que 10: " + menorigual);
        System.out.println("----------------------------");
    }
}
