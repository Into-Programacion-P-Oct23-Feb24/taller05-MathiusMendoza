/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de dias de hospedaje: ");
        int numDias = scanner.nextInt();
        System.out.print("Ingrese el precio diario de la habitacion: ");
        double precioDiario = scanner.nextDouble();
        double subtotal = calcularSubtotal(numDias, precioDiario);
        double descuento = calcularDescuento(numDias, subtotal);
        double totalPagar = subtotal - descuento;
        System.out.println("\nResumen del Hospedaje:");
        System.out.println("Numero de dias: " + numDias);
        System.out.println("Precio diario de la habitacion: " + precioDiario);
        System.out.printf("Subtotal por pagar: %.2f%n", subtotal);
        System.out.printf("Descuento aplicado: %.2f%n", descuento);
        System.out.printf("Total por pagar: %.2f%n", totalPagar);
    }
        public static double calcularSubtotal(int numDias, double precioDiario) {
        return numDias * precioDiario;
    }
        public static double calcularDescuento(int numDias, double subtotal) {
        if (numDias > 15) {
            return 0.20 * subtotal;  
        } else if (numDias > 10) {
            return 0.15 * subtotal; 
        } else if (numDias > 5) {
            return 0.10 * subtotal;
        } else {
            return 0.0; 
}}
}

