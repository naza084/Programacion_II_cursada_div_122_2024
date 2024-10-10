/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    // throws es para indicar las excepciones que va a tirar un metodo
    // es obligatorio se usa con metodos que lancen excepciones comprobadas(checked exceptions)
    // en el caso de IllegalArgumentException no es una excepcion comprobada(no es un fallo externo al programa sino que es un error logico o de api)
    public void setNombre(String nombre) throws Exception {
        if ("pepito".equals(nombre)) {
            throw new IllegalArgumentException("error de pepito");
        } else if ("monica".equals(nombre)) {
            throw new Exception("error de monica");
        }
        
        System.out.println("nombre asignado.");
    }
    
}
