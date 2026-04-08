package ud3.practica;

public class InvertirPalabras {
    public static String invertirPalabras(String frase) {
        if (frase == null || frase.isEmpty()) {
            return "";
        }
        String[] palabras = frase.split(" ");
        String res = "";

        for (int i = palabras.length - 1; i >= 0; i--) {
            res += palabras[i];
            if (i != 0) {
                res += " ";
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(invertirPalabras("hola mundo"));
    }
}
