import java.util.Scanner;

public class Responder_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();

        long numeroRedondeado = Math.round(numero);

        System.out.println("El número " + numero + " redondeado es: " + numeroRedondeado);

        scanner.close();
    }
}
