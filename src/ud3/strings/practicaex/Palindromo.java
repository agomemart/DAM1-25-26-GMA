package ud3.strings.practicaex;

public class Palindromo {
    static boolean esPalindromo(String palabra) {
        if (palabra == null || palabra.length() == 0) {
            return false;
        }

        int i = 0;
        int j = palabra.length() - 1;

        while (i < j) {
            if (Character.toLowerCase(palabra.charAt(i)) != Character.toLowerCase(palabra.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esPalindromo("radar"));
    }
}
