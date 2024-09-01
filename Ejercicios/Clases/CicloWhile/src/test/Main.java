/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import model.Contador;

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
        Bucle while
        Implementa un bucle while que continúe ejecutándose mientras una condición sea verdadera.
        
        Conﬁguración del Entorno de Desarrollo:
        ●    Crea un nuevo proyecto llamado CicloWhile.
        
        Instrucciones:
        ●    Deﬁne una clase Contador.
        ●    Crea un método que use un bucle while para contar desde 1 hasta 10, imprimiendo cada número.
        ●    Modiﬁca el método para que termine de contar si el número llega a 5.
        
        Tips:
        ●    Un bucle while sigue ejecutándose mientras la condición que se le da sea true. Es útil cuando no se conoce el número exacto de iteraciones.
        ●    La sintaxis es similar al Python pero el bloque de ejecución utiliza llaves {}. while (i >= n){
        System.out.println(""); i++;
        }
         */
        
        Contador contador = new Contador(10);
        contador.mostrarConteo();
        
        contador.setMaximo(5);
        contador.mostrarConteo();

    }
}
