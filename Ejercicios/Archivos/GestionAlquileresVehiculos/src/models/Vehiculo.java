package models;

import utils.Validator;

import java.io.Serial;
import java.io.Serializable;

public abstract class Vehiculo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static int idContador = 0;
    protected int id;
    protected String modelo;
    protected double precioBasePorDia;

    public Vehiculo(String modelo, double precioBasePorDia) {
        if (Validator.isValidText(modelo, 3)){
            throw new IllegalArgumentException("El modelo debe tener al menos 3 caracteres.");
        }
        if (!Validator.isPositive(precioBasePorDia)){
            throw new IllegalArgumentException("El precio base no puede ser negativo");
        }

        this.id = idContador++;
        this.modelo = modelo;
        this.precioBasePorDia = precioBasePorDia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioBasePorDia() {
        return precioBasePorDia;
    }

    public void setPrecioBasePorDia(double precioBasePorDia) {
        this.precioBasePorDia = precioBasePorDia;
    }


    public abstract double calcularCostoAlquiler(int dias);

    public String mostrarResumen() {
        return "Vehiculo{ " +
                "\nid: " + id +
                "\nmodelo: " + modelo +
                "\nprecioBasePorDia: $" + precioBasePorDia +
                '}';
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehiculo{");
        sb.append("id=").append(id);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", precioBasePorDia=").append(precioBasePorDia);
        sb.append('}');
        return sb.toString();
    }
}
