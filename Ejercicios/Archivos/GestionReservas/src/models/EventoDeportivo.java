package models;

public class EventoDeportivo extends Evento {
    private String deporte;

    public EventoDeportivo(String nombre, double costoBase, int capacidadAsistentes, String deporte) {
        super(nombre, costoBase, capacidadAsistentes);
        this.deporte = deporte;
    }

    @Override
    public double calcularCostoFinal() {
        return costoBase * Deporte.fromDeporte(deporte).getIncremento();
    }
}
