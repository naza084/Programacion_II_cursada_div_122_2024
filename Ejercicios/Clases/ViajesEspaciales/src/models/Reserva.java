/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Reserva {
   private LocalDate fecha;
   private Cliente cliente;
   private DestinoEspacial destino;
   private PaqueteViaje paquete;
   private boolean estadoConfirmado;
   
   public Reserva(LocalDate fecha, Cliente cliente, DestinoEspacial destino, PaqueteViaje paquete) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.destino = destino;
        this.paquete = paquete;
        this.estadoConfirmado = false;
   }
   
   
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDestino(DestinoEspacial destino) {
        this.destino = destino;
    }

    public void setPaquete(PaqueteViaje paquete) {
        this.paquete = paquete;
    }

    public void setEstadoConfirmado(boolean estadoConfirmado) {
        this.estadoConfirmado = estadoConfirmado;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public DestinoEspacial getDestino() {
        return destino;
    }

    public PaqueteViaje getPaquete() {
        return paquete;
    }

    public boolean getConfirmado() {
        return estadoConfirmado;
    }
    
    
    public void confirmarReserva(){
        if (estadoConfirmado) {
            System.out.println("La reserva ya esta confirmada.");
        }
        else {
            this.estadoConfirmado = true;
        }
    }
    
    public void cancelarReserva(){
        if (!estadoConfirmado) {
            System.out.println("La reserva ya esta cancelada.");
        } else {
            this.estadoConfirmado = false;
        }
    }
    
    
    @Override
    public String toString() {
        return "Reserva { " + "fecha = " + fecha + ", cliente = " + cliente.getNombre() + ", destino = " + destino.getNombre() + ", paquete = " + paquete.getNombre() + ", estado confirmado: " + estadoConfirmado + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.fecha);
        hash = 53 * hash + Objects.hashCode(this.cliente);
        hash = 53 * hash + Objects.hashCode(this.destino);
        hash = 53 * hash + Objects.hashCode(this.paquete);
        hash = 53 * hash + (this.estadoConfirmado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Reserva otraReserva = (Reserva) obj;

        // Comparamos los atributos 
        boolean mismoCliente = this.cliente.equals(otraReserva.getCliente());
        boolean mismoDestino = this.destino.equals(otraReserva.getDestino());
        boolean mismoPaquete = this.paquete.equals(otraReserva.getPaquete());
        boolean mismoEstado = this.estadoConfirmado == otraReserva.getConfirmado();
                
        // Si todos son iguales, las reservas son iguales
        return mismoCliente && mismoDestino && mismoPaquete && mismoEstado;
    }
    

    
    
}
