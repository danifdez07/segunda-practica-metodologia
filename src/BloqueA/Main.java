package BloqueA;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("   REPORTE DE EJECUCIÓN: PRÁCTICA EXCEPCIONES    ");
        System.out.println("================================================\n");

        System.out.println(">>> SECCIÓN 1.1: Lectura de menú");
        Ejemplo1_1.ejecutar();

        System.out.println("\n>>> SECCIÓN 1.2: Flujo de preparación");
        Ejemplo1_2.ejecutar();

        System.out.println("\n>>> SECCIÓN 1.3: Búsqueda del manejador");
        Ejemplo1_3.ejecutar();


        System.out.println("\n>>> SECCIÓN 1.4: Captura con clase base Exception");
        Ejemplo1_4.ejecutar();

        System.out.println("\n>>> SECCIÓN 1.5: Verificación de Stock");
        Ejemplo1_5.ejecutar();


        System.out.println("\n>>> SECCIÓN 1.6: Limpieza obligatoria");
        Ejemplo1_6.ejecutar();

        System.out.println("\n>>> SECCIÓN 1.7: Errores típicos de Java");
        Ejemplo1_7.ejecutar();

        System.out.println("\n>>> SECCIÓN 1.8: Alerta de cierre de local");
        Ejemplo1_8.ejecutar();

        System.out.println("\n================================================");
        System.out.println("   DEMOSTRACIÓN FINALIZADA CON ÉXITO            ");
        System.out.println("================================================");
    }
}
