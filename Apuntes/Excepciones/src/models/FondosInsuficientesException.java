/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */

// Excepcion personalizada
public class FondosInsuficientesException extends Exception{

    public FondosInsuficientesException(String message) {
        super(message);
    }
    
}
