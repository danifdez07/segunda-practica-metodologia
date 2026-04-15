package BloqueA;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("   REPORTE DE EJECUCIÓN: PRÁCTICA EXCEPCIONES    ");
        System.out.println("================================================\n");

        // 1.1 Introducción (Manejo de archivos) [cite: 4]
        System.out.println(">>> SECCIÓN 1.1: Lectura de menú");
        Ejemplo1_1.ejecutar();

        // 1.2 Pila de llamadas [cite: 115]
        System.out.println("\n>>> SECCIÓN 1.2: Flujo de preparación");
        Ejemplo1_2.ejecutar();

        // 1.3 Excepciones y Pilas (Propagación) [cite: 175]
        System.out.println("\n>>> SECCIÓN 1.3: Búsqueda del manejador");
        Ejemplo1_3.ejecutar();

        // 1.4 Jerarquía de clases [cite: 200]
        System.out.println("\n>>> SECCIÓN 1.4: Captura con clase base Exception");
        Ejemplo1_4.ejecutar();

        // 1.5 Operaciones (throw/throws) [cite: 231]
        System.out.println("\n>>> SECCIÓN 1.5: Verificación de Stock");
        Ejemplo1_5.ejecutar();

        // 1.6 Bloque Finally [cite: 286]
        System.out.println("\n>>> SECCIÓN 1.6: Limpieza obligatoria");
        Ejemplo1_6.ejecutar();

        // 1.7 Excepciones comunes de la JVM [cite: 440]
        System.out.println("\n>>> SECCIÓN 1.7: Errores típicos de Java");
        Ejemplo1_7.ejecutar();

        // 1.8 Excepción propia (Personalizada) [cite: 463]
        System.out.println("\n>>> SECCIÓN 1.8: Alerta de cierre de local");
        Ejemplo1_8.ejecutar();

        System.out.println("\n================================================");
        System.out.println("   DEMOSTRACIÓN FINALIZADA CON ÉXITO            ");
        System.out.println("================================================");
    }
}
