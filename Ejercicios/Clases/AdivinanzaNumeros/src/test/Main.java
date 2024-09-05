/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import model.Adivinanza;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Adivinanza adivinanza = new Adivinanza();
        
        System.out.println(adivinanza.adivinar(54));
        System.out.println(adivinanza.adivinar(15));
        System.out.println(adivinanza.adivinar(29));
        System.out.println(adivinanza.adivinar(30)); 
        
    }
}
