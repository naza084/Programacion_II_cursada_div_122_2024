package services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPersistencia<T> {
    private String rutaArchivo;

    public GestorPersistencia(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    /**
     * guarda los datos en un archivo
     * @param data lista de datos genericos a guardar
     */
    public void guardarDatos(List<T> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga los datos desde un archivo.
     * @return Lista de datos cargados.
     */
    public List<T> cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            return (List<T>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error al cargar los datos", e);
        }
    }
}
