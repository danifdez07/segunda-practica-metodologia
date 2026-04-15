package BloqueA;

public class Ejemplo1_4 {
    public static void ejecutar() {
        try {
            String texto = null;
            texto.toString();
        } catch (Exception e) {
            System.out.println("[Sección 1.4] Se capturó un error usando la clase base Exception.");
        }
    }
}
