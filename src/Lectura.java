//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.io.IOException;

public class Lectura {
    
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Por favor introduzca un nombre:");
		String x = br.readLine();
		System.out.println("Hola " + x);

    }
}
