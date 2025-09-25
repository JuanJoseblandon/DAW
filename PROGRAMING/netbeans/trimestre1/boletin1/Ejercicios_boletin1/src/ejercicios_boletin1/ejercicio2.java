/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin1;
/**
 *
 * @author Juan jose blandon
 */
//Pedir al usuario su edad y mostrar la que tendrá el próximo año
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad= sc.nextInt();
        System.out.println("El año que viene tendras "+(edad + 1));
    }
}
