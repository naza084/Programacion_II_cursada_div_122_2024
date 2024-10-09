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
        if (nroNoches <= 0) {
            throw new ReservaInvalidaException("El numero de noche tiene que ser mayor a 0.");
        }
        
        reservas.put(nombreCliente, nroNoches);
        return true;
    }

    // TODO: desarrollar los metodos de abajo y hacer pruebas
    // luego ir al todo de notifiaciones
    // VER LO QUE ME PASO CHAT GPT DE VARIABLES DE INTERFACES Y ESTRUCTURA DE CARPETAS PARA EXCEPCIONES
    @Override
    public boolean cancelarReserva(String nombreCliente) throws ReservaNoExistenteException{
        return true;
    }
    
    
    // realizarReserva(nombreCliente: String, nroNoches: int, tipoHabitacion: String): bool
    public boolean realizarReserva(String nombreCliente, int nroNoches, String tipoHabitacion) {
        return false;
    }
    
    
    // realizarReserva(nombreCliente: String, nroNoches: int, tipoHabitacion: String, desayunoIncluido: bool): bool
    public boolean realizarReserva(String nombreCliente, int nroNoches, String tipoHabitacion, boolean desayunoIncluido) {
        return true;
    }
    
    
    
}
