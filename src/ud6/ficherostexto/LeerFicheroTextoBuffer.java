package ud6.ficherostexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTextoBuffer {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("DATOS - Alumnos.csv"));
            String contenido = in.readAllAsString();

            in.close();

            System.out.println(contenido);

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        }
    }
}