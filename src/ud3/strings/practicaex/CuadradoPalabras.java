package ud3.strings.practicaex;

import java.util.Arrays;

public class CuadradoPalabras {
    public static char[][] matrizCaracteres(String texto) {
        if (texto == null || texto.length() == 0) {
            return null;
        }

        int longArray = (int) Math.ceil(Math.sqrt(texto.length()));
        char[][] arrayPalabra = new char[longArray][longArray];
        int contCaracteres = 0;

        for (int i = 0; i < arrayPalabra.length; i++) {
            for (int j = 0; j < arrayPalabra[i].length; j++) {
                if (contCaracteres < texto.length()) {
                    arrayPalabra[i][j] = Character.toUpperCase(texto.charAt(contCaracteres));
                    contCaracteres++;
                } else {
                    arrayPalabra[i][j] = '*';
                }
            }
        }

        return arrayPalabra;
    }

    public static void main(String[] args) {
        char[][] t1 = matrizCaracteres("Javalandia");

        System.out.println(Arrays.deepToString(t1));
    }
}
