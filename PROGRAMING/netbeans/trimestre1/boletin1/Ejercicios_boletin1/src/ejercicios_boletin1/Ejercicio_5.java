/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin1;

/**
 *
 * @author Alumno Tarde
 */
//ejercicio5
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame la primera nota en numeros enteros");
        int nota1 = sc.nextInt();
        System.out.println("dame la segunda  nota en numeros enteros");
        int nota2 = sc.nextInt();
        int media = nota1+nota2%2;
        System.out.println("La media aritmetica es "+ media);
    }
}
