/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class CalculadoraBasica implements ICalculadora{

    @Override
    public double dividir(double a, double b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por 0.");
        }
        
        return a / b;
    }
}
