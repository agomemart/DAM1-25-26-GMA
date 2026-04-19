package ud3.examenrec.agomemart;

/**
 * @author Adrián Gómez Martínez
 */
public class PalabrasEncadenadas {
    public static boolean letraValida(char c) {
        String letrasValidas = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < letrasValidas.length(); i++) {
            if (c == letrasValidas.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    public static boolean sonPalabrasEncadenadas(String palabras) {
        if (palabras == null || palabras.isEmpty()) {
            return false;
        }

        String[] arrayPalabras = palabras.split("\\s+");
        if (arrayPalabras.length < 1 || arrayPalabras.length > 50) {
            return false;
        }

        for (int i = 0; i < arrayPalabras.length; i++) {
            if (arrayPalabras[i].length() < 2 || arrayPalabras[i].length() > 24) {
                return false;
            }
            for (int j = 0; j < arrayPalabras[i].length(); j++) {
                if (!letraValida(arrayPalabras[i].charAt(j))) {
                    return false;
                }
            }
        }

        for (int i = 1; i < arrayPalabras.length; i++) {
            String palabraActual = arrayPalabras[i];
            String palabraAnterior = arrayPalabras[i - 1];

            if (!palabraActual.substring(0, 2)
                    .equals(palabraAnterior.substring(palabraAnterior.length() - 2, palabraAnterior.length()))) {
                return false;
            }
        }
        return true;
    }
}
