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
/IReservable/
--
+ realizarReserva(nombreCliente:String, nroNoches: int): bool
+ cancelarReserva(nombreCliente:String): bool
*/
public interface IReservable {
    
    // realizarReserva(nombreCliente:String, nroNoches: int): bool
    boolean realizarReserva(String nombreCliente, int nroNoches) throws ReservaInvalidaException;
    
    // cancelarReserva(nombreCliente:String): bool
    boolean cancelarReserva(String nombreCliente) throws ReservaNoExistenteException;
}
