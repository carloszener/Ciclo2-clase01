import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        System.out.println("Introduce un numero entero ");
        var numero = sc.nextInt();
       
        var resultado = (numero%2 == 0) ? numero + " Es par" : numero + " Es impar";
        System.out.println(resultado);
        sc.close();  
    }
    
}
