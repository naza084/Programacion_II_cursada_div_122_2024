/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public interface IVehiculo {
    
    // atributos
    String MATRICULA = "";
    double MAXVELOCIDAD = 0.0;

    void arrancar();
    
    // Metodo pre-establecido
    default void tocarBocina(){
        System.out.println("tocando bocina");
    }
    
}
