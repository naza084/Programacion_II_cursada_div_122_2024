/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Traumatologo extends Medico implements IYeso {

    public Traumatologo(String nombre, Paciente pacienteAsignado, TipoSintoma especialidadSintoma) {
        super(nombre, pacienteAsignado, especialidadSintoma);
    }

    @Override
    public String diagnosticarPaciente() {
        verificarPacienteDiagnosticado();
        pacienteAsignado.setDiagnosticoDado(true);
        
        return "El paciente " + pacienteAsignado.getNombre() + " fue diagnosticado con exito!" + "\nResultado del diagnostico: fractura.";
    }

    @Override
    public void tratarPaciente() {
        verificarPacienteTratado();
        pacienteAsignado.setTratamientoAplicado(true);
        
        // uso de metodo de interfaz de tratamiento  
        aplicarYeso();
        String mensaje = "El tratamiento al paciente " + pacienteAsignado.getNombre() + " fue exitoso!";
        System.out.println(mensaje);
    }

    @Override
    public void aplicarYeso() {
        System.out.println("El traumatologo coloco un yeso en el paciente.");
    }
}
