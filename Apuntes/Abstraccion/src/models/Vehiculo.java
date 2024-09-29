/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public abstract class Vehiculo {
    protected String modelo;
    protected String marca;
    protected int anio;

    // Constructor
    public Vehiculo(String modelo, String marca, int anio) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", marca=" + marca + ", anio=" + anio + '}';
    }

    // Definir firma del método - Abstracto
    public abstract void arrancar();

    public boolean estaEnVenta(){
        return true;
    }
    
}
