import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo por consola: ");
        String rutaArchivo = input.nextLine();

        System.out.println("Ingrese el destinatario del archivo por consola: ");
        String destinatarioArchivo = input.nextLine();
        // Definir rutas de archivos
        // String sourceFile = rutaArchivo;
        // String destinationBin = "img.png";
        // String sourceFile = args[0];
        // String destinationBin = args[1];

        FileInputStream fileInput = null;
        FileOutputStream fileOut = null;

        try{
            fileInput = new FileInputStream(rutaArchivo);
            fileOut = new FileOutputStream(destinatarioArchivo);

            // Tamaño del buffer para leer y escribir de a bloques
            byte[] buffer = new byte[1024];
            int bytesRead; // cantidad de bytes leidos

            while ((bytesRead = fileInput.read(buffer)) > 0) { // lee de a bloques de 1024
                fileOut.write(buffer, 0, bytesRead);
            }

            System.out.println("Archivo copiado correctamente de " + rutaArchivo + " a " + destinatarioArchivo);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // cerrar los flujos
            try {
                if (fileInput != null) {
                    fileInput.close();
                }
                if (fileOut != null) {
                    fileOut.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}