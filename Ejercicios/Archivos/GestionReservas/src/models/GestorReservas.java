package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorReservas {
    private List<Reserva> reservas;
    private final int capacidad;
    private Evento evento;
    private Map<Integer, Long> estadisticasReservasPorEvento;

    public GestorReservas(int capacidad, Evento evento) {
        this.capacidad = capacidad;
        reservas = new ArrayList<>();
        estadisticasReservasPorEvento = new HashMap<>();
        this.evento = evento;
    }

    public boolean realizarReserva(String cliente)  {
        boolean reservaRealizada = false;

        if(this.reservas.size() < capacidad){
            this.reservas.add(new Reserva(cliente, evento.getId()));
            reservaRealizada = true;
        } else {
            //excepcion a implementar
            reservaRealizada = false;
        }

        return reservaRealizada;
    }

    public int contarReservas(){
        return reservas.size();
    }



}
