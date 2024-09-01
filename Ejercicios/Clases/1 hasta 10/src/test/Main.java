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
        Bucle for
        Crea un programa que imprima los números del 1 al 10 en la consola. 
        
        Instrucciones:
        ●    Utiliza un bucle para recorrer los números del 1 al 10.
        ●    Imprime cada número en la consola.
        
        Tips de Sintaxis:
        ●    En Java, los bucles comunes incluyen for, while, y do-while. La estructura de un bucle for es diferente a la de Python, 
        ya que en Java se especiﬁca el inicio, la condición y el incremento en una sola línea.
        ○    Ej.: for (int i = 1; i <= 10;  i++) {}
        
        En la estructura del bucle for en Java, los espacios separados por ; se llaman componentes del bucle for. 
        Cada uno tiene una función especíﬁca:
        ■    Inicialización (int i = 1;): Se ejecuta una vez al principio del bucle. Aquí, se declara una variable i 
        y se inicializa en 1 (Puedes usar cualquier nombre de variable).
        ■    Condición (i <= 10;): Antes de cada iteración del bucle, se evalúa esta condición. Si es true, se ejecuta el bloque de código del bucle;
        si es false, el bucle termina. En este caso, el bucle continuará mientras i sea menor o igual a 10.
        ■    Incremento (i++): Se ejecuta al ﬁnal de cada iteración. Aquí, i++ aumenta el valor de i en 1 después de cada iteración.
        ●    En Python, los bucles for son más simples y suelen iterar directamente sobre una secuencia como una lista o un rango.
         */
        
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
    }
}
