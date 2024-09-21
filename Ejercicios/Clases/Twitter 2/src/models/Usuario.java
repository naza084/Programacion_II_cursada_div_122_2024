/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author PC
 */

/*
Usuario
--
- nombre: String
- email: String
- biografia: String
- amigos: ArrayList<Amigo>
--
+ agregarAmigo(Amigo nuevoAmigo): void
+ publicarActualizacion(String contenido): Publicacion
*/
public class Usuario {
    private String nombre;
    private String email;
    private String biografia;
    private ArrayList<Amigo> amigos;
    private ArrayList<Publicacion> publicaciones;

    public Usuario(String nombre, String email, String biografia) {
        this.nombre = nombre;
        this.email = email;
        this.biografia = biografia;
        this.amigos = new ArrayList<>();
        this.publicaciones = new ArrayList<>();
    }

    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    // agregarAmigo(Amigo nuevoAmigo): void
    public void agregarAmigo(Amigo nuevoAmigo){
        if (this.amigos.contains(nuevoAmigo)) {
            throw new IllegalArgumentException("no se puede tener amigos repetidos");
        }
        
        this.amigos.add(nuevoAmigo);
    }
    
    // publicarActualizacion(String contenido): Publicacion
    public Publicacion publicarActualizacion(String contenido){
        Publicacion publicacion = new Publicacion(contenido);
        
        if (this.publicaciones.contains(publicacion)) {
            throw new IllegalArgumentException("No se puede hacer publicaciones repetidas.");
        }
        
        this.publicaciones.add(publicacion);
        return publicacion;
    } 

    @Override
    public String toString() {
        return "Usuario {" + "nombre=" + nombre + ", email=" + email + ", biografia=" + biografia + ", amigos=" + amigos + ", publicaciones=" + publicaciones + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + Objects.hashCode(this.biografia);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.biografia, other.biografia);
    }
    
    
    
    
}
