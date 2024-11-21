import com.google.gson.Gson;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gson gson = new Gson();
        String json = gson.toJson("Hello world!");

        // Crear archivo json en ruta específica
        try {
            FileWriter file = new java.io.FileWriter("src/Archivos/HelloWorld.json");
            file.write(json);
            file.close();
        } catch (Exception e) {
            System.out.println("Error al crear archivo json");
        }

    }
}