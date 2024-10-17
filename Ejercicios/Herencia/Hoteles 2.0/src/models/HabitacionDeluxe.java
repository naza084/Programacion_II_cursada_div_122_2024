/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class HabitacionDeluxe extends Habitacion {

    private boolean incluyeDesayuno;
    private int tarifaDesayuno;
    private int numeroNochesMinimas;

    public HabitacionDeluxe(boolean incluyeDesayuno, int tarifaDesayuno, int numeroNochesMinimas, String codigoHabitacion, boolean estaOcupada, double precioPorNoche) throws IllegalArgumentException {
        super(codigoHabitacion, estaOcupada, precioPorNoche);
        this.incluyeDesayuno = incluyeDesayuno;
        this.tarifaDesayuno = tarifaDesayuno;

        validarNumeroNochesMinimas(numeroNochesMinimas);
        this.numeroNochesMinimas = numeroNochesMinimas;
    }

    public void setIncluyeDesayuno(boolean incluyeDesayuno) {
        this.incluyeDesayuno = incluyeDesayuno;
    }

    public void setTarifaDesayuno(int tarifaDesayuno) {
        this.tarifaDesayuno = tarifaDesayuno;
    }

    public void setNumeroNochesMinimas(int numeroNochesMinimas) throws IllegalArgumentException {
        validarNumeroNochesMinimas(numeroNochesMinimas);
        this.numeroNochesMinimas = numeroNochesMinimas;
    }

    public boolean isIncluyeDesayuno() {
        return incluyeDesayuno;
    }

    public int getTarifaDesayuno() {
        return tarifaDesayuno;
    }

    public int getNumeroNochesMinimas() {
        return numeroNochesMinimas;
    }

    // Método privado que centraliza la validación
    private void validarNumeroNochesMinimas(int numeroNochesMinimas) throws IllegalArgumentException {
        if (numeroNochesMinimas < 0) {
            throw new IllegalArgumentException("El numero de noches no puede ser negativo.");
        }
    }

    @Override
    public double calcularPrecioTotal(int dias) {
        double precioTotal = tarifaDesayuno * dias;
        double descuento, aumento;

        if (dias < numeroNochesMinimas) {
            aumento = precioTotal * (20 / 100);
            precioTotal += aumento;
        } else if (dias > 7) {
            descuento = precioTotal * (10 / 100);
            precioTotal -= descuento;
        }

        return precioTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HabitacionDeluxe {");
        sb.append("codigoHabitacion=").append(codigoHabitacion);
        sb.append(", estaOcupada=").append(estaOcupada);
        sb.append(", precioPorNoche=").append(precioPorNoche);
        sb.append(", incluyeDesayuno=").append(incluyeDesayuno);
        sb.append(", tarifaDesayuno=").append(tarifaDesayuno);
        sb.append(", numeroNochesMinimas=").append(numeroNochesMinimas);
        sb.append('}');
        return sb.toString();
    }

}
