/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import model.Animal;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal animal1 = new Animal("max", "leon", 24);
        Animal animal2 = new Animal("luan", "elefante", 24);
        Animal animal3 = new Animal("tuco", "tucan", 24);
        
        System.out.println("Animales emitiendo sonido: ");
        animal1.hacerSonido("ruge");
        animal2.hacerSonido("grita");
        animal3.hacerSonido("canta");
        
        System.out.println("Animales comiendo: ");
        animal1.comer("carne");
        animal2.comer("hierba");
        animal3.comer("insectos");
        
    }
}
