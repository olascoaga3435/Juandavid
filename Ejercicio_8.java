/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        double suma = numero1 + numero2;
        
        System.out.println("La suma de estos dos números es: " + suma);
        
        scanner.close();
    }
}

