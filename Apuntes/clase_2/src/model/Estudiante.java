/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private int calificacionFinal;

    public Estudiante(String nombre, String apellido, int edad, String curso, int calificacionFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.calificacionFinal = calificacionFinal;
    }

    // Metodos de acceso
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacionFinal(int calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public int getCalificacionFinal() {
        return calificacionFinal;
    }

    
    // Metodos de clase
    public String mostrarInformacion() {
        return "Estudiante: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad + "\nCurso: " + this.curso
                + "\nCalificacion final: " + this.calificacionFinal;
    }
    
}
