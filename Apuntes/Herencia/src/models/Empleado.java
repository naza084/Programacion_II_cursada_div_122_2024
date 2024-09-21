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
Empleado
--
- nombre: String
- legajo: int
--
+ calcularPago(): double
*/
public class Empleado {
    protected String nombre;
    protected int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }


    @Override
    public String toString() {
        return "Empleado {" + "nombre=" + nombre + ", legajo=" + legajo + '}';
    }
    
    // metodo a sobreescribir
    public double calcularPago(){
        return 0;
    }
    
    
}
