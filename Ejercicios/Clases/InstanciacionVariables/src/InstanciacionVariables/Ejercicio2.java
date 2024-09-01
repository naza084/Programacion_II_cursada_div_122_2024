/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InstanciacionVariables;
import model.Persona;

/**
 *
 * @author PC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Instanciación de Variables y Objetos en Java
        Este ejercicio te guiará a través de la instanciación de variables de tipos primitivos y objetos en Java. 
        Aprenderás la diferencia entre cómo se manejan en la memoria, y por qué String se escribe con mayúscula, 
        destacando su particularidad como clase en Java.
        
        Conﬁguración del Entorno de Desarrollo:
        ○    Crea un nuevo proyecto llamado InstanciacionVariables.
        
        Tareas:
        
        1.   Instanciación de Variables Primitivas:
        Instrucciones:
        ○    Declara e inicializa variables de los siguientes tipos primitivos: int, double, boolean, char.
        ○    Imprime los valores de estas variables en la consola.
        
        2.   Uso de la Clase String:
        Instrucciones:
        ○    Declara e inicializa una variable de tipo String.
        ○    Imprime el valor de la variable String en la consola.
        ○    Investiga y explica por qué String se escribe con mayúscula y cómo se almacena en memoria.
        
        3.   Instanciación de Objetos:
        Instrucciones:
        ○    Crea una clase llamada Persona con los siguientes atributos: nombre (String) y edad (int).
        ○    Implementa un constructor que inicialice estos atributos.
        ○    Añade métodos para obtener y modiﬁcar los atributos (getters y setters).
        ○    En la clase Main, crea una instancia de Persona, utiliza sus métodos y veriﬁca su funcionamiento.
        */
        
        // Variables
        int numero = 5;
        char letra = 'd'; 
        double decimal = 4.5;
        boolean bandera = false;
        
        System.out.println(numero);
        System.out.println(letra);
        System.out.println(decimal);
        System.out.println(bandera);
        
        
        // String, no es un tipo primitivo sino una clase (array de chars, a partir de java 9 es array de bytes)
        String cadena = "cadena";
        System.out.println(cadena);
        
        Persona persona = new Persona("naza", 19);
        
        persona.setNombre("max");
        System.out.println(persona.getNombre());
        
        persona.setEdad(20);
        System.out.println(persona.getEdad());
        
    }
}
