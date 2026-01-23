package ud3.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ContarPicos {
    static int contarPicos(int[] alturas) {
        if (alturas == null || alturas.length == 0) {
            return 0;
        }
        int contadorPicos = 0;
        for (int i = 0; i < alturas.length; i++) {
            int izquierda = alturas[(i - 1 + alturas.length) % alturas.length];
            int derecha = alturas[(i + 1) % alturas.length];

            if (alturas[i] > izquierda && alturas[i] > derecha) {
                contadorPicos++;
            }
        }

        return contadorPicos;
    }

    @Test
    void testContarPicos_CasoBase() {
        int[] alturas = { 1, 2, 3, 2, 1 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MultiplesPicos() {
        int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
        assertEquals(2, contarPicos(alturas));
    }

    @Test
    void testContarPicos_PicoAlFinal() {
        int[] alturas = { 1, 2, 3, 4, 5 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_PicoEnInicio() {
        int[] alturas = { 5, 4, 3, 2, 3, 4, 4 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MontañaCircularSinPicos() {
        int[] alturas = { 3, 2, 1, 2, 3 };
        assertEquals(0, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MontañaCircularConVariosPicos() {
        int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };
        assertEquals(2, contarPicos(alturas));
    }
}
