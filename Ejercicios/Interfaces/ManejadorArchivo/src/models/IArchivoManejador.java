/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

import java.io.FileNotFoundException;

/**
 *
 * @author PC
 */
public interface IArchivoManejador {
    
    void abrirArchivo(String nombreArchivo) throws FileNotFoundException;
    
    void cerrarArchivo();
}
