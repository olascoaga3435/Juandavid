/**
 *
 * @author José francisco
 */
public class Dibujo_de_cuadrado {
    public static void main(String[] args) {
        int lado = 5; // Cambia el valor de 'lado' para ajustar el tamaño del cuadrado
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

