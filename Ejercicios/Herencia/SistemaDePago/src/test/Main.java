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
        
        PagoEnEfectivo pagoEfectivo = new PagoEnEfectivo(245, 500);
        PagoConTargeta pagoTarjeta = new PagoConTargeta(600, 1000);
        PagoConCriptomoneda pagoCriptos = new PagoConCriptomoneda(40, 100);
        
        
        try {
            pagoEfectivo.realizarPago(560);
            pagoTarjeta.realizarPago(-3);
            pagoCriptos.realizarPago(5);
        } catch (MontoNegativoException e) {
            System.out.println(e.getMessage());
        } catch (LimitePagoExcedidoException e) {   
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(pagoCriptos);
            System.out.println(pagoEfectivo);
            System.out.println(pagoTarjeta);
        }
    }
}
