package EjercicioAlumno.java;

public class Alumno {
    private String nombre;
    private Double nota;

    public Alumno(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getnota() {
        return nota;
    }

    public void setnota(Double nota) {
        this.nota = nota;
    }

    public static void guardarObjetoEnArchivo(String rutaArchivo, Alumno objeto) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        try (java.io.FileWriter writer = new java.io.FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static Alumno cargarObjetoDesdeArchivo(String rutaArchivo) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        try (java.io.FileReader reader = new java.io.FileReader(rutaArchivo)) {
            return gson.fromJson(reader, Alumno.class);
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el archivo. ¿Seguro que existe?");
            return null;
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {// comprobamos que el usuario ha pasado al menos 2 palabras
            System.out.println("Oye, te faltan datos. Escribe: <operacion> <fichero>");
            return; // Cortamos el programa aquí porque faltan datos
        }

        //  Guardamos las palabras que el usuario escribió
        String operacion = args[0]; // Esto será "init" o "show"
        String fichero = args[1];   // Esto será "dato.json"

        //  Comprobamos qué nos han pedido
        if (operacion.equals("init")) {
            Alumno alumnoPrueba = new Alumno("Manu", 7.5);
            guardarObjetoEnArchivo(fichero, alumnoPrueba);
            // Aquí luego meteremos el código de guardar
        } else if (operacion.equals("show")) {
            // 1. Llamamos a la fábrica y GUARDAMOS lo que nos devuelve en la variable
            Alumno alumnoRecu = cargarObjetoDesdeArchivo(fichero);

            // 2. Comprobamos que no haya habido errores al leer
            if (alumnoRecu != null) {
                // 3. Imprimimos los datos usando los getters
                System.out.println("¡Datos recuperados del archivo!");
                System.out.println("Nombre: " + alumnoRecu.getNombre());
                System.out.println("Nota: " + alumnoRecu.getnota());
            }
        }

        // Aquí luego meteremos el código de cargar
        else {
            System.out.println("Operación no válida. Usa 'init' o 'show'.");
        }
    }
}




