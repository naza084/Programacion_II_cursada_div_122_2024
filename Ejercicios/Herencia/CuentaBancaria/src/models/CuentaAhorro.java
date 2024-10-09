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
CuentaAhorro
--
- tasaInteres: double
--
*/
public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;
    
    public CuentaAhorro(String numeroCuenta, double tasaInteres) {
        super(numeroCuenta);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double calcularInteres() {
        return saldo * tasaInteres;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaAhorro {");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", tasaInteres=").append(tasaInteres);
        sb.append('}');
        return sb.toString();
    }
    
}
