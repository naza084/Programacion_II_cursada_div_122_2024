/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import com.sun.source.tree.BreakTree;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Cliente {

    private String nombre;
    private int edad;
    private ArrayList<Reserva> reservas;
    private DestinoEspacial destinoPreferido;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.reservas = new ArrayList<Reserva>();
        this.destinoPreferido = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void setDestinoPreferido(DestinoEspacial destinoPreferido) {
        this.destinoPreferido = destinoPreferido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public DestinoEspacial getDestinoPreferido() {
        return destinoPreferido;
    }

    // hacerReserva(): Reserva
    public Reserva hacerReserva(DestinoEspacial destino, PaqueteViaje paquete) {
        LocalDate fechaActual = LocalDate.now();
        Reserva reserva = new Reserva(fechaActual, this, destino, paquete);
        
        if (!Validador.esReservaRepetida(reserva, this.reservas)) {
            System.out.println("No se pueden hacer 2 reservas iguales.");
            reserva = null;
        } else {
            this.reservas.add(reserva);
            this.destinoPreferido = destino;
            System.out.println("Reserva realizada exitosamente.");
        }
        
        return reserva;
    }

    // consultarEstado(): void
    public void consultarEstado() {
        String texto = "";
        if (!this.reservas.isEmpty()) {
            texto += "Estado de las reservas: \n";
            for (Reserva reserva : reservas) {
                texto += reserva.toString() + "\n";
            }
        } else {
            texto = "No hay reservas hechas.";
        }
        
        System.out.println(texto);
    }

}
