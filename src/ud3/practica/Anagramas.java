package ud3.practica;

import java.util.Arrays;

public class Anagramas {
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1 == null || palabra2 == null || palabra1.isBlank() || palabra2.isBlank()) {
            return false;
        }

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] letrasP1 = palabra1.trim().toLowerCase().toCharArray();
        char[] letrasP2 = palabra2.trim().toLowerCase().toCharArray();
        Arrays.sort(letrasP1);
        Arrays.sort(letrasP2);

        return Arrays.equals(letrasP1, letrasP2);
    }

    public static void main(String[] args) {
        System.out.println(sonAnagramas("amor", "roma"));
    }
}
