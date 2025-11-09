/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author WacheR
 */
//leer 10 números y obtener su suma y su media
import java.util.Scanner;
public class leer10numsumaymedia {
    public static void main(String[] args) {
        int num ;
        int sum=0;
        int x=0;
        int contador=1;
        float media=0;
        Scanner sc =  new Scanner (System.in);
        System.out.println("Escribe 10 números enteros");
//        num = sc.nextInt();       
        while (x != 10 ) {
            System.out.println("Escribe el número "+ contador);
            num = sc.nextInt();
            sum= sum+num;
            x++;
            contador++;
        }
        media = sum/10;
        System.out.println("La suma de los números es: "+ sum);
        System.out.println("La media es de los números es: "+ media);
    }
    
}
