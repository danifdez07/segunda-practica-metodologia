package BloqueB.ejercicio2;
import com.google.gson.Gson;
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

        Bola miBola = new Bola("Roja", 15.5);


        Caja miCaja = new Caja("Cartón", miBola);

        guardarGenerico("caja_con_bola.json", miCaja);

        System.out.println("¡Archivo caja_con_bola.json creado con éxito!");
    }
}
