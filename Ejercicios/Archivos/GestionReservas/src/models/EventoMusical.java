package models;

public class EventoMusical extends Evento {
    private String artista;

    public EventoMusical(String nombre, double costoBase, int capacidadAsistentes, String artista) {
        super(nombre, costoBase, capacidadAsistentes);
        this.artista = artista;
    }

    @Override
    public double calcularCostoFinal() {
        return costoBase * PopularidadArtista.fromArtista(artista).getIncremento();
    }
}
