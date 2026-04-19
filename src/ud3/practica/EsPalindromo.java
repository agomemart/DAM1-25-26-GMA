package ud3.practica;

public class EsPalindromo {
    public static boolean esPalindromo(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        s = s.toLowerCase();
        s = s.replace(" ", "");
        
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("Anita lava la tina"));
    }
}
