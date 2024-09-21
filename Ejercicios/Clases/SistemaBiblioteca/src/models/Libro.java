/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Objects;

/**
 *
 * @author PC
 */
/*
Libro
--
- titulo: str
- genero: str
- disponible: boolean
--
+ prestar(): void
+ devolver(): void
*/
public class Libro {
    private String titulo;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Libro {" + "titulo=" + titulo + ", genero=" + genero + ", disponible=" + disponible + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public void prestar(){
        disponible = false;
    }
    public void devolver(){
        disponible = true;
    }

}
