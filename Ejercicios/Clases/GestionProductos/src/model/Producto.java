/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */

/*
Producto
- nombre: string
- codigo: string
- precio: double
- cantidad: int
--
+ vender(int cantidadVendida): void
+ reabastecer(int cantidadReabastecida): void
 */
public class Producto {

    private String nombre;
    private String codigo;
    private double precio;
    private int cantidad;

    public Producto(String nombre, String codigo, double precio, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // vender(int cantidadVendida): void
    // reduce la cantidad en stock según el número de unidades vendidas.
    public void vender(int cantidadVendida) {

        if (cantidadVendida >= 0 && cantidadVendida <= this.cantidad) {
            cantidad -= cantidadVendida;
        } else {
            System.out.println("Cantidad insuficiente de stock para vender.");
        }

    }

    // reabastecer(int cantidadReabastecida): void
    // aumenta la cantidad en stock según el número de unidades reabastecidas.
    public void reabastecer(int cantidadReabastecida) {

        if (cantidadReabastecida > 0) {
            cantidad += cantidadReabastecida;
        } else {
            System.out.println("No se puede rebastecer una cantidad negativa o neutra.");
        }

    }

    @Override
    public String toString() {
        return "Producto: " + this.nombre + "\ncodigo: " + this.codigo + "\nprecio: " + this.precio + "\ncantidad: " + this.cantidad + "\n";
    }

  


}
