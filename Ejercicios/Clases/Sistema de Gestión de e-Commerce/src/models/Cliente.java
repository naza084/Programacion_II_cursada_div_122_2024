/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Cliente {
    private String nombre;
    private String email;
    private String direccionEnvio;
    private CarritoDeCompras carrito;
    private Pedido pedido;

    public Cliente(String nombre, String email, String direccionEnvio) {
        this.nombre = nombre;
        this.email = email;
        this.direccionEnvio = direccionEnvio;
        this.carrito = new CarritoDeCompras(); // relacion de composicion
        this.pedido = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public void setCarrito(CarritoDeCompras carrito) {
        this.carrito = carrito;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public CarritoDeCompras getCarrito() {
        return carrito;
    }
    
    public Pedido getPedido() {
        return pedido;
    }
    
    
    public void agregarProducto(Producto producto, int cantidad){
        carrito.agregarProducto(producto, cantidad);
    }
    
    // Sobrecarga de metodos
    public Pedido realizarPedido(){
        Pedido nuevoPedido = new Pedido(this.carrito, this.direccionEnvio); 
        this.carrito.limpiarCarrito(); // reiniciar carrito despues del pedido
        
        System.out.println("Pedido realizado.");
        return nuevoPedido;
    }
}

