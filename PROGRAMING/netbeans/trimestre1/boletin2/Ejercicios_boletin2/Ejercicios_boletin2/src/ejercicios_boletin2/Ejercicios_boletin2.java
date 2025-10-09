/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_boletin2;

/**
 *
 * @author WacheR
 */
import java.util.Scanner;
public class Ejercicios_boletin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner (System.in);
        System.out.println("Escribe un numero entero: ");
        int numero = sc.nextInt();
        if (numero % 2 == '0') {
            System.out.println("El numero "+numero+" es par");
        } else{
            System.out.println("El numero "+numero+" es impar");
        }

    }
    
}
