/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author PC
 */
public class Estacion {
    private String nombre;
    private ArrayList<Tren> trenes;

    public Estacion(String nombre) {
        this.nombre = nombre;
        this.trenes = new ArrayList<>();
    }
    
    public void agregarTren(Tren tren){
        if (this.trenes.contains(tren)) {
            throw new IllegalArgumentException("No se pueden poner trenes repetidos");
        }
        
        this.trenes.add(tren);
    }
    
    public void mostrarTrenes(){
        if (this.trenes.isEmpty()) {
            throw new NoSuchElementException("No hay trenes en la lista.");
        }
        
        for (Tren tren: this.trenes) {
            System.out.println(tren);
        }
        // Otra forma más corta
        // this.trenes.forEach(System.out::print);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estacion {");
        sb.append("nombre = ").append(nombre);
        sb.append(", trenes = ").append(trenes);
        sb.append('}');
        return sb.toString();
    }

    
        
    
}
