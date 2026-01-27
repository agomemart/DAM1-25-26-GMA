package ud3.strings.practicaex;

public class ContarPalabras {
    public static int contarPalabrasEnMatriz(char[][] m) {
        if (m == null || m.length == 0) {
            return 0;
        }

        int contadorPalabra = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <= m[i].length - 3; j++) {
                if (m[i][j] == 'D' &&
                        m[i][j + 1] == 'A' &&
                        m[i][j + 2] == 'M') {
                    contadorPalabra++;
                }
            }
        }

        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length - 3; i++) {
                if (m[i][j] == 'D' &&
                        m[i + 1][j] == 'A' &&
                        m[i + 2][j] == 'M') {
                    contadorPalabra++;
                }
            }
        }

        return contadorPalabra;
    }
}
