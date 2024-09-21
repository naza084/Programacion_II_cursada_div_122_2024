/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */

/*
Biblioteca
--
- Libros: List<Libros>
--
+ agregarLibro(libro: Libro): void
+ mostrarCatalogo(): void
+ prestarLibro(libro: Libro): void
+ devolverLibro(libro: Libro): void
+ consultarDisponibilidad(libro: Libro): boolean
+ consultarExistenciaLibro(libro: Libro): boolean
*/
public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    
    // agregarLibro(libro: Libro): void
    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }
    
    // mostrarCatalogo(): void
    public void mostrarCatalogo(){
        String texto = "Catalogo: ";
        
        for (Libro libro : libros) {
            texto += "\n" + libro.getTitulo() + " | " + libro.getGenero();
        }
        
        System.out.println(texto);
    }
    
    // prestarLibro(libro: Libro): void
    public void prestarLibro(Libro libro){
        if (!consultarExistenciaLibro(libro)) {
            throw new IllegalArgumentException(libro.getTitulo() + " no existe en el catalogo.");
        }
        if (!consultarDisponibilidad(libro)) {
            throw new IllegalArgumentException(libro.getTitulo() + " no está disponible para prestar.");
        }

        libro.prestar();
        System.out.println("El libro " + libro.getTitulo() + " fue prestado.");
    }
    
    // devolverLibro(libro: Libro): void
    public void devolverLibro(Libro libro){
        if (!consultarExistenciaLibro(libro)) {
            throw new IllegalArgumentException(libro.getTitulo() + " no pertenece al catalogo.");
        }
        if (consultarDisponibilidad(libro)) {
            throw new IllegalArgumentException(libro.getTitulo() + " ya está disponible.");
        }

        libro.devolver();
        System.out.println("El libro " + libro.getTitulo() + " fue devolvido.");
    }
    
    // consultarLibroDisponible(libro: Libro): boolean
    public boolean consultarDisponibilidad(Libro libro){
        return libro.isDisponible();
    }
    
    // consultarExistenciaLibro(libro: Libro): boolean
    public boolean consultarExistenciaLibro(Libro libro){
        boolean existeLibro = false;
        
        for (Libro libro1 : libros) {
            if (libro1.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                existeLibro = true;
                break;
            }
        }
        return existeLibro;
    }
}
