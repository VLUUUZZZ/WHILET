import java.util.Scanner;

public class Trabajo {
    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumeros(String mensaje) {
        int numeroTemporal = 0;
        System.out.println(mensaje);
        numeroTemporal = scanner.nextInt();

        while (numeroTemporal <= 0) {
            System.out.println("Por favor, ingresa un número positivo mayor a cero.");
            System.out.println(mensaje);
            numeroTemporal = scanner.nextInt();
        }

        return numeroTemporal;
    }

    public static void main(String[] args) {
        int numero = obtenerNumeros("Ingresa un número:");
        int numero2 = obtenerNumeros("Ingresa otro número:");
        int resultado = numero / numero2;
        System.out.println("El resultado es: " + resultado);
    }
}
