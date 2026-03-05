/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_boletin1;

/**
 *
 * @author Juan Jose Blandón
 */
import java.util.Scanner;
public class Ejercicios_boletin1 {
    // Ejercicio 1
/*
 /  public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int input = sc.nextInt();
        System.out.println("El número entero  introducido es "+ input);
                
    }
    
}
*/
    public static String procesarNumero(int input) {
        return "el numero entero introducido es " + input;
            
    }
    public static int leerNumero() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número entero: ");
    return sc.nextInt();
    }
    public static void main(String[] args) {
        int numero = leerNumero();
        String resultado = procesarNumero(numero);
        System.out.println(resultado);
    }
}    
