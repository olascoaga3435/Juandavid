/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();
        
        String tipoClima = obtenerTipoClima(temperatura);
        
        System.out.println("El tipo de clima es: " + tipoClima);
        
        scanner.close();
    }
    public static String obtenerTipoClima(double temperatura) {
        if (temperatura <= 10) {
            return "Frio";
        } else if (temperatura <= 20) {
            return "Nublado";
        } else if (temperatura <= 30) {
            return "Caluroso";
        } else {
            return "Tropical";
        }
    }
}

