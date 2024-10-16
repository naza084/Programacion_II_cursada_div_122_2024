/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int bolitas = 10;
        int cantidadImpresion = 1;
        int espacios = bolitas;
        
        for (int i = 0; i < bolitas; i++) {
            // forma corta
            System.out.print(" ".repeat(espacios));
            System.out.println("*".repeat(cantidadImpresion));
            cantidadImpresion += 2; 
            espacios--;
            
            /* forma algoritmica
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cantidadImpresion; j++) {
                System.out.print("*");
            }
            System.out.println("");
            cantidadImpresion += 2; 
            espacios--;
            */
        }
    }
    
}
