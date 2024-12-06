import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L; // Versión para evitar problemas de compatibilidad

    private String nombre;
    // La palabra clave transient se usa para evitar que un campo se serialice.
    private transient String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre='" + nombre + '\'' + ", contrasena='" + contrasena + '\'' + '}';
    }
}