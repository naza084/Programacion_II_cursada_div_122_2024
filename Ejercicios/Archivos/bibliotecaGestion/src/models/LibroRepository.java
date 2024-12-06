package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibroRepository implements IRepository<Libro> {
    private List<Libro> libros;
    private final String RUTA_ARCHIVO;
    private int idMax;

    public LibroRepository(String rutaArchivo) {
        this.RUTA_ARCHIVO = rutaArchivo;
        libros = GestorPersistencia.loadFromFile(rutaArchivo);

        this.idMax = calcularIdMax();
    }

    private int calcularIdMax() {
        return libros.stream().mapToInt(Libro::getId).max().orElse(0);
    }

    public String getRutaArchivo() {
        return RUTA_ARCHIVO;
    }

    public List<Libro> getLibros() {
        return libros;
    }


    @Override
    public void add(Libro entity) {
        idMax++;
        entity.setId(idMax);
        this.libros.add(entity);

        GestorPersistencia.saveToFile(libros, RUTA_ARCHIVO);
    }

    @Override
    public Optional<Libro> findById(int id) {
        return libros.stream().filter(libro -> libro.getId() == id).findFirst();
    }

    @Override
    public List<Libro> findAll() {
        return libros;
    }

    @Override
    public List<Libro> findByAuthor(String autor) {
        return libros.stream().filter(libro -> libro.getAutor().equalsIgnoreCase(autor)).toList();
    }

    @Override
    public int getIdMax() {
        return 0;
    }


    public void guardarDatos(){
        GestorPersistencia.saveToFile(libros, RUTA_ARCHIVO);
    }
    public List<Serializable> cargarDatos(){
        return GestorPersistencia.loadFromFile(RUTA_ARCHIVO);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LibroRepository{");
        sb.append("libros=").append(libros);
        sb.append(", rutaArchivo='").append(RUTA_ARCHIVO).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
