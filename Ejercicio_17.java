/**
 *
 * @author José francisco
 */
import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entre 1 y 12: ");
        int mes = scanner.nextInt();
        
        if (mes >= 1 && mes <= 12) {
            int dias = obtenerDiasPorMes(mes);
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        } else {
            System.out.println("El número ingresado no corresponde a un mes válido.");
        }
        scanner.close();
    }
    public static int obtenerDiasPorMes(int mes) {
        int dias;
        
        switch (mes) { 
            case 2:
                dias = 28; // Febrero tiene 28 días (29 en años bisiestos)
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30; // Abril, junio, septiembre y noviembre tienen 30 días
                break;
            default:
                dias = 31; // Los demás meses tienen 31 días
                break;
        }
        return dias;
    }
}

