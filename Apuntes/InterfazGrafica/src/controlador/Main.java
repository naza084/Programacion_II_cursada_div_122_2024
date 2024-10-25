/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/vista/EjemploVista.fxml"));
            Pane ventana = (Pane) loader.load();

            // Muestra la excena con el layout contenido
            Scene scene = new Scene(ventana);
            primaryStage.setScene(scene);
        } catch (IOException | IllegalStateException e) {
            System.out.println("No se pudo cargar el archivo FXML: " + e.getMessage());

            // Si falla la carga del FXML, mostrar una escena bˆhsica con un botˆun:
            Button boton = new Button("?Haz clic aquˆq!");
            
            // Crear un layout para contener el botˆun
            StackPane root = new StackPane();
            root.getChildren().add(boton);

            // Crear una escena con el layout
            Scene escenaFallback = new Scene(root, 300, 200);
            
            // Establecer la escena en el escenario
            primaryStage.setScene(escenaFallback);
       
            // Establecer tˆqtulo de la ventana
            primaryStage.setTitle("Hola Mundo JavaFX");
        } finally {
            // Mostrar la ventana, independientemente de lo que pase
            primaryStage.show();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
