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
        
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("habitos atomicos", "autoayuda");
        Libro libro2 = new Libro("feather girl", "fantasia");
        Libro libro3 = new Libro("otro libro", "fantasia");
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        
        System.out.println(biblioteca.consultarExistenciaLibro(libro3));
        
        biblioteca.mostrarCatalogo();
        biblioteca.prestarLibro(libro1);
        biblioteca.devolverLibro(libro1);
        biblioteca.devolverLibro(libro3); // excepcion, no se puede devolver un libro que no esta en la biblioteca
        System.out.println(libro1);
       
    }
}
