/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Triatleta implements ICorredor, INadador {

    private String nombre;

    public Triatleta(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public void correr() {
        System.out.println(this.nombre + " esta Corriendo.");
    }

    @Override
    public void nadar() {
        System.out.println(this.nombre + " esta Nadando.");
    }
    
}
