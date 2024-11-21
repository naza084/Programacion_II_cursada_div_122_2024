/*s
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.Contenedor;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 2;
        Contenedor<Integer> contenedor1 = new Contenedor(2);
        System.out.println(contenedor1.getElemento());
        
        String cadena = "hola";
        Contenedor<String> contenedor2 = new Contenedor(cadena);
        System.out.println(contenedor2.getElemento());

    }
    
}
