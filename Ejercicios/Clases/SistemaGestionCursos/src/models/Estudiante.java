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
        this.cursosInscritos = null;
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
    
    // TODO: preguntarle despues a franco como hizo lo de calificarCurso de la clase curso
    // y las validaciones de inscribirse en curso
    
    // inscribirseEnCurso(Curso curso): void
    // añade un curso a la lista de cursos inscritos.
    // TODO: aca irian las mismas validaciones que inscribir estudiante, preguntarle a franco de eso
    // sino hacerlo igual, despues de esto hacer las pruebas en main y empezar a hacer el ejercicio de gta
    
    // mostrarInformacion():
    // imprime en consola el nombre del estudiante, su matrícula, y los cursos en los que está inscrito
    
}
