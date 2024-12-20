/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public abstract class Habitacion {
    protected final String codigoHabitacion;
    protected boolean estaOcupada;
    protected final double precioPorNoche;

    public Habitacion(String codigoHabitacion, boolean estaOcupada, double precioPorNoche) throws IllegalArgumentException {
        if (codigoHabitacion.length() != 5) {
            throw new IllegalArgumentException("El codigo de habitacion debe contener 5 caracteres exactos.");
        }
        this.codigoHabitacion = codigoHabitacion;
        
        this.estaOcupada = estaOcupada;

        if (precioPorNoche < 1.0) {
            throw new IllegalArgumentException("El precio por noche no puede ser negativo o 0.");
        }
        this.precioPorNoche = precioPorNoche;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }
    
    public String getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
    
    
    public abstract double calcularPrecioTotal(int dias);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Habitacion {");
        sb.append("codigoHabitacion=").append(codigoHabitacion);
        sb.append(", estaOcupada=").append(estaOcupada);
        sb.append(", precioPorNoche=").append(precioPorNoche);
        sb.append('}');
        return sb.toString();
    }
    
    
}
