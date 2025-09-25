/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin1;

/**
 *
 * @author JuanJose
 */
/** Escribir una aplicación que pida el año actual y el de nacimiento del usuario. Debe
 calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.**/
import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el año actual");
        int año = sc.nextInt();
        System.out.println("Escribe tu año de nacimiento");
        int año1=sc.nextInt();
        int edad = año - año1;
        System.out.println("Tu edad es "+ edad);
    }
}
