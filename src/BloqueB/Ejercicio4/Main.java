package BloqueB.Ejercicio4;
import com.google.gson.Gson;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String fichero = "asignatura.json";

        // 1. CREAR Y GUARDAR
        Asignatura mp = new Asignatura("Metodologia de la Programacion");
        mp.añadirEstudiante(new Estudiante("Antonio", 9.5));
        mp.añadirEstudiante(new Estudiante("Manu", 7.0));

        try (FileWriter writer = new FileWriter(fichero)) {
            gson.toJson(mp, writer);
            System.out.println("Archivo guardado con exito.");
        } catch (IOException e) { e.printStackTrace(); }

        // 2. CARGAR DE VUELTA (Responde a la ultima pregunta del PDF)
        try (FileReader reader = new FileReader(fichero)) {
            Asignatura cargada = gson.fromJson(reader, Asignatura.class);
            System.out.println("Objeto recuperado: " + cargada);
        } catch (IOException e) { e.printStackTrace(); }
    }
}
