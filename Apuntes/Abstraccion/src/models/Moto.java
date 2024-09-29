/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Moto extends Vehiculo{
     private int cilindrada;

    // Constructor
    public Moto(String modelo, String marca, int anio, int cilindrada) {
        super(modelo, marca, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" + "modelo=" + modelo + ", marca=" + marca + "cilindrada=" + cilindrada + '}';
    }

    @Override
    public void arrancar() {
        System.out.println("Sacar el freno de mano y acelerar");
    }
}
