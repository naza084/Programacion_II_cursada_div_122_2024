/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> participantes = new ArrayList<>();
        
        participantes.add("marcos");
        participantes.add("marcos");
        participantes.add("marcos");
        participantes.add("lalo");
        participantes.add("naza");
        participantes.add("enzo");
        participantes.add("seba");
        
        String personaABuscar1 = "marcos";
        String personaABuscar2 = "ken";
        
        if (participantes.contains(personaABuscar1)) {
            System.out.println("La persona esta en la lista");
        } else {
            participantes.add(personaABuscar2);
        }
        
        
        buscarPrimeraPosicion(personaABuscar1, participantes);
        buscaUltimaPosicion(personaABuscar1, participantes);
        
    }
    
    public static void buscarPrimeraPosicion(String participante, ArrayList<String> lista){
        int posicion = lista.indexOf(participante);
        
        System.out.println("primera aparicion: " + posicion);
    }
    
    public static void buscaUltimaPosicion(String participante, ArrayList<String> lista){
        int posicion = lista.lastIndexOf(participante);
        
        System.out.println("ultima aparicion: " + posicion);
    }
    
    public static List<String> hacerSubLista(ArrayList<String> lista, int minimo, int maximo){
        if (lista.isEmpty() || (minimo < 0 && maximo > lista.size()) ) {
            throw new IllegalAccessError("No se puede hacer la sublista.");
        }
        
        List<String> subLista = lista.subList(minimo, minimo);
        return subLista;
    }
    
    public static void borrarDuplicados(int minimo, int maximo){
        
    }
    
    
    
}
