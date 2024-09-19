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
Estudiante
--
- nombre: string
- matricula: string
- cursosInscritos: List<Curso> 
--
+ inscribirseEnCurso(Curso curso): void
+ mostrarInformacion(): void
 */
public class Estudiante {

    private String nombre;
    private String matricula;
    private ArrayList<Curso> cursosInscritos;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.cursosInscritos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCursosInscritos(ArrayList<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    // inscribirseEnCurso(Curso curso): void
    // añade un curso a la lista de cursos inscritos.
    public void inscribirseEnCurso(Curso curso) {

        if (curso.getEstudiantesInscriptos().size() < curso.getCapacidad()) {
            if (!curso.getEstudiantesInscriptos().contains(this)) {
                cursosInscritos.add(curso);
                curso.getEstudiantesInscriptos().add(this);
            } else {
                System.out.println("El estudiante ya está inscrito.");
            }
        } else {
            System.out.println("La clase ha alcanzado su capacidad maxima.");
        }
    }

    // mostrarInformacion():
    // imprime en consola el nombre del estudiante, su matrícula, y los cursos en los que está inscrito
    public void mostrarInformacion() {
        String mensaje = "Estudiante {" + "\nnombre = " + nombre + "\nmatricula = " + matricula + "\ncursosInscritos = " + cursosInscritos + "\n}";
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre = " + nombre + ", matricula = " + matricula + '}';
    }
    
    

}
