/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class EmpleadoSalariado  extends Empleado {
    private double salarioMensual;

    public EmpleadoSalariado(double salarioMensual, String nombre, int legajo) {
        super(nombre, legajo);
        this.salarioMensual = salarioMensual;
    }
    
    @Override
    public double calcularPago() {
        return this.salarioMensual;
    }
    
    @Override
    public String toString() {
        return "Empleado {" + "nombre=" + nombre + ", legajo=" + legajo + ", salario mensual=" + salarioMensual + '}';
    }


    
    
}
