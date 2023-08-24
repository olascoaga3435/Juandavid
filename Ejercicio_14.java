/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la hora: ");
        int hora = scanner.nextInt();
        
        System.out.print("Ingrese los minutos: ");
        int minutos = scanner.nextInt();
        
        System.out.print("Ingrese los segundos: ");
        int segundos = scanner.nextInt();
        
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            
        if (minutos == 60) {
                minutos = 0;
                hora++;
                
        if (hora == 24) {
                    hora = 0;
            }
          }
        }
        
        System.out.println("La hora exacta es: " + hora + ":" + minutos + ":" + segundos);
        
        scanner.close();
    }
}
