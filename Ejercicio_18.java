/**
 *
 * @author José franisco
 */
import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese su salario: ");
        double salario = scanner.nextDouble();
        
        if (edad < 17) {
            System.out.println("Lo siento, no puede trabajar.");
        } else if (edad >= 18 && edad <= 50) {
            salario *= 1.05; // Aumento del 5%
        } else if (edad >= 51 && edad <= 60) {
            salario *= 1.1; // Aumento del 10%
        } else {
            salario *= 1.15; // Aumento del 15%
        }
        System.out.println("Señor/a " + nombre + ", su salario actualizado es: $" + salario);
        
        scanner.close();
    }
}

