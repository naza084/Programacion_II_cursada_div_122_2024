package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestorEventos {
    private List<Evento> eventos;

    public GestorEventos() {
        eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) throws IllegalArgumentException {
        if (eventos.contains(evento)) {
            throw new IllegalArgumentException("El evento ya existe");
        }

        eventos.add(evento);
    }

    /**
     * Busca un evento por su id
     * @param id es el id del evento a buscar
     * @return un Optional con el evento si se encontró, o un Optional vacío si no se encontró
     */
    public Optional<Evento> buscarPorId(int id) {
        return eventos.stream().filter(evento -> evento.getId() == id).findFirst();
    }

    public List<Evento> consultarEventosPorCosto(double costoMin) {
        List<Evento> eventosPorCosto = new ArrayList<>();

        for (Evento evento : eventos) {
            if (evento.calcularCostoFinal() >= costoMin) {
                eventosPorCosto.add(evento);
            }
        }

        return eventosPorCosto;
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}
