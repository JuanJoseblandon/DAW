/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin2;

/**
 *
 * @author Alumno Tarde
 */
public class NewClass {
    public static void main(String[] args) {
        int lado = 6;

        System.out.println("Cuadrado con interior vacío:");
        dibujarCuadrado(lado, true);

        System.out.println("Cuadrado con interior lleno:");
        dibujarCuadrado(lado, false);
    }    
    public static void dibujarCuadrado(int lado, boolean interiorVacio) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    // Interior: vacío o lleno
                    System.out.print(interiorVacio ? "  " : "* ");
                }
            }
            System.out.println();
        }
    }


}
