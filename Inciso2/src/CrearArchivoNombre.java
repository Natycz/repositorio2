import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivoNombre {

    public static void main(String[] args) {
        // Paso 1: Obtener tu nombre sin espacios
        String nombre = "NatalyZelada";
        String nombreSinEspacios = nombre.replace(" ", "");

        // Paso 2: Crear el contenido del archivo
        String contenido = "¡Hola, " + nombre + "! Este es un archivo creado para ti.";

        // Paso 3: Crear el archivo
        try {
            FileWriter writer = new FileWriter(nombreSinEspacios + ".txt");
            writer.write(contenido);
            writer.close();
            System.out.println("Se ha creado el archivo " + nombreSinEspacios + ".txt con éxito.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }
}
