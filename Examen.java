public class Examen {
    public static void main(String[] args) {
        double calificacion1 = 10.0;
        double calificacion2 = 4.2;
        double calificacion3 = 2.1;
        double trabajo = 1.0;

        // Calcular la media de las calificaciones
        double media = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Sumar 1 punto por el trabajo
        double notaFinal = media + trabajo;

        System.out.println("Calificaciones del estudiante:");
        System.out.println("Calificación 1: " + calificacion1);
        System.out.println("Calificación 2: " + calificacion2);
        System.out.println("Calificación 3: " + calificacion3);
        System.out.println("Media: " + media);
        System.out.println("Trabajo: " + trabajo);
        System.out.println("Nota final: " + notaFinal);
    }
}
