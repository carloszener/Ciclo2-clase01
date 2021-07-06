import java.util.Scanner;

public class EjerU1_04 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Introduzca un numero de 0 a 10: \f");
        int numero = sc.nextInt();
        sc.close();

        if (numero <= 10) {
        
            System.out.println("\fLa tabla de multiplicar de " + numero + " es: \f");

            for (int i = 0; i <= 10; i++) {

                System.out.println(i + " x " + numero + " = " + i*numero);
        }  
        
        }   else {
            System.out.println("\fNumero no valido\f");
        }
          
    }

}
    

