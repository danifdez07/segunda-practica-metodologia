package BloqueA;

public class Ejemplo1_5 {

    public static void revisarStock(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("Stock negativo no permitido");
        }
    }
    public static void ejecutar() {
        try {
            revisarStock(-1);
        } catch (Exception e) {
            System.out.println("[Sección 1.5] Capturado: " + e.getMessage());
        }
    }
}
