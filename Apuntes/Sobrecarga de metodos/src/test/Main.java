/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.Calculadora;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cambia de metodos dependiendo de los parametros que se pasen
        int suma1 = Calculadora.sumar(2, 5);
        int suma2 = Calculadora.sumar(2, 5, 8);
        double suma3 = Calculadora.sumar(24.5, 54.2);
        
        System.out.println(suma1);
        System.out.println(Calculadora.sumar(2,4));
        System.out.println(suma2);
        System.out.println(suma3);
    }
    
}
