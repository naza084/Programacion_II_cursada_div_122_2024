/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.io.FileNotFoundException;
import models.ArchivoTextoManejador;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoTextoManejador archivoManejador = new ArchivoTextoManejador();
        
        try {
            archivoManejador.abrirArchivo("dasd.txt");
            archivoManejador.cerrarArchivo();
        } catch (FileNotFoundException | IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());  
        } finally {
            System.out.println(archivoManejador);
        }
    }
    
}
