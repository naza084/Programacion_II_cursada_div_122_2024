/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Ropa {
     /*
    Ropa debe tener atributos como talla y material.
**/
    private int talla;
    private String material;

    public Ropa(int talla, String material) {
        this.talla = talla;
        this.material = material;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ropa{");
        sb.append("talla=").append(talla);
        sb.append(", material=").append(material);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
