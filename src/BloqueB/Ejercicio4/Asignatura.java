package BloqueB.Ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombreAsignatura;
    private List<Estudiante> listaEstudiantes; // El array dentro del objeto

    public Asignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void añadirEstudiante(Estudiante e) {
        this.listaEstudiantes.add(e);
    }

    @Override
    public String toString() {
        return "Asignatura: " + nombreAsignatura + " | Alumnos: " + listaEstudiantes;
    }
}
