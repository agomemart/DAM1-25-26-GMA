package ud3;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Random;

public class Util {

    public static String leerPassword() {
        Console cons = System.console();

        String passwd = new String(cons.readPassword());

        return passwd;
    }

    public static String invertirCadena(String str) {
        String cadenaInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            cadenaInvertida += str.charAt(i);
        }
        return cadenaInvertida;
    }

    public static int contarEspacios(String cad1) {
        int n = cad1.length();
        String cad2 = cad1.replaceAll(" ", "");
        int n2 = cad2.length();
        return n - n2;
    }

    public static boolean esVocal(char ch) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";

        boolean esVocal = false;

        for (int i = 0; i < vocales.length(); i++) {
            if (ch == vocales.charAt(i))
                esVocal = true;
        }

        return esVocal;
    }

    public static String sinVocales(String cad) {
        String sinVocales = "";

        for (int i = 0; i < cad.length(); i++) {
            char caracter = cad.charAt(i);
            if (!esVocal(caracter))
                sinVocales += caracter;
        }

        return sinVocales;
    }

    public static boolean sonAnagrama(String palabra1, String palabra2) {
        if ((palabra1.length() != palabra2.length()) || (palabra1 == palabra2))
            return false;

        char[] palabraChar1 = palabra1.toLowerCase().toCharArray();
        char[] palabraChar2 = palabra2.toLowerCase().toCharArray();

        Arrays.sort(palabraChar1);
        Arrays.sort(palabraChar2);

        return Arrays.equals(palabraChar1, palabraChar2);
    }

    public static String generarAnagrama(String str) {
        char[] t = str.toCharArray();

        Random rnd = new Random();
        // Recorrer cada elemento
        for (int i = 0; i < t.length; i++) {
            // Genero una posición aleatoria
            int posRnd = rnd.nextInt(t.length);
            // Intercambio los valores de la posición actual y la aleatoria
            char aux = t[i];
            t[i] = t[posRnd];
            t[posRnd] = aux;
        }

        return String.valueOf(t);
    }

    /**
     * Crea un fichero de texto con el contenido de un String
     * 
     * @param str
     * @param filePath
     */
    public static void writeStringToFile(String str, String filePath) {
        try {
            // Creamos un objeto FileWriter que nos permitirá escribir en el fichero
            FileWriter writer = new FileWriter(filePath);

            // Escribimos el String en el fichero
            writer.write(str);

            // Cerramos el fichero
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lee y carga el contenido de un fichero de texto a un String
     * 
     * @param filePath
     * @return
     */
    public static String readFileToString(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);

            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);

            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                // Vamos añadiendo cada línea al StringBuilder
                fileContent.append(line);
                // Añadimos un salto de línea al final de cada línea
                fileContent.append("\n");
            }

            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero.");
            // e.printStackTrace();
        }

        // Devolvemos el contenido del fichero como un String
        return fileContent.toString();
    }

    /**
     * Lee y carga el contenido de un fichero de texto a un array de String (un
     * elemento por línea)
     * 
     * @param filePath
     * @return
     */
    public static String[] readFileToStringArray(String filePath) {
        String[] lineas = new String[0];

        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);

            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);

            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                lineas = Arrays.copyOf(lineas, lineas.length + 1);
                lineas[lineas.length - 1] = line;
            }

            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero o hay un problema con él.");
        }

        // Devolvemos el contenido del fichero como un String
        return lineas;
    }

    private static String getJson(String url) throws IOException, InterruptedException {
        // Configuración del proxy del sistema
        System.setProperty("java.net.useSystemProxies", "true");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        if (resp.statusCode() != 200) {
            System.err.println("Error HTTP: " + resp.statusCode());
            System.exit(1);
        }

        String json = resp.body();
        return json;
    }

}

