package BloqueA;

public class Ejemplo1_7 {
    public static void ejecutar() {
        try {
            int[] mesas = {1, 2, 3};
            System.out.println(mesas[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[Sección 1.7] Error: Esa mesa no existe.");
        }
    }
}
