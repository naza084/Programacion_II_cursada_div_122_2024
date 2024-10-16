/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import models.Amigo;
import models.Publicacion;
import models.Usuario;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("naza", "naza039", "programador.");
        Usuario usuario2 = new Usuario("ayana", "kario3", "programadora");
        System.out.println(usuario1);
        
        Publicacion publicacion1 = usuario1.publicarActualizacion("primera publi");
        System.out.println(usuario1);
        System.out.println(publicacion1);
        
        publicacion1.recibirComentario("holanda");
        publicacion1.recibirComentario("suiza");
        publicacion1.mostrarComentarios();
        
        Amigo amigo1 = new Amigo(usuario1);
        Amigo amigo2 = new Amigo(usuario2);
        
        amigo1.gestionarSolicitudAmistad(usuario2);
        amigo2.gestionarSolicitudAmistad(usuario1);
    }
}
