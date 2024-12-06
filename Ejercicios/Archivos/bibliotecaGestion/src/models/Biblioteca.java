package models;

import java.util.List;
import java.util.Optional;

public class Biblioteca {
    private String nombre;
    private GestorBiblioteca gestor;

    public Biblioteca(GestorBiblioteca gestor, String nombre) {
        this.gestor = gestor;

        validarNombre(nombre);
        this.nombre = nombre;
    }

    public void agregarLibro(String titulo, String autor) {
        gestor.agregarLibro(titulo, autor);
    }

    public Optional<Libro> buscarLibroPorId(int id) {
        return gestor.buscarLibroPorId(id);
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        return gestor.buscarLibrosPorAutor(autor);
    }

    public List<Libro> listarLibros() {
        return gestor.listarLibros();
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }

        if (nombre.length() < 3){
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres");
        }
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Biblioteca{");
        sb.append("gestor=").append(gestor);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
