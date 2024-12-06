package models;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Reserva implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static int idContador = 0;
    private int id;
    private String cliente;
    private List<Vehiculo> vehiculos;
    private double total;

    public Reserva(String cliente, double total) {
        id = idContador++;
        vehiculos = new ArrayList<>();
        this.cliente = cliente;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);
    }

    public double calcularTotal(int dias){
        return vehiculos.stream().mapToDouble(vehiculo -> vehiculo.calcularCostoAlquiler(dias)).sum();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reserva{");
        sb.append("cliente='").append(cliente).append('\'');
        sb.append(", id=").append(id);
        sb.append(", vehiculos=").append(vehiculos);
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }
}
