/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
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
        
        Categoria categoria1 = new Categoria("Programación");
        Categoria categoria2 = new Categoria("Diseño");
        Categoria categoria3 = new Categoria("Estadística");

        Curso curso1 = new Curso("Curso de Python", "PY24", 2, categoria1);
        Curso curso2 = new Curso("Curso de Figma", "FI51", 1, categoria2);

        Estudiante estudiante1 = new Estudiante("Naza", "1001");
        Estudiante estudiante2 = new Estudiante("Maria", "1002");
        Estudiante estudiante3 = new Estudiante("Pedro", "1003");
        
        curso1.mostrarInformacion();    
        estudiante1.mostrarInformacion();

        estudiante1.inscribirseEnCurso(curso1);
        estudiante1.inscribirseEnCurso(curso1);
        estudiante2.inscribirseEnCurso(curso1);
        estudiante3.inscribirseEnCurso(curso1); // no deja inscribirse
        curso1.inscribirEstudiante(estudiante3); // tampoco deja inscribirse
        
        curso1.mostrarInformacion();
        curso1.calificarCurso(5);
        estudiante1.mostrarInformacion(); 
        
    }
}
