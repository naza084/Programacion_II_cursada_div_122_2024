/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Pediatra extends Medico implements IVacuna {

    public Pediatra(String nombre, Paciente pacienteAsignado, TipoSintoma especialidadSintoma) {
        super(nombre, pacienteAsignado, especialidadSintoma);
    }

    @Override
    public String diagnosticarPaciente() {
        verificarPacienteDiagnosticado();
        pacienteAsignado.setDiagnosticoDado(true);
        
        return "El paciente " + pacienteAsignado.getNombre() + "fue diagnosticado con exito!" + "\nResultado del diagnostico: silbidos y sonidos anormales en los pulmones.";
    }

    @Override
    public void tratarPaciente() {
        verificarPacienteTratado();
        pacienteAsignado.setTratamientoAplicado(true);
        
        // uso de metodo de interfaz de tratamiento 
        realizarVacunacion();
        String mensaje = "El tratamiento al paciente " + pacienteAsignado.getNombre() + " fue exitoso!";
        System.out.println(mensaje);
    }

    @Override
    public void realizarVacunacion() {
        System.out.println("El pediatra " + nombre + " aplicˆu una vacuna para enfermedades pulmonares.");
    }
}
