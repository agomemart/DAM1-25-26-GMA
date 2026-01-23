package ud3.strings.practicaex;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalabraMasLarga {
    static String palabraMasLarga(String frase) {
        if (frase == null || frase.length() == 0) {
            return null;
        }

        String[] palabras = frase.split(" ");
        String palabraMasLarga = null;

        for (int i = 0; i < palabras.length; i++) {
            if (palabraMasLarga == null || palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }

        return palabraMasLarga;
    }

    @Test
    void testNull() {
        assertNull(PalabraMasLarga.palabraMasLarga(null));
    }

    @Test
    void testEmptyString() {
        assertNull(PalabraMasLarga.palabraMasLarga(""));
    }

    @Test
    void testSingleWord() {
        assertEquals("hola", PalabraMasLarga.palabraMasLarga("hola"));
    }

    @Test
    void testMultipleWords() {
        assertEquals("programacion",
                PalabraMasLarga.palabraMasLarga("java programacion codigo"));
    }

    @Test
    void testWithTie() {
        // "java" y "ruby" tienen la misma longitud, debe devolver la primera
        assertEquals("java",
                PalabraMasLarga.palabraMasLarga("java ruby"));
    }

    @Test
    void testWithExtraSpaces() {
        assertEquals("programacion",
                PalabraMasLarga.palabraMasLarga("   java   programacion   codigo  "));
    }

    @Test
    void testWithSpecialCharacters() {
        assertEquals("hola!",
                PalabraMasLarga.palabraMasLarga("hola! adios"));
    }

    @Test
    void testWithNumbers() {
        assertEquals("abc123",
                PalabraMasLarga.palabraMasLarga("abc123 123"));
    }

    @Test
    void testOnlySpaces() {
        assertNull(PalabraMasLarga.palabraMasLarga("     "));
    }
}
