package ud3.practica;

public class Capitalizar {
    public static String capitalizar(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String[] palabras = s.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = "";
            for (int j = 0; j < palabras[i].length(); j++) {
                if (j == 0) {
                    palabra += Character.toUpperCase(palabras[i].charAt(0));
                } else {
                    palabra += palabras[i].charAt(j);
                }
            }
            palabras[i] = palabra;
        }

        String res = "";
        for (int i = 0; i < palabras.length; i++) {
            if (i == palabras.length - 1) {
                res += palabras[i];
            } else {
                res += palabras[i] + " ";
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(capitalizar("hola mundo"));
    }
}
