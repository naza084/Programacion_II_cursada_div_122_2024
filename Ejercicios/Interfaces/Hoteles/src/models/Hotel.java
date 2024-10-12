/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author PC
 */

/*
Hotel
--
- reservas: HashMap<String, integer>
- habitaciones: List<Habitacion>
--
+ realizarReserva(nombreCliente: String, nroNoches: int, tipoHabitacion: String): bool
+ realizarReserva(nombreCliente: String, nroNoches: int, tipoHabitacion: String, desayunoIncluido: bool): bool
*/
public class Hotel implements IReservable{
    private HashMap<String, Integer> reservas;
    private ArrayList<Habitacion> habitaciones;

    public Hotel() {
        reservas = new HashMap<>();
        habitaciones = new ArrayList<>();
    }
    
    @Override
    public boolean realizarReserva(String nombreCliente, int nroNoches) throws ReservaInvalidaException{
        validarNoches(nroNoches);
        registrarReserva(nombreCliente, nroNoches);
        
        return true;
    }

   
    @Override
    public boolean cancelarReserva(String nombreCliente) throws ReservaNoExistenteException{
        if (!reservas.containsKey(nombreCliente)) {
            throw new ReservaNoExistenteException("No existe la reserva para cancelar");
        }
        
        reservas.remove(nombreCliente);
        return true;
    }
    
    
    // realizarReserva(nombreCliente: String, nroNoches: int, tipoHabitacion: String): bool
    public boolean realizarReserva(String nombreCliente, int nroNoches, String tipoHabitacion) throws ReservaInvalidaException {
        validarNoches(nroNoches);
        registrarReserva(nombreCliente, nroNoches);
        
        Habitacion habitacion = new Habitacion(tipoHabitacion);
        habitaciones.add(habitacion);
        return true;
    }

    // realizarReserva(nombreCliente: String, nroNoches: int, tipoHabitacion: String, desayunoIncluido: bool): bool
    public boolean realizarReserva(String nombreCliente, int nroNoches, String tipoHabitacion, boolean desayunoIncluido) throws ReservaInvalidaException {
        validarNoches(nroNoches);
        registrarReserva(nombreCliente, nroNoches);
        
        Habitacion habitacion = new Habitacion(tipoHabitacion, desayunoIncluido);
        habitaciones.add(habitacion);
        return true;
    }

    
    // Métodos auxiliares
    private void validarNoches(int nroNoches) throws ReservaInvalidaException {
        if (nroNoches <= 0) {
            throw new ReservaInvalidaException("El número de noches debe ser mayor a 0.");
        }
    }
    private void registrarReserva(String nombreCliente, int nroNoches) {
        reservas.put(nombreCliente, nroNoches);
    }
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel{");
        sb.append("reservas=").append(reservas);
        sb.append(", habitaciones=").append(habitaciones);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
