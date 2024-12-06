import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30, Arrays.asList("Java", "Python"));

        // Configurar Gson para salida con indentación
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter escritor = new FileWriter("src/Archivos/persona.json")) {
            gson.toJson(persona, escritor);
            System.out.println("Archivo JSON creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // TODO: dejar esto así, seguir con la guia 10, al menos 3 ejercicios y luego continuar la 9
        // TODO: hacer commit antes de lo de arriba


    }
}