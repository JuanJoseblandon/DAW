/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author WacheR
 */
// leer 10 numeros y escribir el mayor de ellos
import java.util.Scanner;
public class Leer10Mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, may; 
        System.out.println("Escribe 10 numeros");
        num= sc.nextInt();
        may= num;
        for (int i = 2; i < 10; i++) {
            System.out.println("Escribe el número "+ i +":");
            num = sc.nextInt();
            if (num > may) {
                may = num;
            }
        }
        System.out.println("El número mayor es: "+may);
    }
}
