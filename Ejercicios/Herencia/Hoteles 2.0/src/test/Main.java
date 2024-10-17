/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import exceptions.*;
import models.*;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel");

        System.out.println("-----------------1-1-------------------\n");
        try {
            HabitacionEstandar habitacionE1 = new HabitacionEstandar(true, 80.0, "10001", true, 0);
            System.out.println(habitacionE1);
            System.out.println("-----------------1-3-------------------\n");
            System.out.println("El precio de la estadia es: " + habitacionE1.calcularPrecioTotal(3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------1-2-------------------\n");
        try {
            HabitacionEstandar habitacionE2 = new HabitacionEstandar(true, 90.0, "10002", true, 40);
            System.out.println(habitacionE2);
            System.out.println("-----------------1-4-------------------\n");
            System.out.println("El precio de la estadia es: " + habitacionE2.calcularPrecioTotal(4));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
