/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import models.*;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        Alumno alumno1 = new Alumno(122, "Naza", 19);
        Profesor profesor = new Profesor(8, LocalDateTime.now(), "Daniel", 35);
        Bedele bedele = new Bedele("Limpieza", "Renzo", 25);
        
        personas.add(bedele);
        personas.add(alumno1);
        personas.add(profesor);
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
    }
}
