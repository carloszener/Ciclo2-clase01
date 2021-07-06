import java.util.Random;
import java.util.Scanner;

public class EjerU1_05 {
   
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Introduzca un numero de 0 a 99: \f");
        var numero1 = sc.nextInt();
        sc.close();
        
        Random rnd = new Random();
        var numero2 = (int)(rnd.nextDouble() * 100 + 0);
        System.out.println(numero2);

        if (numero1 <= 99) {

              if (numero2 == numero1) {
                System.out.println("Adivinaste el numero");
              }  
              if (numero2 > numero1) {
                System.out.println("El numero es mayor ");
              }
              if (numero2 < numero1) {
                System.out.println("El numero es menor ");
              }
        }
        else {
            System.out.println("Numero no valido");
        }
    }
}
