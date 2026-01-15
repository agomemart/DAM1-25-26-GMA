package ud3.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0614_JuegoAnagrama {
    public static String generarAnagrama(String str) {
        Random rnd = new Random();

        char[] arrayPalabra = str.toCharArray();
        for (int i = 0; i < arrayPalabra.length; i++) {
            int indiceAleatorio = rnd.nextInt(arrayPalabra.length);
            char aux = arrayPalabra[i];
            arrayPalabra[i] = arrayPalabra[indiceAleatorio];
            arrayPalabra[indiceAleatorio] = aux;
        }

        return String.valueOf(arrayPalabra);
    }

    public static String[] readFileToString(String filePath) {
        String[] lineas = new String[0];
        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);

            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);

            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                lineas  = Arrays.copyOf(lineas, lineas.length + 1);
                lineas[lineas.length - 1] = line;
            }
            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero o hay un problema con el.");
            // e.printStackTrace();
        }

        // Devolvemos el contenido del fichero como un String
        return lineas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palabras = readFileToString("palabras.txt");

        Random rnd = new Random();
        String palabraOculta = palabras[rnd.nextInt(palabras.length)];
        String anagrama = generarAnagrama(palabraOculta);

        System.out.println("Adivina la palabra oculta!");
        System.out.print("Escribe la palabra oculta asociada a este anagrama \"" + anagrama + "\": ");
        String palabraUsuario = sc.nextLine();

        while (!palabraOculta.equalsIgnoreCase(palabraUsuario)) {
            System.out.print("Prueba otra vez: ");
            palabraUsuario = sc.nextLine();
        }
        sc.close();

        System.out.println("Enhorabueba!! Has acertado la palabra oculta.");
    }
}
