/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

/**
 *
 * @author WacheR
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**   System.out.println("que paza pisha");
        System.out.println("aqui joaquin"); **/
        int multiplicando, multiplicador, contador, producto;
        multiplicador= 6;
        multiplicando= 5;
        contador=0;
        producto=1;
//        System.out.println("antes del bucle");//debug
        while (contador<multiplicador) {
            producto += multiplicando;
            contador++;
//            System.out.println("Dentro del bucle " +producto );//debug
            
        }
        System.out.println("El resultado es: "+ producto);
    }
    
}
