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
public class Cliente extends Persona {
    private String cuil;
    private double limiteCrediticio;

    public Cliente(String cuil, double limiteCrediticio, String nombre, String apellido, int dni, int edad, LocalDate fechaNacimiento) {
        super(nombre, apellido, dni, edad, fechaNacimiento);
        this.cuil = cuil;
        this.limiteCrediticio = limiteCrediticio;
    }
    
    public boolean estadoCrediticio(double monto){
        return monto == limiteCrediticio;
    }
}
