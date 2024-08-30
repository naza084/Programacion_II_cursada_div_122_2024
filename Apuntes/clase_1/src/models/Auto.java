/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Auto {

    // Atributos
    private String nombre;
    private int año;
    private String color;
    private double velocidad;

    // Constructor
    public Auto(String nombre, int año, String patente) {
        this.nombre = nombre;
        this.año = año;
        this.color = patente;
        this.velocidad = 0.0;
    }

    // Metodos de acceso
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    
    public int getAño() {
        return this.año;
    }

    public String getColor() {
        return this.color;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    
    // Metodo de comportamiento
    public void Acelerar(double incremento) {
        this.velocidad += incremento;
    }

    public void Frenar(double decremento) {
        this.velocidad -= decremento;

        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }

}
