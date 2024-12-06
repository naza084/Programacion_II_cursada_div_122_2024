package repository;

import models.Reserva;
import services.GestorPersistencia;

import java.util.List;
import java.util.Optional;

public class ReservaRepository implements IRepository<Reserva> {
    private List<Reserva> reservas;
    private final GestorPersistencia<Reserva> persistencia;
    private final String rutaArchivo;
    private int ultimoId;

    public ReservaRepository(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        persistencia = new GestorPersistencia<>(rutaArchivo);
        reservas = persistencia.cargarDatos();
        ultimoId = reservas.isEmpty() ? 0 : reservas.getLast().getId();
    }

    @Override
    public void add(Reserva reserva) {
        reserva.setId(++ultimoId);
        this.reservas.add(reserva);
        persistencia.guardarDatos(reservas);
    }

    @Override
    public Optional<Reserva> findById(int id) {
        return reservas.stream().filter(vehiculo -> vehiculo.getId() == id).findFirst();
    }

    @Override
    public List<Reserva> findAll() {
        return reservas;
    }
}
