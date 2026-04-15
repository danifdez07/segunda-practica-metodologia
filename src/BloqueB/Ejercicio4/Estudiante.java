package BloqueB.Ejercicio4;
public class Estudiante {
    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', nota=" + nota + "}";
    }
}
