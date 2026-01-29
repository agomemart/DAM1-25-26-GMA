package ud3.strings.practicaex;

public class ContarPalabrasLargas {
    public static int contarPalabrasLargas(String frase, int n) {
        if (frase == null || frase.length() == 0) {
            return 0;
        }

        String[] palabras = frase.split(" ");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= n) {
                contador++;
            }
        }

        return contador;
    }
}
