/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import models.Estacion;
import models.Tren;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tren tren1 = new Tren();
        Tren tren2 = new Tren();
        Tren tren3 = new Tren();
        
        tren1.agregarTiempo(25);
        tren1.agregarTiempo(245);
        
        int tiempo1 = tren1.calcularTiempoTotal();
        System.out.println(tiempo1);
        
        Estacion estacion1 = new Estacion("adrogue");
        Estacion estacion2 = new Estacion("capital");
        
        estacion1.agregarTren(tren1);
        estacion1.agregarTren(tren2);
        estacion1.mostrarTrenes();
        
        estacion2.mostrarTrenes(); // excepcion
        
    }
    
}
