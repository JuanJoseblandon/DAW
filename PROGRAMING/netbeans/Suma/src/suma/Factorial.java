/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author WacheR
 */
public class Factorial {
    public static void main(String[] args) {
        int numero, factorial, contador;
        numero= 5;
        factorial= 1;
        contador= numero;

        while (contador > 1) {            
            factorial *=contador--;
            System.out.println("Resultado "+ factorial);
        }
    }
}
