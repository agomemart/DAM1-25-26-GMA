package ud6.ficherostexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class E1004 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("NumerosReales.txt"));
            String contenido = in.readAllAsString();
            in.close();
            String[] numeros = contenido.split("\\s+");
            List<Double> listaNumeros = new ArrayList<>();
            for (int i = 0; i < numeros.length; i++) {
                listaNumeros.add(Double.parseDouble(numeros[i]));
            }
            double suma = 0;
            for (Double n : listaNumeros) {
                suma += n;
            }
            double media = suma / listaNumeros.size();

            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
            

        } catch (FileNotFoundException e) {
            System.out.println("El arhivo no existe.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        }
    }
}
