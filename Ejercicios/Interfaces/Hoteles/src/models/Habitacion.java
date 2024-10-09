/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */

/*
Habitacion
--
- tipoHabitacion: String
- desayunoIncluido: bool
*/
public class Habitacion {
    
    private String tipoHabitacion;
    private boolean desayunoIncluido;

    // Sobrecarga de constructores
    public Habitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public Habitacion(String tipoHabitacion, boolean desayunoIncluido) {
        this(tipoHabitacion);
        this.desayunoIncluido = desayunoIncluido;
    }
}
