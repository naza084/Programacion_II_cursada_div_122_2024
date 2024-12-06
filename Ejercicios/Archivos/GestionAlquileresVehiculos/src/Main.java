import models.Auto;
import models.Moto;
import models.Reserva;
import services.GestorAlquileres;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de GestorAlquileres
        GestorAlquileres gestor = new GestorAlquileres("src/archive/vehiculos.dat", "src/archive/reservas.dat");

        try {
            // Crear vehículos
            Auto auto1 = new Auto("Modelo A", 100, true);
            Moto moto1 = new Moto("Modelo B", 50, 600);

            // Agregar vehículos al gestor
            gestor.agregarVehiculo(auto1);
            gestor.agregarVehiculo(moto1);

            // Crear una reserva
            Reserva reserva1 = new Reserva("Cliente 1", 0);
            reserva1.agregarVehiculo(auto1);
            reserva1.agregarVehiculo(moto1);


            // Agregar reserva al gestor
            gestor.agregarReserva(reserva1);

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


        // Calcular ingresos para un día específico
        double ingresos = gestor.calcularIngresos(5);
        System.out.println("Ingresos calculados: $" + ingresos);

        // Aplicar un descuento del 10% a todos los vehículos
        gestor.aplicarDescuento(vehiculo -> vehiculo.getPrecioBasePorDia() * 0.9);

        // Mostrar resumen de los vehículos después del descuento
        gestor.filtrarVehiculos(v -> true).forEach(vehiculo -> {
            System.out.println(vehiculo.mostrarResumen());
        });
    }
}