/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");

        System.out.println(lista.get(0));  // Acceso por índice, imprime: Manzana

        System.out.println(lista);
    }
}
