/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin1;

/**
 *
 * @author JuanJoseblandon
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
        float media = (nota1+nota2+nota3)/3;
        int Pentera = (int)media;
        System.out.println("La parte entera de la media es "+Pentera);
//        float pdecimal = (float)media - Pentera;
//        float redondeo =pdecimal * 10 ;
//        int redondeo2 = (int)redondeo;
//        if (redondeo2 >= 5) {
//            Pentera= Pentera+1;
//            redondeo2=0;
//            System.out.println("El resultado es redondeado es  "+Pentera +"."+redondeo2);
//        } else {
//            System.out.println("El resultado es "+Pentera+"."+redondeo2);
//        }
    }
}
