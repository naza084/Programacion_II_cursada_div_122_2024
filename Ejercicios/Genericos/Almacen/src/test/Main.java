/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

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
        
        Electronico electronico1 = new Electronico("Samsung", "A4");
        Electronico electronico2 = new Electronico("Apple", "11");
        Electronico electronico3 = new Electronico("LG", "F9");
        
        AlmacenInventario<Electronico> productosElectronicos = new AlmacenInventario();
        AlmacenInventario<Electronico> productosElectronicosVacio = new AlmacenInventario();
        
        productosElectronicos.setProducto(electronico1);
        productosElectronicos.setProducto(electronico2);
        productosElectronicos.setProducto(electronico3);
        
        // TODO: preguntar que es <?>
        try {
            productosElectronicos.mostrarProductos();
            productosElectronicosVacio.mostrarProductos();
        } catch (IllegalCallerException e) {
            System.out.println(e.getMessage());
        }
        
        Ropa ropa1 = new Ropa(4, "tela");
        Ropa ropa2 = new Ropa(3, "algodon");
        Ropa ropa3 = new Ropa(6, "Cuero");

        AlmacenInventario<Ropa> productosRopa = new AlmacenInventario();
        AlmacenInventario<Ropa> productosRopaVacio = new AlmacenInventario();
        
        productosRopa.setProducto(ropa1);
        productosRopa.setProducto(ropa2);
        productosRopa.setProducto(ropa3);
        
        try {
            productosElectronicos.mostrarProductos();
            productosElectronicosVacio.mostrarProductos();
        } catch (IllegalCallerException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
