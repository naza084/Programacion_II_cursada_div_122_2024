/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */

/*
Animal		
--
-nombre: str
-especie: str
-edad: int
--
hacerSonido(): void
comer(String comida): void
 */
public class Animal {

    private String nombre;
    private String especie;
    private int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }
    
    // hacerSonido(string sonido): void
    // imprime en consola un mensaje que indique el sonido característico del animal. Por ejemplo, "El león ruge"
    public void hacerSonido(String sonido){
        System.out.println("El " + this.especie + " " + sonido);
    }
    
    // comer(String comida): void
    // imprime un mensaje que indique que el animal está comiendo el tipo de comida pasada como parámetro. 
    // Por ejemplo, "El elefante está comiendo hierba".
    public void comer(String comida){
        System.out.println("El " + this.especie + " esta comiendo " + comida);
    }
    
}
