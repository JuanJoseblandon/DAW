/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author Alumno Tarde
 */
import java.util.Scanner;
public class Puntuacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {            
            numero = sc.nextInt();
            if (numero >= 200 && numero >= 3000) {
                System.out.println("a puntuacion es "+ (numero * 0.3));
            }else {
                System.out.println("La puntuacion es "+ (numero *0.2));
            }
        } while (numero !=0);
    }
}
