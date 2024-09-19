/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Validador {

    private Validador() {
    throw new IllegalStateException("Utility class");
    }
    
    public static boolean esReservaRepetida(Reserva reserva, ArrayList<Reserva> reservas){
        boolean reservaValida = true;
        
        if(reservas.contains(reserva)){
            reservaValida = false;
        }
        
        return reservaValida;
    }
    
}
