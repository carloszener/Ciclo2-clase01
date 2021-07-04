import java.util.Scanner;

public class EjerU1_03 {
    
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de horas trabajadas: ");
        int numero = sc.nextInt();
        int horas = 30000; 
        int resultado = numero * horas;

        System.out.println("El pago por las horas es " + resultado);
        sc.close();

    }
}
