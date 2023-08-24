/**
 *
 * @author juan olascoaga
 */
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        String diagnostico = obtenerDiagnostico(imc);

        System.out.println("Su IMC es: " + imc);
        System.out.println("Diagnóstico: " + diagnostico);

        scanner.close();
    }
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static String obtenerDiagnostico(double imc) {
        if (imc < 16) {
            return "Criterio de ingreso en hospital";
        } else if (imc >= 16 && imc < 17) {
            return "Infra peso";
        } else if (imc >= 17 && imc < 18) {
            return "Bajo peso";
        } else if (imc >= 18 && imc < 25) {
            return "Peso normal (saludable)";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso (obesidad de grado I)";
        } else if (imc >= 30 && imc < 35) {
            return "Sobrepeso crónico (obesidad de grado II)";
        } else {
            return "Obesidad severa (grado III)";
        }
    }
}

