/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.FileNotFoundException;

/**
 *
 * @author PC
 */
public class ArchivoTextoManejador implements IArchivoManejador {
    private boolean estadoAbierto;

    public ArchivoTextoManejador() {
        estadoAbierto = false;
    }
    
    @Override
    public void abrirArchivo(String nombreArchivo) throws FileNotFoundException{
        if (nombreArchivo.isEmpty()) {
            throw new FileNotFoundException("El archivo no existe.");
        }
        String[] tipoArchivo = nombreArchivo.split("\\.");
        if (!tipoArchivo[1].equals("txt")) {
            throw new FileNotFoundException("El formato del archivo no existe.");
        }
        
        estadoAbierto = true;
    }

    @Override
    public void cerrarArchivo() throws IllegalStateException{
        if (!estadoAbierto) {
            throw new IllegalStateException("El archivo ya esta cerrado.");
        }

        estadoAbierto = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArchivoTextoManejador {");
        sb.append("estadoAbierto=").append(estadoAbierto);
        sb.append('}');
        return sb.toString();
    }
    
    
}
