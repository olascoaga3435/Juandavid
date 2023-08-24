/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Estos números están en orden creciente.");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Estos números están en orden decreciente.");
        } else {
            System.out.println("Estos números no siguen un orden creciente ni decreciente.");
        }

        scanner.close();
    }
}

