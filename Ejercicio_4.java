/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int contador = contarCifras(numero);
        
        System.out.println("Este número tiene " + contador + " cifras.");
        
        scanner.close();
    }
    // Si el número es 0, tiene una sola cifra
    public static int contarCifras(int numero) {
        if (numero == 0) {
            return 1; 
        }
        
   // se utiliza para contar la cantidad de cifras en un número entero.
        int contador = 0;
        while (numero != 0) {
            numero /= 10; 
            contador++;
        }
        //Devuelve el valor calculado
        return contador;
    }
}

