/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class PagoConTargeta extends MetodoPago {

    public PagoConTargeta(double cargoTransaccion, double limitePago) {
        super(cargoTransaccion, limitePago);
    }

    @Override
    public void realizarPago(double monto) throws MontoNegativoException{
        if (monto < 0) {
            throw new MontoNegativoException("El monto a pagar no puede ser negativo.");
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
