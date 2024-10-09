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
public class Tren {
    private static int id = 1;
    private int numeroId;
    private ArrayList<Integer> tiempoEstaciones;

    public Tren() {
        this.numeroId = id++;
        this.tiempoEstaciones = new ArrayList<>();
    }
    
    public void agregarTiempo(int tiempo){
        if (tiempo < 0) {
            throw new IllegalArgumentException("Tiempo negativo.");
        }
        
        this.tiempoEstaciones.add(tiempo);
    }
    
    public int calcularTiempoTotal(){
        if (this.tiempoEstaciones.isEmpty()) {
            throw new NoSuchElementException("No hay tiempo de estaciones.");
        }
        int tiempoTotal = 0;
            
        for (Integer tiempo : this.tiempoEstaciones) {
            tiempoTotal += tiempo;
        }
        
        return tiempoTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tren {");
        sb.append(" numeroId = ").append(numeroId);
        sb.append(", tiempoEstaciones = ").append(tiempoEstaciones);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
