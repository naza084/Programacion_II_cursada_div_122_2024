/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import exceptions.ReservaInvalidaException;
import exceptions.ReservaNoExistenteException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Hotel {

    private String nombreHotel;
    private ArrayList<Habitacion> habitaciones;

    public Hotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    public void reservarHabitacion(String codigoHabitacion, int dias) throws ReservaInvalidaException, ReservaNoExistenteException {
        verificarSiHayHabitaciones();
        Habitacion habitacionEncontrada = buscarHabitacion(codigoHabitacion);
        existeHabitacion(habitacionEncontrada);
        verificarReservaValida(habitacionEncontrada, dias);

        habitacionEncontrada.setEstaOcupada(true);

    }

    public void liberarHabitacion(String codigoHabitacion) throws ReservaInvalidaException, ReservaNoExistenteException {
        verificarSiHayHabitaciones();
        Habitacion habitacionEncontrada = buscarHabitacion(codigoHabitacion);
        existeHabitacion(habitacionEncontrada);
        verificarHabitacionDesocupada(habitacionEncontrada);

        habitacionEncontrada.setEstaOcupada(false);
    }

    public double calcularCostoEstadia(String codigoHabitacion, int dias) throws ReservaInvalidaException, ReservaNoExistenteException {
        verificarSiHayHabitaciones();
        Habitacion habitacionEncontrada = buscarHabitacion(codigoHabitacion);
        existeHabitacion(habitacionEncontrada);
        verificarHabitacionDesocupada(habitacionEncontrada);

        double costoTotalEstadia = habitacionEncontrada.calcularPrecioTotal(dias);

        return costoTotalEstadia;
    }

    
    // Metodos auxiliares
    private void verificarHabitacionDesocupada(Habitacion habitacionEncontrada) throws ReservaInvalidaException, ReservaNoExistenteException {
        if (!habitacionEncontrada.isEstaOcupada()) {
            throw new ReservaInvalidaException("La habitacion no estaba reservada.");
        }
    }

    private void verificarSiHayHabitaciones() throws ReservaNoExistenteException {
        if (this.habitaciones.isEmpty()) {
            throw new ReservaNoExistenteException("No hay habitaciones en el hotel.");
        }
    }

    private Habitacion buscarHabitacion(String codigoHabitacion) {
        Habitacion habitacionEncontrada = null;
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getCodigoHabitacion().equalsIgnoreCase(codigoHabitacion)) {
                habitacionEncontrada = habitacion;
            }
        }
        return habitacionEncontrada;
    }

    private void verificarReservaValida(Habitacion habitacionEncontrada, int dias) throws ReservaInvalidaException, ReservaNoExistenteException {
        if (habitacionEncontrada.isEstaOcupada()) {
            throw new ReservaInvalidaException("La habitacion ya esta ocupada.");
        }
        if (habitacionEncontrada instanceof HabitacionDeluxe deluxe) {
            if (dias < deluxe.getNumeroNochesMinimas()) {
                throw new ReservaInvalidaException("Dias reservados insuficientes.");
            }
        }
    }

    private void existeHabitacion(Habitacion habitacionEncontrada) throws ReservaNoExistenteException {
        if (habitacionEncontrada == null) {
            throw new ReservaNoExistenteException("La habitacion no existe.");
        }
    }

}
