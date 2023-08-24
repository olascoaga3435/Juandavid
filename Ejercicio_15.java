/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de su compra: ");
        double montoCompra = scanner.nextDouble();
        
        if (montoCompra > 300) {
            double descuento = montoCompra * 0.20;
            double montoAPagar = montoCompra - descuento;
            
            System.out.println("Se aplica un descuento del 20%.");
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + montoAPagar);
        } else {
            System.out.println("No se aplica descuento. Total a pagar: $" + montoCompra);
        }
        
        scanner.close();
    }
}


