/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public class Profesor extends Persona implements IDocente {

    private int grupo;
    private LocalDateTime horario;

    public Profesor(int grupo, LocalDateTime horario, String nombre, int edad) {
        super(nombre, edad);
        this.grupo = grupo;
        this.horario = horario;
    }
    
    @Override
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public int getGrupo() {
        return grupo;
    }

    @Override
    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", grupo=").append(grupo);
        sb.append(", horario=").append(horario);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
