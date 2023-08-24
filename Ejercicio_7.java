/**
 *
 * @author juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();
        
        int mayor = encontrarMayor(numero1, numero2, numero3);
        
        System.out.println("El número mayor es: " + mayor);
        
        scanner.close();
    }
    public static int encontrarMayor(int a, int b, int c) {
        int max = a;
        
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
