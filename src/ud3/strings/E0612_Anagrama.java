package ud3.strings;

import java.util.Arrays;

public class E0612_Anagrama {
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        boolean sonAnagramas = true;

        if (palabra1.isEmpty() || palabra2.isEmpty()) {
            sonAnagramas = false;
        } else if (palabra1.length() != palabra2.length() || palabra1.equalsIgnoreCase(palabra2)) {
            sonAnagramas = false;
        } else {
            char[] arrayPalabra1 = palabra1.toLowerCase().toCharArray();
            char[] arrayPalabra2 = palabra2.toLowerCase().toCharArray();
            Arrays.sort(arrayPalabra1);
            Arrays.sort(arrayPalabra2);
            
            if (!Arrays.equals(arrayPalabra1, arrayPalabra2)) {
                sonAnagramas = false;
            }
        }

        return sonAnagramas;
    }

    public static void main(String[] args) {
        System.out.println(sonAnagramas("Dana", "nada"));
        System.out.println(sonAnagramas("roma", "mora"));
    }
}
