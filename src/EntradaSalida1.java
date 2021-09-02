import java.io.*;

public class EntradaSalida1 {

    public static void main(String arg[]) {
        String línea=null;
        var entrada = new BufferedReader(new InputStreamReader(System.in));
        var salida = new PrintWriter(System.out, true);
        salida.println("\nEscribe el texto: ");
            try {
                línea = entrada.readLine();
            } catch (Exception e) {
                System.err.println(e);
            }
        salida.println("\nLa línea escrita es: ");
    salida.println(línea);
    }
}