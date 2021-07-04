import java.util.Scanner;

public class EjerU1_01 {

    public static void main(String[] args) {
        
        int numero1;
        int numero2;

        Scanner x = new Scanner(System.in);

        System.out.println("Digite el primer número: ");
        numero1 = x.nextInt();

        System.out.println("Digite el segundo número: ");
        numero2 = x.nextInt();
        x.close(); 

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es igual a " + resta);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es igual a " + multiplicacion);
        System.out.println("La division de " + numero1 + " y " + numero2 + " es igual a " + division);

    }
    
}
