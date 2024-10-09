/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import models.*;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tesla tesla = new Tesla("Marca S", "das");
        ScooterElectrico scooter = new ScooterElectrico("Marca A", "das");
        try {
            // TODO: VER LA LOGICA DEL MATH MIN EN SCOOTER Y TESLA PORQUE NO FUNCIONA
            tesla.cargarBateria(42);
            scooter.cargarBateria(-42);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(tesla);
            System.out.println(scooter);

        }
    }
    
}
