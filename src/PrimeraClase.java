public class PrimeraClase {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media =  (8.2 + 6.0 + 9.0) / 3;

        System.out.println(media);

        // ejercicio sobre operadores de incremento
        // Operador de pre-incremento
        // primero aumenta el valor, después la utiliza en la expresión
        int puntos = 10;
        int puntosVip = ++puntos;
        System.out.println("Los puntos son " + puntos + " y para VIP son " + puntosVip);
        // Operador de post-incremento
        // utiliza la variable en la expresión, después aumenta su valor
        puntosVip = puntos++;
        System.out.println("Los puntos son " + puntos + " y para VIP son " + puntosVip);

        if(puntosVip == puntos++) {
            System.out.println("Primero comprueba la condición, después incrementa a "+ puntos + ".");
        } else {
            System.out.println("Primero incrementa a " + puntos + ", después comprueba la condición.");
        }
    }
}