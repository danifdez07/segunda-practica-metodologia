import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class editarjson {

    // Metodo para guardar (lo dejamos aquí por si lo necesitas luego)
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metodo para cargar desde el archivo [cite: 225]
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String rutaArchivo = "usuario.json";

        guardarObjetoEnArchivo(rutaArchivo, new Usuario("Juan", 30, "juan@example.com")); // usamos esta linea para no sobreescribir el archivo


        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class); // aqui guardamos los datos

        if (usuarioCargado != null) {
            System.out.println("Salida del programa (desde el archivo): " + usuarioCargado.nombre); // aqui mostramos lo editado
        } else {
            System.out.println("Error: No se encuentra el archivo 'usuario.json'. Ejecuta el guardado al menos una vez.");
        }
    }

    // Clase de datos [cite: 248]
    static class Usuario {
        String nombre;
        int edad;
        String correo;

        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
    }
}