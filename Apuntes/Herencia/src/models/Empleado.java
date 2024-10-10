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
    private static int id = 1;
    
    protected int identificacion;
    protected String nombre;
    protected int legajo;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.legajo = id++;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("identificacion=").append(identificacion);
        sb.append(", nombre=").append(nombre);
        sb.append(", legajo=").append(legajo);
        sb.append('}');
        return sb.toString();
    }
    
    // metodo a sobreescribir
    public double calcularPago(){
        return 0;
    }
    
    
}
