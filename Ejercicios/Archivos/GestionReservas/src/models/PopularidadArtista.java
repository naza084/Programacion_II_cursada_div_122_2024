package models;

public enum PopularidadArtista {
    TAYLOR_SWIFT(1.5),
    ED_SHEERAN(1.4),
    BTS(1.6),
    JUSTIN_BIBER(1.3),
    JUANES(1.1),
    GENERICO(1.0);

    private final double incremento;

    PopularidadArtista(double incremento) {
        this.incremento = incremento;
    }

    public double getIncremento() {
        return incremento;
    }

    public static PopularidadArtista fromArtista(String artista) {
        PopularidadArtista popularidadRetorno = GENERICO;
        String upperCaseArtista = artista.toUpperCase();

        for (PopularidadArtista popularidad : values()) {
            if (popularidad.name().equals(upperCaseArtista.replace(" ", "_"))) {
                popularidadRetorno = popularidad;
            }
        }

        return popularidadRetorno;
    }
}