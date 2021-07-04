import java.util.Scanner;

public class EjerU1_02 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la primera nota del alumno: ");
        double Nota1 = sc.nextDouble();

        System.out.println("Ingrese la segunda nota del alumno: ");
        double Nota2 = sc.nextDouble();  
        
        System.out.println("Ingrese la tercera nota del alumno: ");
        double Nota3 = sc.nextDouble();
        sc.close();

        double promedio = (Nota1 + Nota2 + Nota3)/3;
        
        if (promedio >= 3.0) {
            System.out.println("Felicitaciones " + nombre + " HAS APROBADO");
        } else {
            System.out.println("Lo siento " + nombre + " HAS REPROBADO");
        }
    }
        
}

