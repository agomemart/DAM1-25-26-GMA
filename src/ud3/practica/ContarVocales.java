package ud3.practica;

public class ContarVocales {
    public static int contarVocales(String frase) {
        int contadorVocales = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                for (int j = 0; j < vocales.length; j++) {
                    if (vocales[j] == frase.charAt(i)) {
                        contadorVocales++;
                        break;
                    }
                }
            }
        }

        return contadorVocales;
    }
}
