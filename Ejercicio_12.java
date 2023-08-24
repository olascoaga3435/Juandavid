/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        if (esMultiplo(numero1, numero2)) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else if (esMultiplo(numero2, numero1)) {
            System.out.println(numero2 + " es múltiplo de " + numero1);
        } else {
            System.out.println("Estos números no son múltiplos entre sí.");
        }
        
        scanner.close();
    }
    
    public static boolean esMultiplo(int num1, int num2) {
        return num2 != 0 && num1 % num2 == 0;
    }
}
