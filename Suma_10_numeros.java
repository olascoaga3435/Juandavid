/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Suma_10_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Numeros = 10;
        int sum = 0;

        for (int i = 0; i < Numeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            sum += numero;
        }

        System.out.println("La suma de los números es: " + sum);

        
        scanner.close();
    }
}

