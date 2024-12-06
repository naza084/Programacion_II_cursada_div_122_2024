package models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPersistencia implements Serializable {
    public static <T extends Serializable> void saveToFile(List<T> datos, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(datos);
            System.out.println("Datos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T extends Serializable> void saveToFile(int dato, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(dato);
            System.out.println("Datos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T extends Serializable> List<T> loadFromFile(String archivo) {
        File file = new File(archivo);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error al cargar los datos", e);
        }
    }
}
