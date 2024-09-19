/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class DestinoEspacial {
    
    private String nombre;
    private String tipo;
    private String caracteristicasEspeciales;
    private Reserva reserva;

    public DestinoEspacial(String nombre, String tipo, String caracteristicasEspeciales){
        this.nombre = nombre;
        this.tipo = tipo;
        this.caracteristicasEspeciales = caracteristicasEspeciales;
        this.reserva = null;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCaracteristicasEspeciales(String caracteristicasEspeciales) {
        this.caracteristicasEspeciales = caracteristicasEspeciales;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCaracteristicasEspeciales() {
        return caracteristicasEspeciales;
    }

    public Reserva getReserva() {
        return reserva;
    }

    @Override
    public String toString() {
        return "DestinoEspacial { " + "nombre=" + nombre + ", tipo=" + tipo + ", caracteristicasEspeciales=" + caracteristicasEspeciales + ", reserva=" + reserva + '}';
    }
}
