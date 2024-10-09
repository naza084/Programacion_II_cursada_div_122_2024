/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class PagoEnEfectivo extends MetodoPago{

    public PagoEnEfectivo(double cargoTransaccion, double limitePago) {
        super(cargoTransaccion, limitePago);
    }

    @Override
    public void realizarPago(double monto) throws LimitePagoExcedidoException {
        if (monto > limitePago) {
            throw new LimitePagoExcedidoException("El monto excede el limite de pago");
        }
        cargoTransaccion -= monto;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PagoConTargeta {");
        sb.append("cargoTransaccion=").append(cargoTransaccion);
        sb.append(", limitePago=").append(limitePago);
        sb.append('}');
        return sb.toString();
    }
}
