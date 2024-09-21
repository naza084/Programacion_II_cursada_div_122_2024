/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class CarritoDeCompras {
    private ArrayList<Producto> productos;
    private Map<Producto, Integer> cantidades;

    public CarritoDeCompras() {
        this.productos = new ArrayList<Producto>();
        this.cantidades = new HashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {

        if (this.productos.contains(producto)) {
            int cantidadNueva = cantidades.get(producto);
            cantidadNueva += 1;
            this.cantidades.put(producto, cantidadNueva);
        } else {
            this.productos.add(producto);
            this.cantidades.put(producto, cantidad);
        }

    }

    public void eliminarProducto(Producto producto) {
        
        if (this.productos.contains(producto)) {
            System.out.println("El producto no esta en el carrito.");
        } else {
            this.productos.remove(producto);
            this.cantidades.remove(producto);
        }

    }
    
    public Producto[] getProductos() {
        return productos.toArray(new Producto[0]);
    }

    public Map<Producto, Integer> getCantidades() {
        return cantidades;
    }
    
    public void limpiarCarrito(){
        this.productos.clear();
        this.cantidades.clear();
    }
    
    
    @Override
    public String toString() {
        String texto = "";

        if (this.productos.size() > 0) {
            for (Producto p : this.productos) {
                // Agregar nombre del producto y su cantidad
                texto += p.getNombre() + " | " + this.cantidades.get(p) + "\n";
            }
        } else {
            texto += "Carrito vacio.";
        }

        return texto;
    }
}
