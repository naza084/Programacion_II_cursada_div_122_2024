/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
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
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Moto moto = new Moto("Sport","KTM",2023,150);
        Auto auto = new Auto("a3","Audi",2022,2);

        vehiculos.add(auto);
        vehiculos.add(moto);
        // clase abstracta, no ncesita instanciar
        //Vehiculo vehiculo = new Vehiculo("Marca","Modelo",2024); 

        // aplicar métodos abstractos - acercamiento a polimorfismo
        auto.arrancar();
        moto.arrancar();

        System.out.println(moto.estaEnVenta());
        System.out.println(auto.estaEnVenta());

        // Busqueda como tipo especifico - downcast
        // ((Auto)moto).getCantidadPuertas();

        // para saber el tipo de objeto
        for (Vehiculo v : vehiculos) {
            if (v instanceof Auto) {
                System.out.println("esto es un auto");
            }
        }
        
        System.out.println(auto.getClass());
        
    }
    
}
