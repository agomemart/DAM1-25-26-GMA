package ud3.practica;

public class PrimeraNoRepetida {
    public static char primeraNoRepetida(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            int contador = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    contador++;
                }
            }

            if (contador == 1) {
                return s.charAt(i);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(primeraNoRepetida("aabccdbe"));
    }
}
