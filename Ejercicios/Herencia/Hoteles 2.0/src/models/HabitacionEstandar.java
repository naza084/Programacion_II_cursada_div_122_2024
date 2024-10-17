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
    private final double costoLimpieza;

    public HabitacionEstandar(boolean limpiezaIncluida, double costoLimpieza, String codigoHabitacion, boolean estaOcupada, double precioPorNoche) throws IllegalArgumentException {
        super(codigoHabitacion, estaOcupada, precioPorNoche);
        this.limpiezaIncluida = limpiezaIncluida;

        if (costoLimpieza < 1.0) {
            throw new IllegalArgumentException("El precio de la limpieza no puede ser negativo.");
        }
        this.costoLimpieza = costoLimpieza;
    }

    public void setLimpiezaIncluida(boolean limpiezaIncluida) {
        this.limpiezaIncluida = limpiezaIncluida;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HabitacionEstandar {");
        sb.append("codigoHabitacion=").append(codigoHabitacion);
        sb.append(", estaOcupada=").append(estaOcupada);
        sb.append(", precioPorNoche=").append(precioPorNoche);
        sb.append(", limpiezaIncluida=").append(limpiezaIncluida);
        sb.append(", costoLimpieza=").append(costoLimpieza);
        sb.append('}');
        return sb.toString();
    }

}
