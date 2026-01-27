package ud3.strings.practicaex;

public class ContarVocales {
    public static int contarVocales(String frase) {
        if (frase == null || frase.length() == 0) {
            return 0;
        }
        int numVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                numVocales++;
            }
        }
        return numVocales;
    }
}
