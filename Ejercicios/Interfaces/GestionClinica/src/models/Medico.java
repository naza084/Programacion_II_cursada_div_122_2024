/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;


/**
 *
 * @author PC
 */
public abstract class Medico {

    protected String nombre;
    protected Paciente pacienteAsignado;
    protected TipoSintoma especialidadSintoma;

    public Medico(String nombre, Paciente pacienteAsignado, TipoSintoma especialidadSintoma) {
        this.nombre = nombre;
        this.pacienteAsignado = pacienteAsignado;
        this.especialidadSintoma = especialidadSintoma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoSintoma getEspecialidadSintoma() {
        return especialidadSintoma;
    }


    public abstract String diagnosticarPaciente();

    public abstract void tratarPaciente();
    
    
    public void agregarPaciente(Paciente paciente) {
        verificarPacienteAsignado();
        validarPacienteEspecialidad(paciente);
        
        this.pacienteAsignado = paciente;
    }
    
    public void sacarPaciente(){
        verificarSinPaciente();
        pacienteAsignado = null;
    }

    
    protected void verificarPacienteDiagnosticado(){
        if (pacienteAsignado.isDiagnosticoDado()) {
            throw new IllegalArgumentException("El paciente " + pacienteAsignado.getNombre() + " ya fue diagnosticado.");
        }
    }
    
    protected void verificarPacienteTratado(){
        if (pacienteAsignado.isTratamientoAplicado()) {
            throw new IllegalArgumentException("El paciente " + pacienteAsignado.getNombre() + " ya fue tratado.");
        }
    }
   
    
    private void validarPacienteEspecialidad(Paciente paciente) throws IllegalArgumentException {
        if (paciente.getSintoma() != this.especialidadSintoma) {
            throw new IllegalArgumentException("El " + this.getClass().getSimpleName() + nombre + " no esta capacitado para sintomas del tipo " + paciente.getSintoma());
        }
    }
    
    private void verificarPacienteAsignado(){
        if (pacienteAsignado != null) {
            throw new IllegalCallerException("Ya hay un paciente asignado: " + pacienteAsignado.getNombre());
        }
    }
    
    private void verificarSinPaciente() throws IllegalArgumentException {
        if (pacienteAsignado == null) {
            throw new IllegalArgumentException("No hay paciente asignado.");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String especialidadMedico = this.getClass().getSimpleName();
        sb.append(especialidadMedico);
        sb.append(" {");
        sb.append("nombre=").append(nombre);
        sb.append(", pacienteAsignado=").append(pacienteAsignado);
        sb.append(", especialidadSintoma=").append(especialidadSintoma);
        sb.append('}');
        return sb.toString();
    }
   
}
