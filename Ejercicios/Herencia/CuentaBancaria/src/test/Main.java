/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import models.CuentaAhorro;
import models.CuentaCorriente;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaAhorro cuentaAhorro = new CuentaAhorro("43", 5);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(10, "241");
        
        cuentaAhorro.depositar(200);
        cuentaAhorro.retirar(150);
        cuentaAhorro.depositar(500);
        double interesCalculado = cuentaAhorro.calcularInteres();
        System.out.println(interesCalculado);
        System.out.println(cuentaAhorro);
        
        
        cuentaCorriente.depositar(3000);
        cuentaCorriente.retirar(500);
        cuentaCorriente.retirar(500);
        double interesCalculado2 = cuentaCorriente.calcularInteres();
        System.out.println(interesCalculado2);
        System.out.println(cuentaCorriente);
        
        
        
    }
    
}
