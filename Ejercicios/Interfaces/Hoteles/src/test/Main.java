/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import models.Hotel;
import models.ReservaInvalidaException;
import models.ReservaNoExistenteException;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hotel hotel = new Hotel();
        
        System.out.println(hotel);
        try {
            hotel.realizarReserva("dante", 10);
            hotel.realizarReserva("ken", 10);
            hotel.realizarReserva("naza", 1, "Especial");
            hotel.realizarReserva("khan", 2, "oro", true);
            hotel.cancelarReserva("lara");
        } catch (ReservaInvalidaException | ReservaNoExistenteException  e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(hotel);
        }
    }
}
