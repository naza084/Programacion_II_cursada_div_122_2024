/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Repositorio<T> {
    
    private List<T> elementos = new ArrayList<>();

    public void agregarElemento(T elemento){
        this.elementos.add(elemento);
    }
    
    public T obtener(int indice){
        return elementos.get(indice);
    }
    
    public List<T> obtenerTodos(){
        return elementos;
    }
}
