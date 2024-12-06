package models;

public enum Deporte {
    FUTBOL(1.9),
    BASQUET(1.4),
    NATACION(1.6),
    BOXEO(1.3),
    HANDBALL(1.1),
    TENIS(1.2),
    GENERICO(1.0);

    private final double incremento;

    Deporte(double incremento) {
        this.incremento = incremento;
    }

    public double getIncremento() {
        return incremento;
    }

    public static Deporte fromDeporte(String deporte) {
        Deporte deporteIncremento = GENERICO;
        String upperCaseArtista = deporte.toUpperCase();

        for (Deporte deporteEnum : values()) {
            if (deporteEnum.name().equals(upperCaseArtista.replace(" ", "_"))) {
                deporteIncremento = deporteEnum;
            }
        }

        return deporteIncremento;
    }
}
