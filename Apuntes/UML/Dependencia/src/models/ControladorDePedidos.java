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
ControladorDePedidos
--
+ confirmarPedido(producto: Producto, cantidad: int): void
--
*/
public class ControladorDePedidos {
    
    private ControladorDePedidos() {
        throw new IllegalStateException("Utility class");
    }
    
    // confirmarPedido(producto: Producto, cantidad: int): void
    // controlador usa a producto solo en esta situacion(depende de producto para funcionar), es una relacion debil
    public static void ControlarPedido(Producto producto, int cantidad){
        if (producto.hayStock(cantidad)) {
            System.out.println("Pedido confirmado.");
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}
