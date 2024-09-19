/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import models.*;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("naza");
        Cliente cliente2 = new Cliente("angie");
        CuentaBancaria cuenta1 = new CuentaBancaria("1", cliente1);
        CuentaBancaria cuenta2 = new CuentaBancaria("2", cliente2);
        
        System.out.println(cliente1);
        System.out.println(cuenta1);
        
        cuenta2.depositarSaldo(53);
        System.out.println(cuenta2);
        cuenta1.depositarSaldo(425);
        cuenta1.realizarTransferencia(cuenta2, 422);
        System.out.println(cuenta1);
        System.out.println(cuenta2);

    }
}
