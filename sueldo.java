public class sueldo {
    public static void main(String[] args) {
        double sueldoInicial = 1000000.0;  
        double gasto1 = 400000.0;
        double gasto2 = 215000.0;
        double gasto3 = 51000.0;

        double saldoFinal = sueldoInicial - (gasto1 + gasto2 + gasto3);

        System.out.println("Su saldo final es: " + saldoFinal + " pesos");
    }
}
