package ud3.practica;

import java.util.Arrays;

public class Anagramas {
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1 == null || palabra2 == null || palabra1.isEmpty() || palabra2.isEmpty()) {
            return false;
        }

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] arrayPalabra1 = palabra1.toLowerCase().toCharArray();
        char[] arrayPalabra2 = palabra2.toLowerCase().toCharArray();
        Arrays.sort(arrayPalabra1);
        Arrays.sort(arrayPalabra2);

        if (Arrays.equals(arrayPalabra1, arrayPalabra2)) {
            return true;
        }

        return false;
    }
}
