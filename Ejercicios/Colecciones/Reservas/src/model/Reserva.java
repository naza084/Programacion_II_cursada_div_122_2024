/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalTime;

/**
 *
 * @author PC
 */
public class Reserva {
    private String nombreCliente;
    private int numeroPersonas;
    private LocalTime hora;
    private boolean confirmado;

    public Reserva(String nombreCliente, int numeroPersonas) {
        this.nombreCliente = nombreCliente;
        this.numeroPersonas = numeroPersonas;
        this.hora = LocalTime.now();
        this.confirmado = false;
    }
    
    public void confirmar(){
        this.confirmado = true;
    }

    @Override
    public String toString() {
        return "Reserva {" + "nombreCliente=" + nombreCliente + ", numeroPersonas=" + numeroPersonas + ", hora=" + hora + ", confirmado=" + confirmado + '}';
    }
    
    
}
