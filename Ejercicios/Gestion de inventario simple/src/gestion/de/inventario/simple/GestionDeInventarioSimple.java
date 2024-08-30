package gestion.de.inventario.simple;
import java.util.Scanner;

public class GestionDeInventarioSimple {
    public static void main(String[] args) {
        /*
        Ejercicio: Sistema de Gestión de Inventario de una Tienda
        
        Descripción del problema:
        Vas a crear un programa en Java para gestionar el inventario de una tienda. 
        El sistema debe permitir agregar, actualizar y mostrar la información de los productos en el inventario. 
        Cada producto tiene ciertos atributos básicos y algunos métodos para interactuar con ellos.

        Requerimientos:
        Crear una clase llamada Producto.
        La clase Producto debe contener atributos que permitan almacenar la información esencial sobre un producto.
        La clase Producto debe tener métodos que permitan:
        Mostrar la información del producto.
        Actualizar el precio o la cantidad en inventario del producto.
        Calcular el valor total del stock de ese producto (precio por cantidad).
        
        Diseño UML: Diagrama la clase Producto con sus atributos y métodos. Esto incluye definir el tipo de cada atributo y la firma de cada método.

        Resultado esperados:
        Agregar un nuevo producto al inventario (nombre, precio, cantidad).
        Actualizar el precio de un producto.
        Mostrar la información de un producto.
        Calcular el valor total en stock de un producto (precio * cantidad).
        */
        
        Scanner scanner = new Scanner(System.in);
        String input, respuesta;
        
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
