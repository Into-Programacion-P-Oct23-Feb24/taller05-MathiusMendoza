/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema002;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double hijo_1;
        double hijo_2;
        double hijo_3;
        double total_gastos;
        
        System.out.println("Ingrese los gastos del hijo 1 es ");
        hijo_1 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del hijo 2 es ");
        hijo_2 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del hijo 3 es ");
        hijo_3 = entrada.nextDouble();
        total_gastos = hijo_1 + hijo_2 + hijo_3;
        System.out.printf("El total de gastos de los 3 hijos es: %.2f", total_gastos);

    }
    
}
