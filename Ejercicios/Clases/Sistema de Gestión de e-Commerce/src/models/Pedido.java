/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public class Pedido {
    private LocalDateTime fechaHora;
    private estados estado; // puede ser 3 tipos: pendiente, completado, cancelado
    private String direccionEnvio;
    private CarritoDeCompras carrito;
    
    public Pedido(CarritoDeCompras carrito, String direccionEnvio) {
        this.fechaHora = LocalDateTime.now();
        this.estado = estados.PENDIENTE;
        this.direccionEnvio = direccionEnvio;
        this.carrito = carrito;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setEstado(estados estado) {
        this.estado = estado;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public void setCarrito(CarritoDeCompras carrito) {
        this.carrito = carrito;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public estados getEstado() {
        return estado;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public CarritoDeCompras getCarrito() {
        return carrito;
    }
    
    
    public void confirmar(){
        this.estado = estados.CONFIRMADO;
    }
    
    public void cancelar(){
        this.estado = estados.CANCELADO;
    }

    @Override
    public String toString() {
        return "Pedido {" + "fechaHora=" + fechaHora + ", estado=" + estado + ", direccionEnvio=" + direccionEnvio + ", carrito=" + carrito + '}';
    }
    
    enum estados{
        PENDIENTE, CANCELADO, CONFIRMADO;
    }
  
}
