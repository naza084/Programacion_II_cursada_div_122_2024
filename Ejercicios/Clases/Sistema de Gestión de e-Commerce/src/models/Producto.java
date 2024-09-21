/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Producto {
    private String nombre;
    private double precio;
    private String codigo;
    private ArrayList<Categoria> categorias;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.categorias = new ArrayList<Categoria>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    // mostrarDetalles
    @Override
    public String toString() {
        return "Producto {" + "nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo + '}';
    }

    // agregarCategorias
    public void agregarCategoria(Categoria[] categorias){
        for (Categoria c : categorias){
            this.categorias.add(c);
            c.agregarProducto(this);
        }
    }
    
    // aplicarDescuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("El porcentaje no debe ser negativo ni mayor a 100.");
        } else {
            this.precio -= this.precio * (porcentaje / 100);
        }
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.codigo);
        hash = 23 * hash + Objects.hashCode(this.categorias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Producto otroProducto = (Producto) obj;
        
        boolean mismoNombre = Objects.equals(this.nombre, otroProducto.getNombre());
        boolean mismoCodigo = Objects.equals(this.codigo, otroProducto.getCodigo());
        // Comparacion segura para evitar problemas de precisión
        boolean mismoPrecio = Math.abs(this.precio - otroProducto.getPrecio()) < 0.0001;

        return mismoPrecio && mismoNombre && mismoCodigo;
    }
}
