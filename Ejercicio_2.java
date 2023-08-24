/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este número es par.");
        } else {
            System.out.println("Este número es impar.");
        }

        scanner.close();
    }
}

