package ud6.ficherostexto;
/**
 * @author Adrián Gómez
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el nombre del fichero: ");
        String nombreFichero = sc.nextLine();
        sc.close();

        try {
            BufferedReader in = new BufferedReader(new FileReader(nombreFichero));
            String contenido = in.readAllAsString();
            in.close();
            BufferedWriter out = new BufferedWriter(new FileWriter("copia_de_" + nombreFichero));
            out.write(contenido);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
