package BloqueA;

public class Ejemplo1_2 {
    public static void ejecutar() {
        System.out.println("Entrando en: tomarPedido()");
        prepararComida();
        System.out.println("Saliendo de: tomarPedido()");
    }
    private static void prepararComida() {
        System.out.println("  -> Entrando en: prepararComida()");
        encenderFuego();
        System.out.println("  -> Saliendo de: prepararComida()");
    }
    private static void encenderFuego() {
        System.out.println("    -> Fuego encendido.");
    }
}
