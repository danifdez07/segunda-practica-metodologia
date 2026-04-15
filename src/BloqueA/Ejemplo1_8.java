package BloqueA;

class RestauranteCerradoException extends Exception {
    public RestauranteCerradoException(String msg) { super(msg); }
}

public class Ejemplo1_8 {
    public static void intentarEntrar(int hora) throws RestauranteCerradoException {
        if (hora > 23) throw new RestauranteCerradoException("Cerrado por descanso.");
    }
    public static void ejecutar() {
        try {
            intentarEntrar(24);
        } catch (RestauranteCerradoException e) {
            System.out.println("[Sección 1.8] Propia: " + e.getMessage());
        }
    }
}
