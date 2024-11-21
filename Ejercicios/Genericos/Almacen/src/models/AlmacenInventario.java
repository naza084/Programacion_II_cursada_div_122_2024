/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class AlmacenInventario<T> {
    
    private List<T> productos;

    public AlmacenInventario(){
        productos = new ArrayList<>();
    }

    public List<T> getProducto() {
        return productos;
    }

    public void setProducto(T producto) {
        this.productos.add(producto);
    }
    
    public void mostrarProductos() throws IllegalCallerException{
        if (productos.isEmpty()) {
            throw new IllegalCallerException("El inventario esta vacio.");
        }
        
        String tipoProducto = productos.get(0).getClass().getSimpleName();
        System.out.println("Productos de tipo " + tipoProducto + ": ");
        for (T producto : productos) {
            System.out.println(producto);
        }
    }
    
    
}
