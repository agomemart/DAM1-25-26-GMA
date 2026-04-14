package ud3.practica;

public class SoloDigitos {
    public static boolean soloDigitos(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(soloDigitos("12a45"));
    }
}
