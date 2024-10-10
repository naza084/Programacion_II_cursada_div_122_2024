/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import models.Empleado;
import models.EmpleadoPorHora;
import models.EmpleadoSalariado;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Herencia
        Empleado empleado1 = new Empleado("naza");
        EmpleadoSalariado empleado2 = new EmpleadoSalariado(25, "enki");
        EmpleadoPorHora empleado3 = new EmpleadoPorHora(4, 6, "zada");

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        // polimorfismo
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            System.out.println(empleado.calcularPago());
            System.out.println(empleado.getNombre());
            
        }

    }
}
