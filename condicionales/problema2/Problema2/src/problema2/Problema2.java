/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String articuloL;
        int cantidadN;
        double precioC;
        double costoP;
        double descuentoP;
        System.out.println("Ingrese el nombre del articulo por favor");
        articuloL = entrada.nextLine();
        System.out.println("ingrese la cantidad de articulos por favor");
        cantidadN = entrada.nextInt();
        System.out.println("Ingrese el costo del articulo por favor");
        precioC = entrada.nextDouble();
        costoP = cantidadN * precioC;
        
        if (cantidadN > 50){
            descuentoP = (costoP * 15)/100;
            costoP = costoP - descuentoP;
            System.out.printf("El csoto de su pedido es tal %.2f", costoP);
      
        } else {
            System.out.printf("El costo total es de: %.2f ", costoP);
        }
        
                
        
        
        
        
    }
    
}
