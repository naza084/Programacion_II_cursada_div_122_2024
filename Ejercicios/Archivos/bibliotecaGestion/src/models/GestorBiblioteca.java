package models;

import java.util.List;
import java.util.Optional;

public class GestorBiblioteca {
    private final IRepository<Libro> libroIRepository;

    public GestorBiblioteca(IRepository<Libro> libroIRepository) {
        this.libroIRepository = libroIRepository;
    }

    /**
     * Agrega un libro a la biblioteca
     * @param titulo titulo del libro
     * @param autor autor del libro
     */
    public void agregarLibro(String titulo, String autor) {
        int nuevoId = libroIRepository.getIdMax() + 1;
        Libro libro = new Libro(autor, titulo, nuevoId);
        libroIRepository.add(libro);
    }

    /**
     * Verifica si un libro ya existe en la biblioteca
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @return true si el libro ya existe, false en caso contrario
     */

    /**
     * Busca un libro por su id
     * @param id id del libro
     * @return un libro si existe, null en caso contrario
     */
    public Optional<Libro> buscarLibroPorId(int id) {
        return libroIRepository.findById(id);
    }

    /**
     * Busca libros por autor
     * @param autor autor del libro
     * @return lista de libros del autor
     */
    public List<Libro> buscarLibrosPorAutor(String autor) {
        return libroIRepository.findByAuthor(autor);
    }

    /**
     * Lista todos los libros de la biblioteca
     * @return lista de libros
     */
    public List<Libro> listarLibros() {
        return libroIRepository.findAll();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GestorBiblioteca{");
        sb.append("libroRepository=").append(libroIRepository);
        sb.append('}');
        return sb.toString();
    }
}
