import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
    
        System.out.println("Introduce el numero de grados Celsius: ");
        var numero = sc.nextInt();

        var Fahrenheit = 32+(9*numero/5);

        System.out.println("El nummero de grados Fahrenheit es: " + Fahrenheit );
        sc.close();
    }
}
