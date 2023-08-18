import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usuarioCorrecto = "Jose";
        String contrasenaCorrecta = "12345";
        
        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();
        
        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scanner.nextLine();
        
        if (usuarioCorrecto.equals(usuarioIngresado) && contrasenaCorrecta.equals(contrasenaIngresada)) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Usuario y/o contraseña invalido.");
        }
        
       
    }
}
