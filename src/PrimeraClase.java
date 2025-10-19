public class PrimeraClase {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        /*double media =  (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);*/

        String sinopsis = """
                Matrix es una paradoja.
                La mejor película del fin del milenio.
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        String nombre = "Angela", signo = "Piscis", servicio = "Uber", destino = "Tecsup Santa Anita";
        int edad = 37;
        double tarifa = 14.456;
        System.out.println(String.format("Le saluda %s, le escribo por el aviso.", nombre));
        System.out.printf("Hola, mi nombre es %s, tengo %d años, soy del signo %s. Mucho gusto.%n", nombre, edad, signo);
        String cadenaSalida = """
                Su último viaje en %s fue a %s, su precio fue de %.2f.
                Confirmar para reagendar. (S/N)
                """.formatted(servicio, destino, tarifa);
        System.out.println(cadenaSalida);
    }
}