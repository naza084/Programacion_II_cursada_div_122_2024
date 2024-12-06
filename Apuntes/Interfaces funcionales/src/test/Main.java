/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */

/*
Imaginemos una tienda con lista de productos, se requiere filtrar 
ciertos productos segun criterio especifico
*/
class Producto {
    String nombre;
    double precio;
    String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }
    
    
}


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        // Se evita el desorden de crear clases adicionales para peque?as funcionalidades
        // Clase anonima (sin nombre y con cuerpo)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Ejecutando el hilo usando una clase");
            }
        };
        
        
        // Usando expresiˆun lambda para implementar runnable
        Runnable runnable2 = () -> System.out.println("Ejecutando en un hilo con lambda");
        
        // Creacion de hilos
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        
        thread.start();
        thread2.start();
        */
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        Producto producto1 = new Producto("Iphone", 60, "Tecnologia");
        Producto producto2 = new Producto("Libro", 30, "Libreria");
        Producto producto3 = new Producto("Cafetera", 120, "electrodomestico");
        Producto producto4 = new Producto("Tablet", 30, "Tecnologia");
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
         
        // filtrar productos de tecnologia y que cuestan mˆhs de 50 dolares
        List<Producto> productosFiltrados;
        
        // usamos un lambda para filtrar productos y luego lo transformamos a una lista
        productosFiltrados = productos.stream()
                .filter(p -> p.categoria.equalsIgnoreCase("Tecnologia") && p.precio > 50)
                .collect(Collectors.toList());
        
        productosFiltrados.forEach(System.out::println);
    }
}
