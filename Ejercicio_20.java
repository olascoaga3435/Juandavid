/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();
        
        if (esTriangulo(lado1, lado2, lado3)) {
            String tipo = obtenerTipoTriangulo(lado1, lado2, lado3);
            System.out.println("El triángulo es de tipo " + tipo);
        } else {
            System.out.println("Las longitudes ingresadas no forman un triángulo válido.");
        }
        scanner.close();
    }
    // el método devolverá un valor de tipo booleano
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2;
    }
    public static String obtenerTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}
