/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creacion de array
        int[] enteros = new int[3];
        int[] enteros1 = {3, 6, 7};
        
        enteros[0] = 50;
        enteros[1] = 50;
        enteros[2] = 50;
        
        // Matrices
        int[][] matriz = new int[2][3];
        int valor = 1;  // Empezamos con el valor 1

        // Llenar la matriz con valores secuenciales
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 4;
            }
        }

        // Imprimir la matriz manualmente
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // Imprime los elementos en la misma línea
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        System.out.println(matriz);
        
        
        // Colecciones
        
        /*
        ArrayList
        
        Características:
        - Es una lista basada en un array dinámico.
        - Ofrece acceso rápido por índice.
        - Es ideal cuando necesitas una lista de tamaño dinámico. 
        Uso:
        Muy utilizada debido a su flexibilidad y rendimiento en operaciones de busqueda de elementos.
        */
        ArrayList lista = new ArrayList();
        
        lista.add(523);
        
        /*
        LinkedList
        
        Características:
        - Basada en una lista doblemente enlazada.
        - Ideal para operaciones frecuentes de inserción y eliminación.
        - Implementa las interfaces List, Deque y Queue.  
        
        Uso:
        Adecuada para implementaciones de pilas y colas.
        */
        LinkedList<String> listaEnlazada = new LinkedList<>();

        listaEnlazada.add("Perro");
        listaEnlazada.add("Gato");
        listaEnlazada.add("Pájaro");

        // Recorrer la lista
        for (String animal : listaEnlazada) {
            System.out.println(animal);
        }
        
        /*
        HashSet
        
        Características:
        - Basada en una tabla hash.
        - No permite elementos duplicados.
        - No garantiza el orden de los elementos.
        
        Uso:
        Ideal para colecciones donde la unicidad es crucial.

        */
        HashSet<String> conjunto = new HashSet<>();

        conjunto.add("Rojo");
        conjunto.add("Azul");
        conjunto.add("Verde");
        conjunto.add("Rojo");  // Este duplicado será ignorado

        // Recorrer el conjunto
        for (String color : conjunto) {
            System.out.println("sin orden: " + color);  // Los elementos no tendrán un orden específico
        }
        
        
        HashMap<String, Integer> mapa = new HashMap<>();
        
        
        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);

        // Acceder a un valor por su clave
        System.out.println(mapa.get("Dos"));  // Imprime: 2

        // Recorrer el mapa
        for (String clave : mapa.keySet()) {
            System.out.println(clave + ": " + mapa.get(clave));
        }
        

    }
    
}

