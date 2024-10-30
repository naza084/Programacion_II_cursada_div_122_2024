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
        
        Triatleta triatleta = new Triatleta("Nacza");
        
        // Contexto 1: natacion
        triatleta.nadar();
        
        // Contexto 2: carrera
        triatleta.correr();
    }
    
}
