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
/MetodoPago/
--
# cargoTransaccion: double
# limitePago: double
--
/+ realizarPago(monto: double): void/
*/
public abstract class MetodoPago {
    protected double cargoTransaccion;
    protected double limitePago;

    public MetodoPago(double cargoTransaccion, double limitePago) {
        this.cargoTransaccion = cargoTransaccion;
        this.limitePago = limitePago;
    }
    
    public abstract void realizarPago(double monto) throws MontoNegativoException, LimitePagoExcedidoException;
}
