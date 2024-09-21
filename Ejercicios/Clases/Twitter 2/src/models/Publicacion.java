/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author PC
 */

/*
Publicacion
--
- contenido: String
- fecha: LocalDate
- hora: LocalTime
- comentarios: ArrayList<Comentario>
--
+ recibirComentario(String nuevoComentario): void
+ MostrarComentarios(): void
 */
public class Publicacion {

    private String contenido;
    private LocalDate fecha;
    private LocalTime hora;
    private ArrayList<Comentario> comentarios;

    public Publicacion(String contenido) {
        this.contenido = contenido;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.comentarios = new ArrayList<>();
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    // recibirComentario(String nuevoComentario): void
    public void recibirComentario(String contenidoComentario) {
        Comentario nuevoComentario = new Comentario(contenidoComentario, this);

        if (comentarios.contains(nuevoComentario)) {
            throw new IllegalArgumentException("No se pueden tener comentarios repetidos");
        }

        this.comentarios.add(nuevoComentario);
    }

    // mostrarComentarios(): void
    public void mostrarComentarios() {
        if (!this.comentarios.isEmpty()) {
            String texto = "Comentarios: ";
            for (Comentario c : comentarios) {
                texto += "\n"+ c.getContenido() + " | " + c.getFecha();
            }

            System.out.println(texto);
        } else {
            throw new IllegalStateException("No hay comentarios.");
        }
    }

    
    @Override
    public String toString() {
        return "Publicacion {" + "contenido=" + contenido + ", fecha=" + fecha + ", hora=" + hora + ", comentarios=" + comentarios + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.contenido);
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
        final Publicacion other = (Publicacion) obj;
        return Objects.equals(this.contenido, other.contenido);
    }
    
    
}
