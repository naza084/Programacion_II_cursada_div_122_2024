/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Revista {
    
    private String codigo;
    private String titulo;
    private int anioPublicacion;
    private int nroRevista;

    public Revista(String codigo, String titulo, int anioPublicacion, int nroRevista) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.nroRevista = nroRevista;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNroRevista() {
        return nroRevista;
    }

    public void setNroRevista(int nroRevista) {
        this.nroRevista = nroRevista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Revista{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo=").append(titulo);
        sb.append(", anioPublicacion=").append(anioPublicacion);
        sb.append(", nroRevista=").append(nroRevista);
        sb.append('}');
        return sb.toString();
    }
    
    
}
