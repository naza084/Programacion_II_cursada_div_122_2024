/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author PC
 */

/*
Amigo
--
- fechaAñadido: LocalDate
--
+ gestionarSolicitudAmistad(usuario: Usuario): void
*/
public class Amigo {
    private LocalDate fechaAñadido;
    private Usuario usuario;

    public Amigo(Usuario usuario){    
        this.usuario = usuario;
    }

    // gestionarSolicitudAmistad(usuario: Usuario): void
    public void gestionarSolicitudAmistad(Usuario usuario) {
        if (!usuario.getAmigos().contains(this)) {
            usuario.agregarAmigo(this);
            this.usuario = usuario;
        } else {
            throw new IllegalArgumentException("No se pueden tener amigos repetidos.");
        }
    }

    @Override
    public String toString() {
        return "Amigo {" + "fechaA\u00f1adido=" + fechaAñadido + ", usuario=" + usuario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.usuario);
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
        final Amigo other = (Amigo) obj;
        return Objects.equals(this.usuario, other.usuario);
    }
    
    
}
