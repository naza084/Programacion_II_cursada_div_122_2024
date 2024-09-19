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
CuentaBancaria
--
- numeroCuenta: str
- sueldo: double
--
+ depositarSaldo(cantidad: double): void
+ realizarTransferencia(cuentaDestino: cuentaBancaria, saldo: double): void
*/
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente; 

    public CuentaBancaria(String numeroCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CuentaBancaria {" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    
    // depositarSaldo(saldo: double): void
    public void depositarSaldo(double cantidad){
        if (cantidad >= 0.0) {
            this.saldo += cantidad;
        } else {
            throw new IllegalArgumentException("No se puede depositar saldo negativo.");
        }
    }

    // realizarTransferencia(CuentaBancaria: cuentaDestino, saldo: double): void
    public void realizarTransferencia(CuentaBancaria cuentaDestino, double saldoTransferencia){
        if (cuentaDestino.equals(this)) {
            throw new IllegalArgumentException("No se puede transferir a si mismo, deposite en ese caso.");
        } else if (saldoTransferencia < 0 || this.saldo < saldoTransferencia) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        } else {
            cuentaDestino.saldo += saldoTransferencia;
            System.out.println("Transferencia exitosa.");
        }
    }
}
