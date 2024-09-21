/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;

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
        Modificacion
        Instrucciones:
        1.   Crea un ArrayList llamado numeros.
        2.   Añade los números 5, 10, 15 y 20 al ArrayList.
        3.   Imprime el contenido del ArrayList.
        4.   Accede al segundo elemento (índice 1) y cámbialo a 25.
        5.   Imprime el contenido actualizado del ArrayList.
        6.   Elimina el elemento en el índice 0.
        7.   Imprime el contenido del ArrayList después de la eliminación.
        */
        
        ArrayList<Integer> numeros = new ArrayList();
        
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        
        for (Integer numero : numeros) {
            System.out.print(numero + " | ");
        }
        System.out.println("");
        
        numeros.set(1, 25);
        
        for (Integer numero : numeros) {
            System.out.print(numero + " | ");
        }
        System.out.println("");

        
        numeros.remove(0); // puede ser tambien objeto wrapperinteger, string, character, etc.
        
        for (Integer numero : numeros) {
            System.out.print(numero + " | ");
        }
        System.out.println("");

        
        /*
        Busqueda
        Instrucciones:
        1.   Utiliza el ArrayList modiﬁcado del ejercicio anterior.
        2.   Comprueba si el número 15 está presente en la lista usando el método contains().
        3.   Imprime un mensaje indicando si el número está presente o no.
        */
        
        System.out.println(numeros.contains(15)); // true
        
        /*
        Iteracion
        Instrucciones:
        1.   Utiliza el ArrayList del ejercicio anterior.
        2.   Crea una variable llamada suma e inicializala en 0.
        3.   Utiliza un bucle for-each para sumar todos los elementos del ArrayList.
        4.   Imprime la suma total.
        */
        
        int suma = 0;
        
        for (Integer numero : numeros) {
            suma += numero;
        }
        
        System.out.println("La suma es: " + suma);
        
    }
}
