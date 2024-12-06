package repository;

import models.Vehiculo;
import services.GestorPersistencia;

import java.util.List;
import java.util.Optional;

public class VehiculosRepository implements IRepository<Vehiculo> {
    private List<Vehiculo> vehiculos;
    private final GestorPersistencia<Vehiculo> persistencia;
    private final String rutaArchivo;
    private int ultimoId;

    public VehiculosRepository(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        this.persistencia = new GestorPersistencia<>(rutaArchivo);
        this.vehiculos = persistencia.cargarDatos();
        this.ultimoId = vehiculos.isEmpty() ? 0 : vehiculos.getLast().getId();
    }

    @Override
    public void add(Vehiculo vehiculo) {
        vehiculo.setId(++ultimoId);
        this.vehiculos.add(vehiculo);
        persistencia.guardarDatos(vehiculos);
    }

    @Override
    public Optional<Vehiculo> findById(int id) {
        return vehiculos.stream().filter(vehiculo -> vehiculo.getId() == id).findFirst();
    }

    @Override
    public List<Vehiculo> findAll() {
        return vehiculos;
    }

}
