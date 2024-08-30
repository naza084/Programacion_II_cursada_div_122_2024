package gestion.de.inventario.simple;
import java.util.Scanner;

public class GestionDeInventarioSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input, respuesta;
        
        // TODO: dejar esto como estructura para el ejercicio, copiar el enunciado aca y hacer la clase producto
        while (true) {
            System.out.println("Presiona 1, 2, 3 o 'q' para salir:");
            input = scanner.nextLine();

            respuesta = switch (input){
                case "1" -> "presionaste 1";
                case "2" -> "presionaste 2";
                case "3" -> "presionaste 3";
                case "q", "Q" -> "saliendo..";
                default -> "Entrada no valida. intentalo de nuevo.";
            };
            System.out.println(respuesta);
            
            if(input.equalsIgnoreCase("q")){
                break;
            }
        }
        
        
        
    }
}
