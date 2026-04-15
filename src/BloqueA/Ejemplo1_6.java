package BloqueA;

public class Ejemplo1_6 {
    public static void ejecutar() {
        try {
            System.out.println("Cocinando...");
            int error = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error en cocina manejado.");
        } finally {
            System.out.println("[Sección 1.6] FINALLY: Limpiando cocina siempre.");
        }
    }
}
