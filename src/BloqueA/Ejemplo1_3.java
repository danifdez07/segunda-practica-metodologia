package BloqueA;

public class Ejemplo1_3 {
    public static void ejecutar() {
        try {
            metodoA();
        } catch (ArithmeticException e) {
            System.out.println("[Sección 1.3] Excepción capturada en la cima de la pila.");
        }
    }
    public static void metodoA() { metodoB(); }
    public static void metodoB() {
        System.out.println("Lanzando error de cálculo...");
        int error = 10 / 0;
    }
}
