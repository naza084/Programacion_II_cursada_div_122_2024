import java.io.*;
import java.util.HashMap;

public class ManejadorArchivos {

    public static void crearArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo " + rutaArchivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static <K, V> void crearTabla(String rutaArchivo, int distanciaColumnas, String[] encabezados, HashMap<K, V> datos) {
        File archivo = new File(rutaArchivo);

        try {
            PrintWriter escritor = new PrintWriter(new FileWriter(archivo));

            // Crear el encabezado y obtener su tamaño
            StringBuilder encabezador = new StringBuilder();

            for (String encabezado : encabezados) {
                encabezador.append(String.format("%-" + distanciaColumnas + "s", encabezado));
            }
            int anchoLinea = encabezador.toString().length();

            // Escribir encabezado
            escritor.println(encabezador);

            // Generar la línea de guiones dinámicamente con StringBuilder
            escritor.println("-".repeat(anchoLinea));

            for (K dato : datos.keySet()) {
                escritor.printf("%-"+distanciaColumnas+"s %-"+distanciaColumnas+"s\n", dato, datos.get(dato));
            }
            escritor.close();
            System.out.println("Se creo la tabla " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String rutaArchivo, String contenido) {
        File archivo = new File(rutaArchivo);

        try {
            if (archivo.canWrite()){
                PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                salida.println(contenido);
                salida.close();
                System.out.println("Se escribio en el archivo " + rutaArchivo);
            } else {
                System.out.println("No se puede escribir en el archivo " + rutaArchivo);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }

    public static void leerArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);

        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {
            String lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }

    public static void eliminarArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);

        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Se elimino el archivo " + rutaArchivo);
        } else {
            System.out.println("No se pudo eliminar el archivo " + rutaArchivo);
        }

    }
}
