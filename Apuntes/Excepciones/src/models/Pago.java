/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Pago {
    private double saldo;
    private String tarjetaAsociada;

    public Pago(double saldo, String tarjetaAsociada) {
        this.saldo = saldo;
        this.tarjetaAsociada = tarjetaAsociada;
    }

    // Uso de excepcion personalizada
    public void procesarPago(double pago) throws FondosInsuficientesException{
        if (pago > this.saldo) {
            throw new FondosInsuficientesException("No hay fondos suficientes para el pago.");
        }
        this.saldo -= pago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pago{");
        sb.append("saldo=").append(saldo);
        sb.append(", tarjetaAsociada=").append(tarjetaAsociada);
        sb.append('}');
        return sb.toString();
    }
    
    
}
