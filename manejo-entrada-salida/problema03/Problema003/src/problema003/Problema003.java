/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema003;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoMin;
        double minutos;
        double total_mensual;

        System.out.println("Ingrese el costo por minuto telefonico a ");
        costoMin = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de minutos que consumió este mes fue");
        minutos = entrada.nextDouble();
        total_mensual = costoMin * minutos;

        System.out.printf("El valor a pagar de su planilla telefonica es: %.2f", total_mensual);
    }
}
