/**
 *
 * @author Juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota : ");
        double nota = scanner.nextDouble();
        
        String clasificacion = clasificarNota(nota);
        
        System.out.println("Clasificación: " + clasificacion);
        
        scanner.close();
    }
    public static String clasificarNota(double nota) {
        if (nota < 0 || nota > 10) {
            return "La nota debe ser de 0-10";
        } else if (nota < 4) {
            return "Insuficiente";
        } else if (nota < 6) {
            return "Suficiente";
        } else if (nota < 8) {
            return "Bien";
        } else if (nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}

