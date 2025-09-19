/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;

/**
 *
 * @author WacheR
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sumar los números pares entre 1 y 10
        boolean alternancia = false ;
        int contador, resultado;
        contador = 1;
        resultado = 0;
        while (contador <= 10) {            
            if (alternancia) {
                resultado += contador;
            }
            alternancia= !alternancia;
            contador++;
        }
        System.out.println("El resultado es "+ resultado );
    }
    
}
