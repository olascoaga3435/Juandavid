/**
 *
 * @author José francisco
 */
import java.util.Scanner;
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("Este número es positivo.");
        } else if (numero < 0) {
            System.out.println("Este número es negativo.");
        } else {
            System.out.println("Este número es cero.");
        }

        scanner.close();
    }
}