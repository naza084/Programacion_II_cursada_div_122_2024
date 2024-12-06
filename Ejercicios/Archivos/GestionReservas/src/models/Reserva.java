package models;

public class Reserva {
    private String cliente;
    private int idEvento;

    public Reserva(String cliente, int idEvento) {
        this.cliente = cliente;
        this.idEvento = idEvento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reserva{");
        sb.append("cliente='").append(cliente).append('\'');
        sb.append(", idEvento=").append(idEvento);
        sb.append('}');
        return sb.toString();
    }
}
