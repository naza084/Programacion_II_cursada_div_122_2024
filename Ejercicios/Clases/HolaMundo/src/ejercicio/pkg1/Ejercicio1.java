/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author PC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Imprimiendo en Consola
        Estás empezando a programar en Java y tu primer objetivo es aprender a imprimir mensajes en la consola.
        
        Instrucciones:
        ●    Escribe un programa que imprima "Hola, Mundo" en la consola.
        ●    Luego, imprime tu nombre y tu edad.
        
        Tips de Sintaxis:
        ●    En Java, utilizamos System.out.println() para imprimir en la consola, mientras que en Python se usa print().
        ●    Cada línea de código en Java termina con un punto y coma (;), a diferencia de Python, que no lo requiere
        
        Explicación Adicional:
        ●    System: Es una clase en Java que proporciona acceso a recursos del sistema, como la entrada y salida estándar.
        ●    out: Es una variable estática de la clase System que representa el ﬂujo de salida estándar. 
        En otras palabras, es el canal por el cual se envía el texto a la consola.
        ●    println(): Es un método de PrintStream (el tipo de out) que imprime el texto seguido de un salto de línea.
        */
        
        System.out.println("Hola, mundo");
        
        String nombre = "naza";
        int edad = 19;
        
        System.out.println("Mi nombre es " + nombre + ", tengo " + edad + " años");
        
    }
}
