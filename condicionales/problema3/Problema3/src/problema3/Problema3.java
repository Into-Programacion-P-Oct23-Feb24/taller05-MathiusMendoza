/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la marca del auto: ");
        String marca = scanner.nextLine();
        
        System.out.print("Ingrese el origen del auto (Alemania, Japón, Italia, USA): ");
        String origen = scanner.nextLine();
        
        System.out.print("Ingrese el costo del auto: ");
        double costo = scanner.nextDouble();
        
        // Calcular el impuesto y el precio de venta
        double impuesto = calcularImpuesto(origen, costo);
        double precioVenta = costo + impuesto;
        
        // Mostrar el resultado
        System.out.println("\nResumen del Auto:");
        System.out.println("Marca: " + marca);
        System.out.println("Origen: " + origen);
        System.out.println("Costo del auto: $" + costo);
        System.out.printf("Impuesto por pagar: $%.2f%n", impuesto);
        System.out.printf("Precio de venta  : $%.2f%n", precioVenta);
        
        // Cerrar el scanner
        scanner.close();
    }
    
    public static double calcularImpuesto(String origen, double costo) {
        // Calcular el impuesto según el origen
        switch (origen.toUpperCase()) {
            case "ALEMANIA":
                return 0.20 * costo;
            case "JAPÓN":
                return 0.30 * costo;
            case "ITALIA":
                return 0.15 * costo;
            case "USA":
                return 0.08 * costo;
            default:
                System.out.println("Origen no válido. Se aplicará impuesto estándar del 10%.");
                return 0.10 * costo;
         }
}

}
