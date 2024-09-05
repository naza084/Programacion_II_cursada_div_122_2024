/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import model.Coche;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Toyota", "TO412", 90.3);
        Coche coche2 = new Coche("Twingo", "TW229", 70.6);
        Coche coche3 = new Coche("Terzo milennio", "TER12", 180.5);


        System.out.println("Coches acelerando: ");
        coche1.acelerar();
        coche2.acelerar();
        coche3.acelerar();
        
        System.out.println("");
        System.out.println("Coches frenando: ");
        coche1.frenar();
        coche2.frenar();
        coche3.frenar();
        
        System.out.println("");
        System.out.println("Informacion de los coches: ");
        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        coche3.mostrarInformacion();

    }
}
