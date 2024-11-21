/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Model.Pila;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila<Integer> pilaEnteros = new Pila<>();
        
        try {
            // Pila vacia
            pilaEnteros.extraer();
            pilaEnteros.primero();
        } catch (IllegalCallerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(pilaEnteros);
        }
        
        try {
            pilaEnteros.aniadir(5);
            pilaEnteros.aniadirPrimero(24);
            pilaEnteros.aniadirPrimero(54);
            pilaEnteros.aniadirUltimo(564);
        } catch (IllegalCallerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(pilaEnteros);
        }

    }
    
}
