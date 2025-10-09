/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin2;

/**
 *
 * @author Alumno Tarde
 */
public class metodos {
    public static void main(String[] args) {
        cuadrado(6,false);
        System.out.println("");
        cuadrado(6,true);
    }
//    public static void cuadrado (int n ) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//    }
    public static void cuadrado (int n, boolean vacio ) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n-1){ 
                    System.out.print("* ");
                }else{
                    System.out.print(vacio ? "  " : "* " );
                }
            }
            System.out.println();
        }        
    }
}
