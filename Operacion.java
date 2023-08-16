
import java.util.Scanner;


/**
 *
 * @author JuanR
 */
public class Operacion {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner (System.in);
    
        
        int num1, num2 , resultado;
        int numero1, numero2, resta;
      int multi1, multi2, multi;
        
   System.out.println("ingrese el primer numero");
     num1 = teclado.nextInt();
     System.out.println("ingrese el segundo numero");
     num2 = teclado.nextInt();
     System.out.println("ingrese el primer numero de la division");
     numero1 = teclado.nextInt();
     System.out.println("ingrese el segundo numero de la division");
     numero2 = teclado.nextInt();
     System.out.println("ingrese el primer numero de la multiplicacion");
  System.out.println("");
  multi1 = teclado.nextInt();
  System.out.println("ingrese el segundo numero");
  multi2 = teclado.nextInt();
  
  
     //proceso
     
     
     resultado = num1 + num2;
    resta = numero1 / numero2;
   multi = multi1 * multi2;
      
     //mostrar
     System.out.println("el resultado es :" + resultado);
     System.out.println("el resultado de la division es:" + resta);
   System.out.println("el resultado de la multiplicacion es:" + multi);
     
    }
}

