/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */

/*
Adivinanza
--
-numeroSecreto: int
-intentos: int
--
adivinar(int numero): string
reiniciarJuego(): void
*/
public class Adivinanza {
    private int numeroSecreto;
    private int intentos;

    public Adivinanza() {
        this.numeroSecreto = (int) (Math.random() * 100) + 1;
        this.intentos = 10;
    }

    public void setNumeroSecreto(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public int getIntentos() {
        return intentos;
    }
    
    // adivinar(int numero): string
    // compara numero con numeroSecreto y retorna si es correcto, mayor o menor.
    public String adivinar(int numero){
        String mensaje = "";
        
        if(numero > this.numeroSecreto){
            mensaje = "Menor";
        } else if (numero < numeroSecreto) {
            mensaje = "Mayor";
        } else {
            mensaje = "Correcto!";
        }
        
        return mensaje;
    }
    
    // reiniciarJuego(): void
    // reinicia el juego generando un nuevo número secreto y reseteando el número de intentos
    public void reiniciarJuego(){
        this.numeroSecreto = (int) (Math.random() * 100) + 1;
        this.intentos = 10;
    }
    
}
