import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite el exponente: ");
        int exponente = scanner.nextInt();

        double resultado = Math.pow(base, exponente);

        System.out.println(base + " elevado a la potencia " + exponente + " es igual a: " + resultado);

        scanner.close();
    }
}
