/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin1;

/**
 *
 * @author WacheR
 */
import java.util.Scanner;
public class ejercicio_8 {
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
        PrecioPeras=(float) 1.95;
        PrecioManzanas=(float) 2.35;
        
//Datos introducidos por terminal
        System.out.println("Introduce los kilos de Peras: ");
        Scanner sc =  new Scanner (System.in);
        KilosPeras= sc.nextFloat();
        System.out.println("Introduce los kilos de Manzanas: ");        
        KilosManzanas= sc.nextFloat();
        
//Calculos
        GananciaPeras=PrecioPeras * KilosPeras;
        GananciaManzanas=PrecioManzanas * KilosManzanas;
        GananciaTrimestral=GananciaPeras + GananciaManzanas;
        GananciaAnual=GananciaTrimestral * 4;
        
//        int enteroTrimestral = (int)GananciaTrimestral;
//        int enteroAnual = (int)GananciaAnual;
//        float decimalTrimestral = GananciaTrimestral - enteroTrimestral;
//        float decimalAnual = GananciaAnual - enteroAnual;
//        int redondeo =(int)(decimalTrimestral*10);
//        int redondeo2 =(int)(decimalAnual*10);
//        System.out.println(enteroAnual);
//        System.out.println(enteroTrimestral);
//        System.out.println(decimalAnual);
//        System.out.println(decimalTrimestral);
//        System.out.println(redondeo);
//        System.out.println(redondeo2);

        System.out.println("Tus ganacias trimestrales son: "+GananciaTrimestral+"$");
        System.out.println("Tus ganacias anuales son: "+GananciaAnual+"$");
        
        
    }
}
