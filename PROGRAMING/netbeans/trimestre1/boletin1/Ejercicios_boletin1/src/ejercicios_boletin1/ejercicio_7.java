/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin1;

/**
 *
 * @author Alumno Tarde
 */
//ejercicio7
import java.util.Scanner;
public class ejercicio_7 {
    public static void main(String[] args) {
        System.out.println("Introduce un número decimal: ");
        Scanner sc = new Scanner (System.in);
        float numero = sc.nextFloat();
        int entero = (int)numero;
        float decimal = numero - entero;
        int redondeo = (int)(decimal * 10);
//        System.out.println("numero como tal "+numero);
//        System.out.println("parte entera "+entero );
//        System.out.println("decimal "+decimal);
//        System.out.println("decimal*10 "+redondeo);

        if (redondeo < 5) {
            System.out.println("EL redondeo aprox es: "+entero +"."+(redondeo)%10 );
        } else {
            entero =entero+1;
            System.out.println("El redondeo es: "+entero);
        }
    }
}
