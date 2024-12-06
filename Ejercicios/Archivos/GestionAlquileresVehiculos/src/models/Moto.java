package models;

import utils.Validator;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String modelo, double precioBasePorDia, int cilindrada) {
        super(modelo, precioBasePorDia);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        if (!Validator.isPositive(dias)){
            throw new IllegalArgumentException("Los dias no pueden ser negativos");
        }
        double precioFinal = this.precioBasePorDia * dias;
        return cilindrada > 500 ? agregarIncrementoCilindrada(precioFinal) : precioFinal;
    }

    private double agregarIncrementoCilindrada(double precioBase) {
        return precioBase * 1.15; // Incremento del 15%
    }
}
