package BloqueB.ejercicio1;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void guardarGenerico(String ruta, Object objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(ruta)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T cargarGenerico(String ruta, Class<T> claseElegida) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(ruta)) {
            return gson.fromJson(reader, claseElegida);
        } catch (IOException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Circle circulo = new Circle(5.5);
        guardarGenerico("circulo.json", circulo);

        Employee empleado = new Employee(8, "Peter", "Tan", 2500);
        guardarGenerico("empleado.json", empleado);

        Circle circuloRecuperado = cargarGenerico("circulo.json", Circle.class);
        if (circuloRecuperado != null) {
            System.out.println("JSON a Objeto -> " + circuloRecuperado.toString());
        }

        Employee empleadoRecuperado = cargarGenerico("empleado.json", Employee.class);
        if (empleadoRecuperado != null) {
            System.out.println("JSON a Objeto -> " + empleadoRecuperado.toString());
        }
    }
}
