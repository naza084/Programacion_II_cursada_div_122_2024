/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.util.ArrayList;
import models.*;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DestinoEspacial destino1 = new DestinoEspacial("primer destino", "terrestre", "coca incluida");
        PaqueteViaje paquete1 = new PaqueteViaje("primer paquete", "paquete que contiene doritos", 20);
        Cliente cliente = new Cliente("naza", 5);

        Reserva reserva = cliente.hacerReserva(destino1, paquete1);
        cliente.consultarEstado();
        reserva.confirmarReserva();
        cliente.consultarEstado();
        System.out.println(destino1);

    }
}
