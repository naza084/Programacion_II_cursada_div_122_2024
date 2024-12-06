package test;

import models.*;

public class Main {
    public static void main(String[] args) {

        LibroRepository repositorioLibros = new LibroRepository("src/archives/libros.dat");
        GestorBiblioteca gestor = new GestorBiblioteca(repositorioLibros);
        System.out.println("REPOSITORIO: "+repositorioLibros);

        try {
            gestor.agregarLibro("El principito", "Antoine de Saint-Exupéry");
            gestor.agregarLibro("El arte de la guerra", "Sun Tzu");
            gestor.agregarLibro("El señor de los anillos", "J.R.R. Tolkien");
            gestor.agregarLibro("El hobbit", "J.R.R. Tolkien");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(repositorioLibros);
        System.out.println(gestor.buscarLibroPorId(1));
        System.out.println(gestor.buscarLibrosPorAutor("Sun Tzu"));
        System.out.println(gestor.listarLibros());

        repositorioLibros.guardarDatos();
        System.out.println(repositorioLibros.cargarDatos());

    }
}