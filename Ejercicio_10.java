/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);
        
        if (Character.isUpperCase(letra)) {
            System.out.println("Esta letra está en mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("Esta letra está en minúscula.");
        } else {
            System.out.println("No es una letra válida.");
        }
        
        scanner.close();
    }
}
