public class Ejercicio {
    public static void main(String[] args) {
        double temperaturaCelsius = 25.5;
        int temperaturaEntera;

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("Conversión de temperaturas exitosa.");
        System.out.printf("La temperatura %.2f grados Celsius equivale a %.2f grados Fahrenheit.%n", temperaturaCelsius, temperaturaFahrenheit);

        temperaturaEntera = (int) temperaturaFahrenheit;
        System.out.printf("La temperatura en grados Fahrenheit entera es %d", temperaturaEntera);
    }
}
