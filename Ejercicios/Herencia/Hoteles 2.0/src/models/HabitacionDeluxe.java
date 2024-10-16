/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class HabitacionDeluxe extends Habitacion{
    
    
    Atributos:
■   incluyeDesayuno (boolean): Indica si el desayuno está incluido.
■   tarifaDesayuno (double): Tarifa adicional por el desayuno si no está incluido.
■   numeroNochesMinimas (int): Número mínimo de noches para poder reservar la suite.
○   Métodos:
■   calcularPrecioTotal(int dias): Si el desayuno está incluido añadir el costo del desayuno por cada día de la estadía. Además, se aplica un descuento del 10% si la estadía es mayor a 7 días
        , pero si el cliente no alcanza el número mínimo de noches (numeroNochesMinimas), añadir una penalización del 20% al precio total.
}
