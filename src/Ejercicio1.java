public class Ejercicio1 {
    public static void main(String[] args) {
        double temperaturaCelsius = 25.5;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        int temperaturaEntera;

        System.out.println("Conversión de temperaturas exitosa.");
        System.out.printf("La temperatura %f grados Celsius equivale a %f grados Fahrenheit.%n", temperaturaCelsius, temperaturaFahrenheit);

        temperaturaEntera = (int) temperaturaFahrenheit;
        String imprimir = String.format("La temperatura en grados Fahrenheit entera es %d.", temperaturaEntera);
        System.out.println(imprimir);
    }
}
