package ud3.arrays.practicaex;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class EliminarDuplicados {
    static int[] eliminarDuplicados(int[] t) {
        if (t == null || t.length == 0) {
            return null;
        }
        int[] aux = new int[t.length];
        int contador = 0;

        for (int i = 0; i < t.length; i++) {
            boolean existe = false;

            for (int j = 0; j < contador; j++) {
                if (t[i] == aux[j]) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                aux[contador] = t[i];
                contador++;
            }
        }

        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = aux[i];
        }

        return resultado;
    }

    @Test
    void testNull() {
        assertNull(EliminarDuplicados.eliminarDuplicados(null));
    }

    @Test
    void testEmpty() {
        assertNull(EliminarDuplicados.eliminarDuplicados(new int[]{}));
    }

    @Test
    void testNoDuplicates() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, EliminarDuplicados.eliminarDuplicados(input));
    }

    @Test
    void testWithDuplicates() {
        int[] input = {1, 2, 2, 3, 1};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, EliminarDuplicados.eliminarDuplicados(input));
    }

    @Test
    void testAllSame() {
        int[] input = {5, 5, 5, 5};
        int[] expected = {5};
        assertArrayEquals(expected, EliminarDuplicados.eliminarDuplicados(input));
    }

    @Test
    void testNegativeNumbers() {
        int[] input = {-1, -2, -2, -1, 0};
        int[] expected = {-1, -2, 0};
        assertArrayEquals(expected, EliminarDuplicados.eliminarDuplicados(input));
    }

    @Test
    void testLargeArray() {
        int[] input = new int[1000];
        for (int i = 0; i < input.length; i++) {
            input[i] = i % 10; // repetidos de 0 a 9
        }
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, EliminarDuplicados.eliminarDuplicados(input));
    }
}
