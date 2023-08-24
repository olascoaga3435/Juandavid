/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero % 8 == 0) {
            System.out.println(numero + " es múltiplo de 8.");
        } else {
            System.out.println(numero + " no es múltiplo de 8.");
        }
        
        scanner.close();
    }
}
