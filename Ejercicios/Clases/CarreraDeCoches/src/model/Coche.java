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
Coche
--
-marca: str
-modelo: str
-velocidadMaxima: double
--
acelerar(): void
frenar(): void
mostrarInformacion(): void
 */
public class Coche {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // acelerar(): void
    // imprime un mensaje que indica que el coche está acelerando.
    public void acelerar() {
        System.out.println("El coche " + this.modelo + " acelera a " + this.velocidadMaxima + " km por hora.");
    }

    // frenar(): void
    // imprime un mensaje que indica que el coche está frenando.
    public void frenar() {
        System.out.println("El coche " + this.modelo + " ha frenado.");
    }

    // mostrarInformacion(): void
    // imprime en consola la información del coche, incluyendo marca, modelo y velocidad máxima
    public void mostrarInformacion() {
        System.out.println("Coche{ \n" + "marca = " + marca + "\nmodelo = " + modelo + "\nvelocidadMaxima = " + velocidadMaxima + '}');
    }

}
