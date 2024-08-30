package primer.programa;
// import models.*; importa todas las clases, no tan recomendable
import models.Auto;
import models.Perro;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo"); 
        
        Auto miAuto = new Auto("Ferrari", 2024, "Rojo");
        System.out.println(miAuto.getNombre());
        miAuto.Acelerar(24);
        System.out.println(miAuto.getNombre() + "acelera a " + miAuto.getVelocidad() + "Km por hora");
        
        Perro miPerro = new Perro("Fido", 3);  
        miPerro.ladrar();  
        
    }
}
