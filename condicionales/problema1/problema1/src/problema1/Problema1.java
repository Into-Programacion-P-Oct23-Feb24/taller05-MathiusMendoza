/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ITALY);
        
        
        double costokv;
        double consumokv;
        int edad;
        double costoPlanilla;
        double descuento;
        
        System.out.println("Ingrese el costo de kilovatios por favor");
        costokv = entrada.nextDouble();
        System.out.println("Ingrese el consumo mesual de kilovatios por favor");
        consumokv = entrada.nextDouble();
        System.out.println("Ingrese su edad por favor");
        edad = entrada.nextInt();
        costoPlanilla = costokv * consumokv;
        if (edad > 65){
            descuento = (costoPlanilla * 10) / 100;
            costoPlanilla = (costoPlanilla - descuento );
            System.out.printf("El total a pagar es: %.2f", costoPlanilla); 
        } else {
            System.out.printf("El total a pagar es: %.2f",costoPlanilla);
        }
        
        
        
        
    }
    
}
