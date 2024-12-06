package models;

public class IdGenerador {
    private static int idContador = 1;

    public static synchronized int generarId() {
        return idContador++;
    }
}

