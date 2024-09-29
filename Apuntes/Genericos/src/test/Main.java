/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.Caja;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        
        caja1.setContenido(523);
        System.out.println(caja1.getContenido());

        caja1.setContenido("fa");
        System.out.println(caja1.getContenido());

        // indicamos que objeto o tipo debe almacenar la caja
        // polimorfismo parametrizado
        Caja<String> caja2 = new Caja<>();
        caja2.setContenido("asfasfasfasfarf");
        
        System.out.println(caja2.getContenido());
        
        Caja<Integer> caja3 = new Caja<>();
        caja3.setContenido(55214124);
        
        System.out.println(caja3.getContenido());
        
    }
    
}
