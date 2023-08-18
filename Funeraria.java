/**
 *
 * @author JUAN OLASCOAGA
 */import java.util.Scanner;

public class Fiebre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("INGRESE TEMPERATURA: ");
        double temperatura = teclado.nextDouble();
        
        if (temperatura <= 35) {
            System.out.println("esta bien.");
        } else if (temperatura >= 36 && temperatura <= 39) {
            System.out.println("valla al medico.");
        } else if (temperatura >= 40) {
            System.out.println("pague funeraria.");
        } else {
            System.out.println("Valor de temperatura no válido.");
        }
        
    }
}
