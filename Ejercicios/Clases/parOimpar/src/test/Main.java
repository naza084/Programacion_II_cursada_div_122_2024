/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Condicionales y Estructura de Control
        Escribe un programa que decida si un número es par o impar.
        
        Conﬁguración del Entorno de Desarrollo:
        ●    Crea un nuevo proyecto llamado par o impar.
        
        Instrucciones:
        ●    Declara una variable numero y asígnale un valor.
        ●    Escribe una estructura condicional que determine si el número es par o impar e imprime el resultado.
         */
        int numero = 8;

        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }

    }
}
