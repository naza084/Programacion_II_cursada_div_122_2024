/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import models.Libro;
import models.Revista;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro = new Libro("123", "Diario 1", 2019);
        Revista revista = new Revista("lenzo", "Fallos", 2020, 40);
        
        System.out.println(libro);
        System.out.println(revista);
    }
    
}
