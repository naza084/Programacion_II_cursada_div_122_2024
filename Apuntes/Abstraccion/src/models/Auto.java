/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;

    // Constructor
    public Auto(String modelo, String marca, int anio, int cantidadPuertas) {
        super(modelo, marca, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    // Getters
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo +", " + "cantidadPuertas=" + cantidadPuertas + '}';
    }

    @Override
    public void arrancar() {
        System.out.println("Pongo primera y arranco");
    }
}
