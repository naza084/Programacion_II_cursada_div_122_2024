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
CuentaCorriente
--
- sobregiroPermitido: double
--
*/
public class CuentaCorriente extends CuentaBancaria{
    private double sobregiroPermitido;
    
    public CuentaCorriente(double sobregiroPermitido, String numeroCuenta) {
        super(numeroCuenta);
        this.sobregiroPermitido = sobregiroPermitido;
    }

    @Override
    public double calcularInteres() {
        return saldo * 0.01;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente {");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", sobregiroPermitido=").append(sobregiroPermitido);
        sb.append('}');
        return sb.toString();
    }

    
    
}
