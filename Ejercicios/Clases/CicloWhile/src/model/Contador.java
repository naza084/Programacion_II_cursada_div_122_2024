/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Contador {
    private int maximo;

    public Contador(int maximo) {
        this.maximo = maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMaximo() {
        return maximo;
    }
    
    public void mostrarConteo(){
        int conteo = 1;
        
        while(conteo <= this.maximo){
            System.out.println(conteo);
            conteo++;
        }
    }
}
