/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Cardiologo extends Medico implements IDieta{

    public Cardiologo(String nombre, Paciente pacienteAsignado, TipoSintoma especialidadSintoma) {
        super(nombre, pacienteAsignado, especialidadSintoma);
    }

    @Override
    public String diagnosticarPaciente() {
        verificarPacienteDiagnosticado();
        pacienteAsignado.setDiagnosticoDado(true);
        
        return "El paciente " + pacienteAsignado.getNombre() + "fue diagnosticado con exito!" + "\nResultado del diagnostico: niveles de colesterol altos.";
    }

    @Override
    public void tratarPaciente() {
        verificarPacienteTratado();
        pacienteAsignado.setTratamientoAplicado(true);
        
        // uso de metodo de interfaz de tratamiento 
        recetarDieta();
        String mensaje = "El tratamiento al paciente " + pacienteAsignado.getNombre() + " fue exitoso!";
        System.out.println(mensaje);
    }

    @Override
    public void recetarDieta() {
        System.out.println("El cardiologo " + nombre + "recetˆu una dieta para bajar el colesterol y mejorar la salud cardiovascular.");
    }

    
}
