/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales.");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("Los tres números son diferentes.");
        } else {
            System.out.println("No todos los numeros son iguales ni diferentes.");
        }
        
        scanner.close();
    }
}

    