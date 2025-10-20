import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int MAXIMO_INTENTOS = 5;
        final int MAXIMO_SECRETO = 10; // 100
        final String MENSAJE_EXITO = "¡Acertó!";
        final String MENSAJE_ERROR = "No es el número secreto: ingresa un número.";
        final String MENSAJE_MAYOR = "No es el número secreto: es mayor.";
        final String MENSAJE_MENOR = "No es el número secreto: es menor.";
        final String MENSAJE_FRACASO = "No es el número secreto y fue el último intento.";
        int intento = 1, respuesta = 0;
        Scanner teclado = new Scanner(System.in);
        String mensaje;

        int numeroSecreto = new Random().nextInt(1, MAXIMO_SECRETO + 1);
        System.out.println("==========JUEGO DE ADIVINANZAS==========");
        System.out.println("Instrucciones: tiene 5 intentos para adivinar el número secreto entre 1 y 100, " +
                "recibirá pistas (si es mayor o menor) ante cada intento fallido de adivinarlo.");
        System.out.println("Empecemos...\n");

        while(intento <= MAXIMO_INTENTOS) {
            System.out.println("Adivine el número secreto entre 1 y 100, intento " + intento + ":");
            try {
                respuesta = teclado.nextInt();

                if(respuesta != numeroSecreto) {
                    if(numeroSecreto > respuesta) mensaje = MENSAJE_MAYOR;
                    else mensaje = MENSAJE_MENOR;
                    if(intento == 5) mensaje = MENSAJE_FRACASO;
                    System.out.println(mensaje);
                } else {
                    System.out.println(MENSAJE_EXITO);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR);
                intento++;
                teclado.nextLine();
                continue;
            }
            intento++;
        }
    }
}
