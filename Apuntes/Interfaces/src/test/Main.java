/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.time.Month;
import models.Empleado;
import models.Persona;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("141", 4000, "naza", "cruz", 124, 19, LocalDate.of(2005, Month.APRIL, 11));
        
        empleado.cocinar();
        System.out.println(empleado.getSueldo());
        empleado.pagarCuota();
        System.out.println(empleado.getSueldo());
        
        Persona p = new Persona("d", "d", 0, 0, LocalDate.MIN) {
        };
        p.calcularEdad(LocalDate.EPOCH);
    }
}
