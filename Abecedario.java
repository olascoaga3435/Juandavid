/**
 *
 * @author Juan olascoaga
 */
public class Abecedario {
    public static void main(String[] args) {
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            if (letra != 'Ñ') {
                System.out.print(letra + " ");
            }
        }
    }
}

