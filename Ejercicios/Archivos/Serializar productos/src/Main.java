import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
     La serialización en Java es el proceso de convertir un objeto en una secuencia de bytes para almacenarlo o
     transmitirlo, y luego reconstruir el objeto a partir de esos bytes (deserialización).
     Es útil para guardar el estado de un objeto o enviarlo a través de una red.
     */
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan", "30321");

        // Serialización
        serializarObjeto("Archivos/usuario.dat", usuario1);

        // Deserialización
        deserializarObjeto("Archivos/usuario.dat");

        List<Producto> productosList = new ArrayList<>();
        productosList.add(new Producto("Coca Cola", 100));
        productosList.add(new Producto("Pepsi", 80));
        productosList.add(new Producto("Fanta", 90));
        productosList.add(new Producto("Sprite", 70));

        serializarListaObjetos("Archivos/productos.dat", productosList);
        deserializarListaObjetos("Archivos/productos.dat", productosList.size());
        

    }

    /**
     * Serializa un objeto a un archivo especificado.
     *
     * @param <T>         el tipo del objeto a serializar
     * @param rutaArchivo la ruta del archivo donde se guardará el objeto
     * @param objeto      el objeto a serializar
     */
    private static void serializarObjeto(String rutaArchivo, Serializable objeto) {
        try (FileOutputStream fileOut = new FileOutputStream(rutaArchivo);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(objeto);
            System.out.println("Objeto serializado guardado en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserializa un objeto de un archivo especificado.
     *
     * @param <T>         el tipo del objeto a deserializar
     * @param rutaArchivo la ruta del archivo donde se encuentra el objeto
     */
    private static <T> void deserializarObjeto(String rutaArchivo) {
        try (FileInputStream fileIn = new FileInputStream(rutaArchivo);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            T objecto = (T) objectIn.readObject();
            System.out.println("Objeto deserializado: " + objecto);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serializa una lista de objetos a un archivo especificado.
     *
     * @param <T>         el tipo de los objetos a serializar
     * @param rutaArchivo la ruta del archivo donde se guardarán los objetos
     * @param listaObjetos la lista de objetos a serializar
     */
    private static <T> void serializarListaObjetos(String rutaArchivo, List<T> listaObjetos) {
        try (FileOutputStream fileOut = new FileOutputStream(rutaArchivo);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            for (T objeto : listaObjetos) {
                objectOut.writeObject(objeto);
            }
            System.out.println("Objetos serializados guardados en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserializa una lista de objetos de un archivo especificado.
     *
     * @param <T>           el tipo de los objetos a deserializar
     * @param rutaArchivo   la ruta del archivo donde se encuentran los objetos
     * @param cantidadObjetos la cantidad de objetos a deserializar
     */
    private static <T> void deserializarListaObjetos(String rutaArchivo, int cantidadObjetos) {
        try (FileInputStream fileIn = new FileInputStream(rutaArchivo);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            for (int i = 0; i < cantidadObjetos; i++) {
                T objeto = (T) objectIn.readObject();
                System.out.println("Objeto deserializado: " + objeto);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}