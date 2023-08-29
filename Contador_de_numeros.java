/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Contador_de_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Pares = 0;
        int Negativos = 0;
        int Ceros = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                Pares++;
            }
            if (numero < 0) {
                Negativos++;
            }
            if (numero == 0) {
                Ceros++;
            }
        }
        System.out.println("Cantidad de números pares: " + Pares);
        System.out.println("Cantidad de números negativos: " + Negativos);
        System.out.println("Cantidad de ceros: " + Ceros);

        scanner.close();
    }
}

