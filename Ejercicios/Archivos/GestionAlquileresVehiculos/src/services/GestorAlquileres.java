package services;

import models.Reserva;
import models.Vehiculo;
import repository.IRepository;
import repository.ReservaRepository;
import repository.VehiculosRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class GestorAlquileres {
    private IRepository<Vehiculo> vehiculoRepository;
    private IRepository<Reserva> reservaRepository;

    public GestorAlquileres(String rutaArchivoVehiculos, String rutaArchivoReserva) {
        vehiculoRepository = new VehiculosRepository(rutaArchivoVehiculos);
        reservaRepository = new ReservaRepository(rutaArchivoReserva);
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculoRepository.add(vehiculo);
    }

    public Optional<Vehiculo> buscarVehiculoPorId(int id){
        return vehiculoRepository.findById(id);
    }

    public void agregarReserva(Reserva reserva){
        if (vehiculoRepository.findAll().isEmpty()){
            throw new IllegalArgumentException("No hay vehiculos registrados");
        }

        reservaRepository.add(reserva);
    }

    public double calcularIngresos(int dia){
        return reservaRepository.findAll().stream().mapToDouble(res -> res.calcularTotal(dia)).sum();
    }

    public List<Vehiculo> filtrarVehiculos(Predicate<Vehiculo> criterio){
        return vehiculoRepository.findAll().stream().filter(criterio).toList();
    }

    public void aplicarDescuento(Function<Vehiculo, Double> descuento){
        vehiculoRepository.findAll().forEach(vehiculo -> {
            double nuevoPrecio = descuento.apply(vehiculo);
            vehiculo.setPrecioBasePorDia(nuevoPrecio);
        });
    }

    public List<Vehiculo> traerVehiculos(){
        return vehiculoRepository.findAll();
    }

    public List<Reserva> traerReservas(){
        return reservaRepository.findAll();
    }
}
