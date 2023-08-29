/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Orden_de_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números en el orden especificado son:");

        System.out.println("El primero: " + numeros[0]);
        System.out.println("El último: " + numeros[9]);
        System.out.println("El segundo: " + numeros[1]);
        System.out.println("El penúltimo: " + numeros[8]);
        System.out.println("El tercero: " + numeros[2]);
    }
}


