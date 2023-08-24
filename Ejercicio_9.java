/**
 *
 * @author José francisco
 */

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad, puede ingresar.");
        } else {
            System.out.println("Usted es menor de edad, no puede ingresar.");
        }
        
        scanner.close();
    }
}
