package ud3.practica;

public class CadenaBalanceada {
    public static boolean cadenaBalanceada(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        int contIguales = 0;
        int contDistintos = 0;
        char c = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                contIguales++;
            } else {
                contDistintos++;
            }
        }

        return contIguales == contDistintos;
    }
}
