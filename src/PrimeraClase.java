public class PrimeraClase {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media =  (8.2 + 6.0 + 9.0) / 3;

        System.out.println(media);

        // Convenciones de código
        /* La convención de código de Java es un conjunto de reglas recomendadas
        * para escribir código Java que sea fácil de leer, entender y mantener.
        * Estas reglas han sido definidas por Oracle, la empresa que mantiene el
        * lenguaje Java, y son ampliamente seguidas por la comunidad de
        * desarrolladores de Java. */
        System.out.println("Los nombres de clases deben seguir la convención Upper CamelCase, ejemplo: " +
                PrimeraClase.class.getSimpleName());
        System.out.println("Los nombres de métodos deben seguir la convención camelCase, ejemplo: obtenerPromedio()");
        System.out.println("Los nombres de constantes deben estar en mayúsculas separadas por guiones bajos," +
                " ejemplo: CAPACIDAD_MAXIMA_ESTUDIANTES");
        System.out.println("Los nombres de variables deben seguir la convención camelCase, ejemplo: " +
                "fechaDeLanzamiento");
    }
}