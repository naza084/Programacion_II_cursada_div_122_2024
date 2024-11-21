/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author PC
 */
public class Pila<T> {

    private LinkedList<T> pilaGenerica;

    public Pila() {
        pilaGenerica = new LinkedList<>();
    }

    public LinkedList<T> getPilaGenerica() {
        return pilaGenerica;
    }

    public T extraer() {
        if (estaVacia()) {
            throw new IllegalCallerException("La pila esta vacia.");
        }
        return pilaGenerica.poll();
    }

    public T primero() throws IllegalCallerException{
        if (estaVacia()) {
            throw new IllegalCallerException("La pila esta vacia.");
        }
        return pilaGenerica.getFirst();
    }

    public void aniadir(T elemento) {
        pilaGenerica.add(elemento);
    }
    
    public void aniadirPrimero(T elemento) {
        pilaGenerica.addFirst(elemento);
    }

    public void aniadirUltimo(T elemento) {
        pilaGenerica.addLast(elemento);
    }

    
    public boolean estaVacia() {
        return pilaGenerica.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append("pilaGenerica=").append(pilaGenerica);
        sb.append('}');
        return sb.toString();
    }


}
