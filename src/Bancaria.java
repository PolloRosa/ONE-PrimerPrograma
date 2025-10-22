import java.util.InputMismatchException;
import java.util.Scanner;

public class Bancaria {
    public static void main(String[] args) {
        String nombre = "Angela Cáceres";
        String tipoCuenta = "Corriente";
        double saldo = 200;
        final String MONEDA = "PEN";
        String respuesta, menu;
        Scanner input = new Scanner(System.in);

        System.out.println("*****************************************\n");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.printf("Saldo disponible: %.2f %s", saldo, MONEDA);
        System.out.println("\n\n*****************************************");

        menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        do {
            System.out.println(menu);
            respuesta = input.nextLine();

            switch(respuesta) {
                case "1":
                    System.out.printf("El saldo actualizado es: %.2f %s%n", saldo, MONEDA);
                    break;
                case "2":
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    try {
                        double retiro = input.nextDouble();
                        // fix porque el método nextLine() lee un salto de línea después de usar un nextInt o nextDouble
                        input.nextLine();
                        if(retiro <= 0) {
                            System.out.println("Retiro inválido");
                            break;
                        }
                        if(saldo >= retiro) {
                            saldo -= retiro;
                            System.out.printf("El saldo actualizado es: %.2f %s%n", saldo, MONEDA);
                        } else System.out.println("Saldo insuficiente.");
                    } catch (InputMismatchException e) {
                        System.out.println("Retiro inválido.");
                        input.nextLine();
                    }
                    break;
                case "3":
                    System.out.println("¿Cuál es el valor que vas a depositar?");
                    try {
                        double deposito = input.nextDouble();
                        // fix porque el método nextLine() lee un salto de línea después de usar un nextInt o nextDouble
                        input.nextLine();
                        if(deposito > 0) {
                            saldo += deposito;
                            System.out.printf("El saldo actualizado es: %.2f %s%n", saldo, MONEDA);
                        } else System.out.println("Depósito inválido.");
                    } catch (InputMismatchException e) {
                        System.out.println("Depósito inválido.");
                        input.nextLine();
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while(!respuesta.equals("9"));

        System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios.");
    }
}
