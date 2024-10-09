/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */

/*
/IVehiculoElectrico/
--
+ cargarBateria(cantidad: int): void
+ getNivelBateria():int
*/
public interface IVehiculoElectrico {
    
    void cargarBateria(int cantidad);
    int getNivelBateria();
    
}
