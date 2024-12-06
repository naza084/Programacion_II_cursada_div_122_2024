package models;

public abstract class Evento {
    protected static int ID_CONTADOR = 0;
    protected int id;
    protected String nombre;
    protected double costoBase;
    protected final int capacidadAsistentes;
    protected GestorReservas gestorReservas;

    public Evento(String nombre, double costoBase, int capacidadAsistentes) {
        this.nombre = nombre;
        this.gestorReservas = new GestorReservas(capacidadAsistentes, this);
        this.costoBase = costoBase;
        this.capacidadAsistentes = capacidadAsistentes;
        this.id = ID_CONTADOR++;
    }

    public abstract double calcularCostoFinal();

    public int getCapacidadAsistentes() {
        return capacidadAsistentes;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GestorReservas getGestorReservas() {
        return gestorReservas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Evento{");
        sb.append("capacidadAsistentes=").append(capacidadAsistentes);
        sb.append(", id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", costoBase=").append(costoBase);
        sb.append(", gestorReservas=").append(gestorReservas);
        sb.append('}');
        return sb.toString();
    }
}
