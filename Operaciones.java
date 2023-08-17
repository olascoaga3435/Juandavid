
import java.util.Scanner;


/**
 *
 * @author ESTUDIANTES
 */
public class Operaciones {
    public static void main(String[] args) {
        
        
        
      // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario ingresar las calificaciones
        System.out.print("Ingrese la calificación 1: ");
        double calificacion1 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación 2: ");
        double calificacion2 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación 3: ");
        double calificacion3 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación 4: ");
        double calificacion4 = scanner.nextDouble();
        
        // suma de las calificaciones
        double sumaCalificaciones = calificacion1 + calificacion2 + calificacion3 + calificacion4;
        
        // promedio de las calificaciones
        double promedioCalificaciones = sumaCalificaciones / 4;
        
        // Imprimir la suma y el promedio
        System.out.println("Calificación 1: " + calificacion1);
        System.out.println("Calificación 2: " + calificacion2);
        System.out.println("Calificación 3: " + calificacion3);
        System.out.println("Calificación 4: " + calificacion4);
        System.out.println("Suma de calificaciones: " + sumaCalificaciones);
        System.out.println("Promedio de calificaciones: " + promedioCalificaciones);
    }
       
       
    }
}
