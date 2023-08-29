/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Tabla_multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}

