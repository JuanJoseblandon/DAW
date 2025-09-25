/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin1;

/**
 *
 * @author Alumno Tarde
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame la primera nota ");
        float nota1 = sc.nextFloat();
        System.out.println("dame la segunda  nota ");
        float nota2 = sc.nextFloat();
        System.out.println("dame la tercera  nota ");
        float nota3 = sc.nextFloat();
        float media = nota1+nota2+nota3%3;
        int Pentera = (int)media;
        float pdecimal = (float)media - Pentera;
        float redondeo =pdecimal * 10 ;
        int redondeo2 = (int)redondeo;
        if (redondeo2 >= 5) {
            Pentera= Pentera+1;
            redondeo2=0;
            System.out.println("El resultado es redondeado es  "+Pentera +"."+redondeo2);
        } else {
            System.out.println("El resultado es "+Pentera+"."+redondeo2);
        }
//        System.out.println(redondeo2);
//        System.out.println("esto es la parte entera "+Pentera);
//        System.out.println("esto es la parte decimal "+pdecimal);
//        System.out.println("esto es la parte decimal redondeada "+redondeo);
//        System.out.println("esto es la parte decimal redondeada a 1 cifra "+redondeo2);
//        System.out.println("El resultado sería "+Pentera+ "." +redondeo2);



    }
}
