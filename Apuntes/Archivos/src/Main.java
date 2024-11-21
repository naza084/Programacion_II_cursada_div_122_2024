import java.io.*;
import java.util.EventListener;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*
        ManejadorArchivos.escribirArchivo("Archivos/archivo.txt", "Hola mundo");
        ManejadorArchivos.escribirArchivo("Archivos/archivo.txt", "Adios mundo");
        ManejadorArchivos.leerArchivo("Archivos/archivo.txt");

        HashMap<String, Integer> personas = new HashMap<>();
        personas.put("Juan", 25);
        personas.put("Nazareno", 26);
        personas.put("Ana", 27);
        
        ManejadorArchivos.crearTabla("Archivos/tabla.txt", 10, new String[] { "Nombre", "Edad" }, personas);
        ManejadorArchivos.leerArchivo("Archivos/tabla.txt");
        ManejadorArchivos.eliminarArchivo("Archivos/archivo.txt");
        */

        try {
            File archivo = new File("Archivos/archivo.txt");
            /*
            if (archivo.createNewFile()){
                System.out.println("Se creo el archivo " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
            */
            if (archivo.delete()){
            System.out.println("Se elimino el archivo " + archivo.getName());
            } else {
                System.out.println("No se pudo eliminar el archivo " + archivo.getName());
            }
            System.out.println(archivo.getAbsoluteFile());
            System.out.println(archivo.lastModified());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }
}