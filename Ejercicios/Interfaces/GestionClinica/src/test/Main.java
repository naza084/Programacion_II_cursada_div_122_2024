/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.time.LocalDate;
import models.*;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Paciente paciente1 = new Paciente("Naza", TipoSintoma.FRACTURA);
            Traumatologo traumatologo1 = new Traumatologo("Maria", paciente1 ,TipoSintoma.FRACTURA);
            Pediatra pediatra1 = new Pediatra("Brian", paciente1, TipoSintoma.RESPIRATORIO);
            Cardiologo cardiologo1 = new Cardiologo("Luis", paciente1, TipoSintoma.CARDIACO);
            
            System.out.println(traumatologo1.diagnosticarPaciente());
            traumatologo1.tratarPaciente();
            
            // Diagnosticar paciente ya diagnosticado
            System.out.println(pediatra1.diagnosticarPaciente());
            
            // Tratar paciente ya tratado
            pediatra1.tratarPaciente();
            
            // Mismas pruebas con cardiologo
            System.out.println(cardiologo1.diagnosticarPaciente());
            cardiologo1.tratarPaciente();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
