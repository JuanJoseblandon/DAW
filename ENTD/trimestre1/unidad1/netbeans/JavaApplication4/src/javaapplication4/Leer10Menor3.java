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
//Leer 10 numeros y escribir el menor de ellos
public class Leer10Menor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, men; 
        System.out.println("Escribe 10 numeros");
        num= sc.nextInt();
        men= num;
        for (int i = 2; i < 10; i++) {
            System.out.println("Escribe el número "+ i +":");
            num = sc.nextInt();
            if (num < men) {
                men = num;
            }
        }
        System.out.println("El número es: "+ men);        
    }
}
