import java.util.Scanner;

public class Par_o_Impar {
   public static void main(String[]args){
       Scanner scanner=new Scanner(System.in);
      
       System.out.println("Este programa muestra los numero pares e impares");
        for (int i=0;i<=10;i++){
        System.out.println("Digite un numero entre el 1 y el 10: ");
        i=scanner.nextInt();
        
        if(i%2==0){
           System.out.println("El numero " + i + " es par");
        } else if((i)%2!=0){
            System.out.println("El numero " + i + " es impar");
        }
        }
        scanner.close();
       }
   }

        
        
   
        

        
   


       
               
     
                   
                       