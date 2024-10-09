/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */

/*
/Vehiculo/
--
# marca: String
# modelo: String
--
+ acelerar(velocidad: int); void
+ frenar(cantidadVelocidad: int): int: void
+ frenar(): void
*/
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    // acelerar(velocidad: int); void
    public void acelerar(int velocidad){
        if (velocidad < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        }
        System.out.println("Acelerando a " + velocidad + " KM por hora.");
    }
    
    // frenar(cantidadVelocidad: int): int: void
    public void frenar(int cantidadVelocidad){
        if (cantidadVelocidad < 0) {
            throw new IllegalArgumentException("La cantidad de velocidad para frenar no puede ser negativa.");
        }
        System.out.println("Frenando a " + cantidadVelocidad + " KM por hora.");
    }
    
    // frenar(): void
    public void frenar(){
        System.out.println("El coche frenó por completo.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo {");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
