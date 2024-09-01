/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import model.Estudiante;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Imagina que eres el administrador de una escuela que necesita un sistema para gestionar la información de los estudiantes, 
        como sus nombres, edades, cursos y caliﬁcaciones.
        
        Conﬁguración del Entorno de Desarrollo:
        ●    Crea un nuevo proyecto llamado MoodlePremium.
        
        Instrucciones:
        ●    Crea la clase Estudiante en Java.
            ○    Atributos:
                ■    nombre (String): Nombre del estudiante.
                ■    apellido (String): Apellido del estudiante.
                ■    edad (int): Edad del estudiante.
                ■    curso (String): Curso en el que está inscrito el estudiante.
                ■    calificacionFinal (double): Caliﬁcación ﬁnal del estudiante.
        
        ●    Implementa un constructor que inicialice todos los atributos.
        ●    Añade métodos para obtener y modiﬁcar los atributos (getters y setters).
        ●    Implementa un método mostrarInformacion() que imprima la información del estudiante en la consola.
        ●    Finalmente, en el método main, crea una instancia de Estudiante y prueba todos sus métodos.
        */
        
        Estudiante estudiante = new Estudiante("Naza", "Cruz", 19, "Programacion II", 8);
        System.out.println("");

        System.out.println(estudiante);
        System.out.println(estudiante.mostrarInformacion());
    }
}
