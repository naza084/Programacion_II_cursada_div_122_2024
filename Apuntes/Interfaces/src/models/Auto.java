/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Auto implements IVehiculo {
    
    
    @Override
    public void arrancar() {
        System.out.println("Arrancando el auto.");
    }
    
    public void detener() {
        System.out.println("Deteniendo el auto.");
    }
    @Override
    public void tocarBocina() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
