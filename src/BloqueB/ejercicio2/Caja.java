package BloqueB.ejercicio2;

public class Caja {
    private String material;
    private Bola bolaAdentro; // ¡Aquí está la anidación! Una bola dentro de la caja.

    public Caja(String material, Bola bolaAdentro) {
        this.material = material;
        this.bolaAdentro = bolaAdentro;
    }
}
