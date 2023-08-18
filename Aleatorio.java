import java.util.Random;

public class Numero_Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Genera un número entero aleatorio
        int numeroAleatorio = random.nextInt();  

        System.out.println("Número aleatorio: " + numeroAleatorio);
    }
}
