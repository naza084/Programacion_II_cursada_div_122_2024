package models;

import java.io.Serial;
import java.io.Serializable;

public class Libro implements Serializable  {
    @Serial
    private static final long serialVersionUID = 1L;
    private int id;
    private String titulo;
    private String autor;

    public Libro(String autor, String titulo, int id) {
        this.id = id;

        validarAutor(autor);
        this.autor = autor;

        validarTitulo(titulo);
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    private void validarAutor(String autor) {
        if (autor == null || autor.length() < 3) {
            throw new IllegalArgumentException("El título no puede estar vacío y debe tener al menos 3 caracteres.");
        }
    }

    private void validarTitulo(String titulo) {
        if (titulo == null || titulo.length() < 3) {
            throw new IllegalArgumentException("El autor no puede estar vacío y debe tener al menos 3 caracteres.");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro{");
        sb.append("autor='").append(autor).append('\'');
        sb.append(", id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
