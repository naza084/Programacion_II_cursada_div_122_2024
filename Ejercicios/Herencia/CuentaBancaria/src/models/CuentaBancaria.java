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
/CuentaBancaria/
--
# numeroCuenta: str
# saldo: double
--
+ depositar(monto: double): void
+ retirar(monto: double): void
/+ calcularInteres(): double/
 */
public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        saldo = 0;
    }

    // depositar(monto: double): void
    public void depositar(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }

        saldo += monto;
        System.out.println("Saldo depositado con exito.");
    }
    
    
    // retirar(monto: double): void
    public void retirar(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("El monto excede el saldo de la cuenta.");
        }
        
        saldo -= monto;
        System.out.println("Saldo retirado exitosamente.");
    }
    
    // /+ calcularInteres(): double/
    public abstract double calcularInteres();
    
    
}
