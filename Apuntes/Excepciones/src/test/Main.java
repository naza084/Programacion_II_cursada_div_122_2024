/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.Persona;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Persona persona = new Persona("dsad");
            persona.setNombre("pepito");
            persona.setNombre("monica");
            int das = 20/0;
        } catch (IllegalArgumentException e) {
            System.out.println("error de pepito."+ e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("esto se ejecuta siempre.");
        } 
        
       
    }
}
