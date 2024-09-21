/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class EmpleadoPorHora extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(double salarioPorHora, int horasTrabajadas, String nombre, int legajo) {
        super(nombre, legajo);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return this.salarioPorHora * this.horasTrabajadas;
    }

    @Override
    public String toString() {
        return "Empleado {" + "nombre=" + nombre + ", legajo=" + legajo + ", salario por hora=" + salarioPorHora + ", Horas trabajadas=" + horasTrabajadas + '}';
    }
    
    
}
