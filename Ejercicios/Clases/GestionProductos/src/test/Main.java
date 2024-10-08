/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import model.Producto;

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
        Gestión de Productos
        Imagina que eres el dueño de una pequeña tienda y has decidido mejorar la organización 
        y control de tu negocio. Para ello, vas a desarrollar un sistema que te ayude a gestionar tus
        productos de manera eﬁciente. Empieza con lo básico :
        
        Conﬁguración del Entorno de Desarrollo:
        1.   Crea un nuevo proyecto llamado GestionProductos.
        
        Instrucciones:
            1.   Creación de la Clase Producto:
            ○    Deﬁne una clase llamada Producto.
        
            ○    Atributos:
                ■    nombre: de tipo String, representa el nombre del producto.
                ■    codigo: de tipo String, representa un identiﬁcador único entre productos
                ■    precio: de tipo double, representa el precio del producto.
                ■    cantidad: de tipo int, representa la cantidad en stock del producto.
        
            ○    Constructor:
                ■    Crea un constructor que inicialice todos los atributos.
        
            ○    Métodos:
                ■    vender(int cantidadVendida): reduce la cantidad en stock según el número de unidades vendidas.
                ■    reabastecer(int cantidadReabastecida): aumenta la cantidad en stock según el número de unidades reabastecidas.
                
        2.   Clase Principal (Main):
            ○    Crea una clase Main con el método main.
            ○    Crea instancias de la clase Producto para al menos tres productos diferentes.
            ○    Llama a los métodos vender() y reabastecer() y muestra los resultados en consola
        */
        
        Producto producto1 = new Producto("Coca cola", "CO14", 120.5, 8);
        Producto producto2 = new Producto("Manaos", "MA52", 90, 5);        
        Producto producto3 = new Producto("Fanta", "FA24", 135.2, 7);        
        
        System.out.println("Informacion de los productos: ");
        System.out.println("");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        System.out.println("Vender productos: ");
        producto1.vender(3);        
        producto1.vender(35); // no deja 
        producto1.vender(-3); // no deja    
        System.out.println("");

        
        System.out.println("Rebastecer productos: ");
        producto2.reabastecer(34);
        producto2.reabastecer(-2); // no deja 
        producto2.reabastecer(0); // no deja
        System.out.println("");

        System.out.println("Informacion actualizada de los productos: ");
        System.out.println("");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        // TODO: probar los metodos vender y rebastecer, luego hacer el ejercicio 9
    }
}
