/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */

/*
Producto
--
- nombre: str
- precio: double
- stock: int
--
+ hayStock(cantidad: int): boolean
*/
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto {" + "nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

    public boolean hayStock(int cantidad){
        return stock >= cantidad;
    }
    
}
