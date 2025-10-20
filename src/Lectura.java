import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar el nombre de tu película favorita.");
        String pelicula = teclado.nextLine();
        System.out.println("Ingresar la fecha de lanzamiento");
        int fechaLanzamiento = teclado.nextInt();
        System.out.println("Ingresar una calificación para la película");
        double nota = teclado.nextDouble();

        System.out.println("Procesando...");
        System.out.println(pelicula);
        System.out.println(fechaLanzamiento);
        System.out.println(nota);

        teclado.close();
    }
}
