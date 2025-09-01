/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asignacion1;

/**
 *
 * @author krism
 */
public class Asignacion1 {

  
    public static void main(String[] args) {
     
        Cilindro cil = new Cilindro(3, 5);
        System.out.println("Cilindro:");
        System.out.println("Radio = " + 3);
        System.out.println("Altura = " + 5);
        System.out.println("Área = " + cil.CalcularArea());
        System.out.println("Volumen = " + cil.CalcularVolumen());
        
        Bolsa<String> bolsa = new Bolsa<>(5);
        bolsa.agrega("Manzana");
        bolsa.agrega("Pera");
        bolsa.agrega("Manzana");

        System.out.println("\nBolsa:");
        System.out.println("Número de objetos: " + bolsa.obtenNumObjetos());
        System.out.println("¿Contiene Pera? " + bolsa.contiene("Pera"));
        System.out.println("Manzanas en la bolsa: " + bolsa.cuenta("Manzana"));

        System.out.println("Removiendo al azar: " + bolsa.remueve());
        System.out.println("Objetos restantes: " + bolsa.obtenObjetos());
    }
    
}
  
