/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Perro {
    // Atributos
    String nombre;
    int edad;

    // Constructor
    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método (comportamiento)
    public void ladrar() {
        System.out.println(nombre + " esta ladrando.");
    }
}
