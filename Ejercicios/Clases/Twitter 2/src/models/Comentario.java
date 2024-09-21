/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 *
 * @author PC
 */

/*
Comentario
--
- contenido: String
- fecha: LocalDate
--
+ editarComentario(nuevoContenido: String): void
+ eliminarComentario(): void
 */
public class Comentario {
    private String contenido;
    private LocalDate fecha;
    private Usuario usuario;
    private Publicacion publicacion;

    public Comentario(String contenido, Publicacion publicacion) {
        this.contenido = contenido;
        this.fecha = LocalDate.now();
        this.publicacion = publicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // editarComentario(nuevoContenido: String): void
    public void editarComentario(String nuevoContenido) {
        if (!nuevoContenido.isBlank()) {
            this.contenido = nuevoContenido;
        } else {
            throw new IllegalArgumentException("No se pueden poner comentarios vacios.");
        }
    }

    // eliminarComentario(): void
    public void eliminarComentario() {
        if (!publicacion.getComentarios().contains(this)) {
            throw new NoSuchElementException("El comentario no existe en la publicacion.");
        }
        publicacion.getComentarios().remove(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.contenido);
        hash = 59 * hash + Objects.hashCode(this.fecha);
        hash = 59 * hash + Objects.hashCode(this.usuario);
        hash = 59 * hash + Objects.hashCode(this.publicacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comentario other = (Comentario) obj;
        if (!Objects.equals(this.contenido, other.contenido)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return Objects.equals(this.publicacion, other.publicacion);
    }
    
    
}
