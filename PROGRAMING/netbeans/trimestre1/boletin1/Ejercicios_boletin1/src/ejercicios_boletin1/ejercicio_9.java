/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin1;

import java.util.Scanner;

/**
 *
 * @author WacheR
 */
public class ejercicio_9 {
    public static void main(String[] args) {

//Variables introducidas por el usuario
        float KilosPeras,KilosManzanas=0;
        
//variables preestablecidas
        float PrecioPeras,  PrecioManzanas;
        
//variables calculadas
        float GananciaPeras,GananciaManzanas,GananciaTrimestral,GananciaAnual;
        
// inicializacion de varibles
        GananciaPeras=0;
        GananciaManzanas=0;
        GananciaTrimestral=0;
        GananciaAnual=0;
        
//Datos introducidos por terminal
        System.out.println("Dame el precio acutal de Manzanas");
        Scanner sc =  new Scanner (System.in);
        PrecioManzanas=sc.nextFloat();
        System.out.println("Dame el precio actual de Peras");
        PrecioPeras = sc.nextFloat();
        System.out.println("Introduce los kilos de Peras: ");
        KilosPeras= sc.nextFloat();
        System.out.println("Introduce los kilos de Manzanas: ");        
        KilosManzanas= sc.nextFloat();
        
//Calculos
        GananciaPeras=PrecioPeras * KilosPeras;
        GananciaManzanas=PrecioManzanas * KilosManzanas;
        GananciaTrimestral=GananciaPeras + GananciaManzanas;
        GananciaAnual=GananciaTrimestral * 4;
        
        System.out.println("Tus ganacias trimestrales son: "+GananciaTrimestral+"$");
        System.out.println("Tus ganacias anuales son: "+GananciaAnual+"$");
    }
}
