/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema004;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
         
         double cpu;
         double teclado;
         double raton;
         double pantalla;
         double totalComputadora;
         
         System.out.println("Ingrese el valor de la CPU es ");
         cpu = entrada.nextDouble();
         System.out.println("Ingrese el valor del teclado es");
         teclado = entrada.nextDouble();
         System.out.println("Ingrese el valor del raton es ");
         raton = entrada.nextDouble();
         System.out.println("Ingrese el valor de la pantalla es ");
         pantalla = entrada.nextDouble();
         totalComputadora = cpu + teclado + raton + pantalla;
         
         System.out.printf("El costo total de la computadora es: %.2f", totalComputadora);
    }
    
}
