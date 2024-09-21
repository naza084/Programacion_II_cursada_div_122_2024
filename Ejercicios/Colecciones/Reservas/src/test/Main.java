/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import model.Reserva;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        ArrayList<Reserva> reservas = new ArrayList<>();
        
        Reserva reserva1 = new Reserva("naza", 5);
        Reserva reserva2 = new Reserva("lalo", 7);
        Reserva reserva3 = new Reserva("eno", 3);
        Reserva reserva4 = new Reserva("kaio", 1);
        
        reserva2.confirmar();
        reserva3.confirmar();
        
        reservas.add(reserva1);
        reservas.add(reserva2);
        reservas.add(reserva3);
        reservas.add(reserva4);
        
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
        
        
    }
}
