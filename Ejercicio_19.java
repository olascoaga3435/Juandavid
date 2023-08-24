/**
 *
 * @author Jose francisco
 */
import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
        
        if (Character.isDigit(caracter)) {
            System.out.println("Este carácter es un dígito.");
        } else if (Character.isUpperCase(caracter)) {
            System.out.println("Este carácter es una letra mayúscula.");
        } else if (Character.isLowerCase(caracter)) {
            System.out.println("El carácter es una letra minúscula.");
        } else {
            System.out.println("Este carácter no es un dígito ni una letra.");
        }
        
        scanner.close();
    }
}

