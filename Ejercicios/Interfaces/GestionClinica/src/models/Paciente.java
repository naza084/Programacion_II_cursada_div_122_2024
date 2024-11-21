/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


/**
 *
 * @author PC
 */
public class Paciente {

    private String nombre;
    private Medico medicoAsignado;
    private boolean diagnosticoDado;
    private boolean tratamientoAplicado;
    private final TipoSintoma sintoma;

    public Paciente(String nombre, TipoSintoma sintoma) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        medicoAsignado = null;
        diagnosticoDado = false;
        tratamientoAplicado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        medicoAsignado.agregarPaciente(this);
        this.medicoAsignado = medicoAsignado;
    }

    public boolean isDiagnosticoDado() {
        return diagnosticoDado;
    }

    public void setDiagnosticoDado(boolean diagnosticoDado) {
        this.diagnosticoDado = diagnosticoDado;
    }

    public boolean isTratamientoAplicado() {
        return tratamientoAplicado;
    }

    public void setTratamientoAplicado(boolean tratamientoAplicado) {
        this.tratamientoAplicado = tratamientoAplicado;
    }

    public TipoSintoma getSintoma() {
        return sintoma;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append("nombre=").append(nombre);
        sb.append(", medicoAsignado=").append(medicoAsignado);
        sb.append(", diagnosticoDado=").append(diagnosticoDado);
        sb.append(", tratamientoAplicado=").append(tratamientoAplicado);
        sb.append(", sintoma=").append(sintoma);
        sb.append('}');
        return sb.toString();
    }

}
