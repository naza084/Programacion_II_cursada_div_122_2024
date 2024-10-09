/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Tesla extends Vehiculo implements IVehiculoElectrico {

    private int nivelBateria;
    
    public Tesla(String marca, String modelo) {
        super(marca, modelo);
        nivelBateria = 0;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tesla{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", nivel de bateria=").append(nivelBateria);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void cargarBateria(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de energia no puede ser negativa.");
        }
        this.nivelBateria = Math.min(100, this.nivelBateria - cantidad);
    }

    @Override
    public int getNivelBateria() {
        return nivelBateria;
    }
    
    
}
