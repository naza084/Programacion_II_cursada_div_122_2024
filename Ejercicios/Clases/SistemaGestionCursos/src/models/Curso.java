/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.ArrayList;

/**
 *
 * @author PC
 */

/*
Curso
--
- nombre: string
- codigo: string
- capacidad: int
- categoria: Categoria
- estudiantesInscritos: List<Estudiante> 
--
+ inscribirEstudiante(Estudiante estudiante): void
+ removerEstudiante(Estudiante estudiante): void
+ mostrarInformacion(): void
+ calificarCurso(double calificacion: void
 */
public class Curso {

    private String nombre;
    private String codigo;
    private int capacidad;
    private Categoria categoria;
    private ArrayList<Estudiante> estudiantesInscriptos;

    public Curso(String nombre, String codigo, int capacidad, Categoria categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.estudiantesInscriptos = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setEstudiantesInscriptos(ArrayList<Estudiante> estudiantesInscriptos) {
        this.estudiantesInscriptos = estudiantesInscriptos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public ArrayList<Estudiante> getEstudiantesInscriptos() {
        return estudiantesInscriptos;
    }

    // inscribirEstudiante(Estudiante estudiante): void
    // añade un estudiante a la lista si hay espacio disponible o si ya esta inscripto.
    public void inscribirEstudiante(Estudiante estudiante) {

        if (estudiantesInscriptos.size() < capacidad) {
            if (!estudiantesInscriptos.contains(estudiante)) {
                estudiantesInscriptos.add(estudiante);
            } else {
                System.out.println("El estudiante ya está inscrito.");
            }
        } else {
            System.out.println("La clase ha alcanzado su capacidad máxima.");
        }

    }

    
    // removerEstudiante(Estudiante estudiante): void
    // elimina un estudiante de la lista.
    public void removerEstudiante(Estudiante estudiante) {

        if (!estudiantesInscriptos.contains(estudiante)) {
            estudiantesInscriptos.remove(estudiante);
            System.out.println("Estudiante eliminado con exito.");
        } else {
            System.out.println("El estudiante no esta en el curso.");
        }

    }
    
    // mostrarInformacion(): void
    // imprime en consola el nombre del curso, código, capacidad, categoría, y la lista de los estudiantes inscritos.
    public void mostrarInformacion(){
        String mensaje = "Curso{" + "\nnombre: " + nombre + "\ncodigo: " + codigo + "\ncapacidad: " + capacidad + "\ncategoria: " + categoria + "\n estudiantes inscriptos: " + estudiantesInscriptos + '}';
        System.out.println(mensaje);
    }

    

}
