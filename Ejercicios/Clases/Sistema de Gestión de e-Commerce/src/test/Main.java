/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
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

        // No existe carrito de compras en main(existe en cliente), ejemplo claro de composicion
        Cliente cliente = new Cliente("naza", "120dasafsas.com", "buenos aires");

        Producto producto1 = new Producto("mouse", 50.5, "1");
        Producto producto2 = new Producto("monitor", 100, "2");

        Categoria categoria1 = new Categoria("Electronicos", "productos electronicos");
        categoria1.agregarProducto(producto1);
        categoria1.agregarProducto(producto2);

        System.out.println(categoria1.getProductos());
        // descuento aplicado
        System.out.println(producto1.getPrecio());
        producto1.aplicarDescuento(20);
        System.out.println(producto1.getPrecio());

        cliente.agregarProducto(producto1, 3);
        cliente.agregarProducto(producto2, 5);

        System.out.println(cliente.getCarrito()); // producto con su cantidad

        Pedido pedido = cliente.realizarPedido();
        System.out.println(pedido.toString());
        pedido.confirmar();
        System.out.println(pedido.toString());

        System.out.println(cliente.getCarrito());

    }
}
