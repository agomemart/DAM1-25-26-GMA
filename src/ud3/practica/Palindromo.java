package ud3.practica;

public class Palindromo {
    public static boolean esPalindromo(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return false;
        }

        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
