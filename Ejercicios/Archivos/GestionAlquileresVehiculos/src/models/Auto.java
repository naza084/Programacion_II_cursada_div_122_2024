package models;

import utils.Validator;

public class Auto extends Vehiculo {
    private boolean esLujo;

    public Auto(String modelo, double precioBasePorDia, boolean esLujo) {
        super(modelo, precioBasePorDia);
        this.esLujo = esLujo;
    }

    public boolean isEsLujo() {
        return esLujo;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        if (!Validator.isPositive(dias)){
            throw new IllegalArgumentException("Los dias no pueden ser negativos");
        }
        double precioFinal = this.precioBasePorDia * dias;
        return esLujo ? agregarIncrementoLujo(precioFinal) : precioFinal;
    }

    private double agregarIncrementoLujo(double precioBase) {
        return precioBase * 1.25; // Incremento del 25%
    }
}
