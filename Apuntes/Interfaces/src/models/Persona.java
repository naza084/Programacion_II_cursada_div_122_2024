/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author PC
 */

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int edad;
    protected LocalDate fechaNacimiento;
    
    public Persona(String nombre, String apellido, int dni, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad(LocalDate fecha){
        return (int)ChronoUnit.DAYS.between(fechaNacimiento, fecha); 
    }
    
    
}
