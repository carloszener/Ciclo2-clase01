import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su fecha de naciemiento (dd/mm/aaaa)");
        String fn = sc.nextLine();
        String[] fn1 = fn.split("/"); 
        sc.close();
        int dia = Integer.parseInt(fn1[0]);
        System.out.println(dia);
        int mes = Integer.parseInt(fn1[1]);
        System.out.println(mes);
        int año = Integer.parseInt(fn1[2]);
        System.out.println(año);
        int suma = dia + mes + año; 
        System.out.println(suma); 

        var res = 0;
        while(suma > 0) {

            res = res + suma % 10; 
            suma /= 10;             
        }
        System.out.println("Su numero de la suerte es: " + res);
    }
}