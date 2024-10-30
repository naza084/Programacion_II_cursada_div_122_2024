/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public interface IDocente {
    
    void setGrupo(int grupo);
    int getGrupo();
    void setHorario(LocalDateTime horario);
}
