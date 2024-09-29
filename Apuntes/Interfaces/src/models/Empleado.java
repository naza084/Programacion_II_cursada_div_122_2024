/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Empleado extends Persona implements ICocinero, ISocio{
    private String legajo;
    private double sueldo;
    
    public Empleado(String legajo, double sueldo, String nombre, String apellido, int dni, int edad, LocalDate fechaNacimiento) {
        super(nombre, apellido, dni, edad, fechaNacimiento);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }
    
    public double calcularSueldo(int horasTrabajadas){
        return sueldo * horasTrabajadas;
    }

    @Override
    public void cocinar() {
        System.out.println(nombre + " esta cocinando");
    }

    @Override
    public void pagarCuota() {
        System.out.println("Pago la cuota");
    }

    public double getSueldo() {
        return sueldo;
    }
    
}
