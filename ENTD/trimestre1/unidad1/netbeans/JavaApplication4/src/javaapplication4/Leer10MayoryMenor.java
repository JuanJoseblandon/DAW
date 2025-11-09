/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author WacheR
 */
//Leer 10 numeros y escribir el mayor y el menor
import java.util.Scanner;
public class Leer10MayoryMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,may,men;
        System.out.println("Escribe 10 numeros");
        num=sc.nextInt();
        may=num;
        men=num;
        for (int i = 2; i <= 10; i++) {
            System.out.println("Escribe el numero "+ i + " :");
            num = sc.nextInt();
            
            if (num > may) {
                may=num;
            } else {
                men=num;
            }
        }
        System.out.println("El numero mayor es: "+ may);
        System.out.println("El numero menor es: "+ men);
    }
}
