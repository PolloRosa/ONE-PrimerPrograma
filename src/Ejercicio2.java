import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int MAXIMO_INTENTOS = 5;
        final int MAXIMO_SECRETO = 100;
        final String MENSAJE_INICIO = "Adivine el número secreto entre 1 y %d, intento %d:%n";
        final String MENSAJE_EXITO = "¡Acertó!";
        final String MENSAJE_ERROR = "No es el número secreto: ingresa un número.";
        final String MENSAJE_ERROR2 = "No es el número secreto: ingresa un número entre 1 y %d.";
        final String MENSAJE_MAYOR = "No es el número secreto: es mayor.";
        final String MENSAJE_MENOR = "No es el número secreto: es menor.";
        final String MENSAJE_FRACASO = "No es el número secreto y fue el último intento.";
        int intento = 1, respuesta;
        Scanner teclado = new Scanner(System.in);
        String mensaje;

        int numeroSecreto = new Random().nextInt(1, MAXIMO_SECRETO + 1);

        System.out.println("==========JUEGO DE ADIVINANZAS==========");
        System.out.printf("Instrucciones: tiene %d intentos para adivinar el número secreto entre 1 y %d, " +
                "recibirá pistas (si es mayor o menor) ante cada intento fallido de adivinarlo.%n", MAXIMO_INTENTOS,
                MAXIMO_SECRETO);
        System.out.println("Empecemos...\n");

        while(intento <= MAXIMO_INTENTOS) {
            System.out.printf(MENSAJE_INICIO, MAXIMO_SECRETO, intento);
            try {
                respuesta = teclado.nextInt();

                if(respuesta != numeroSecreto) {
                    if(numeroSecreto > respuesta) mensaje = MENSAJE_MAYOR;
                    else {
                        mensaje = MENSAJE_MENOR;
                        if(respuesta > MAXIMO_SECRETO) mensaje = String.format(MENSAJE_ERROR2, MAXIMO_SECRETO);
                    }
                    if(intento == 5) mensaje = MENSAJE_FRACASO;
                    System.out.println(mensaje);
                } else {
                    System.out.println(MENSAJE_EXITO);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR);
                teclado.nextLine();
            }
            intento++;
        }
        teclado.close();
    }
}
