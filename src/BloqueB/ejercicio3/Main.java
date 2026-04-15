package BloqueB.ejercicio3;

import com.google.gson.Gson;
import BloqueB.ejercicio2.Bola;

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

    public static void main(String[] args) {

        Bola[] misBolas = new Bola[3];
        misBolas[0] = new Bola("Roja", 15.5);
        misBolas[1] = new Bola("Azul", 10.0);
        misBolas[2] = new Bola("Verde", 20.2);


        guardarGenerico("array_de_bolas.json", misBolas);

        System.out.println("¡Archivo array_de_bolas.json creado con éxito!");
    }
}
