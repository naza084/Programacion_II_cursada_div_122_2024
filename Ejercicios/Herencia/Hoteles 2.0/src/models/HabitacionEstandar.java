/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class HabitacionEstandar extends Habitacion {
    private boolean limpiezaIncluida;
    private double costoLimpieza;

    public HabitacionEstandar(boolean limpiezaIncluida, double costoLimpieza, String codigoHabitacion, boolean estaOcupada, double precioPorNoche) throws IllegalArgumentException {
        super(codigoHabitacion, estaOcupada, precioPorNoche);
        this.limpiezaIncluida = limpiezaIncluida;
        // TODO: consultar con chat gpt como puedo mejorar lo de abajo, si pongo el set
        // tengo un problema y es que el constructor de habitacion estandar queda con ese set metido
        // TODO: despues de esto hacer los ejercicios de logica que me dio chat gpt, luego ir al main de hotel 2.0
        if (costoLimpieza < 1.0) {
            throw new IllegalArgumentException("El precio de la limpieza no puede ser negativo.");
        }
        this.costoLimpieza = costoLimpieza;
    }

    public void setLimpiezaIncluida(boolean limpiezaIncluida) {
        this.limpiezaIncluida = limpiezaIncluida;
    }

    public void setCostoLimpieza(double costoLimpieza) throws IllegalArgumentException {
        if (costoLimpieza < 1.0) {
            throw new IllegalArgumentException("El precio de la limpieza no puede ser negativo.");
        }
        this.costoLimpieza = costoLimpieza;
    }

    public boolean isLimpiezaIncluida() {
        return limpiezaIncluida;
    }

    public double getCostoLimpieza() {
        return costoLimpieza;
    }
    
    
    @Override
    public double calcularPrecioTotal(int dias) {
        double precioTotal = precioPorNoche * dias;
        
        if (limpiezaIncluida) {
            precioTotal += costoLimpieza;
        }
        
        return precioTotal;
    }
    
}
