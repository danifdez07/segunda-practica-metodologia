package BloqueA;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_1 {
    public static void ejecutar() {
        try {

            Scanner lector = new Scanner(new File("menu_dia.txt"));
            System.out.println("Leyendo menú...");
        } catch (FileNotFoundException e) {
            System.out.println("[Sección 1.1] Error: El archivo del menú no existe.");
        }
    }
}
