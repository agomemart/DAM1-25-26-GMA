package ud3.strings.practicaex;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EliminarVocales {
    static String eliminarVocales(String palabra) {
        if (palabra == null) {
            return null;
        }

        if (palabra.length() == 0) {
            return "";
        }

        String resultado = "";

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            char cLower = Character.toLowerCase(c);

            if (cLower != 'a' && cLower != 'e' && cLower != 'i'
                && cLower != 'o' && cLower != 'u') {
                resultado += c;
            }
        }

        return resultado;
    }

    @Test
    void testNull() {
        assertNull(EliminarVocales.eliminarVocales(null));
    }

    @Test
    void testEmptyString() {
        assertEquals("", EliminarVocales.eliminarVocales(""));
    }

    @Test
    void testOnlyVowels() {
        assertEquals("", EliminarVocales.eliminarVocales("aeiouAEIOU"));
    }

    @Test
    void testNoVowels() {
        assertEquals("bcdfg", EliminarVocales.eliminarVocales("bcdfg"));
    }

    @Test
    void testMixedString() {
        assertEquals("hll", EliminarVocales.eliminarVocales("hello"));
    }

    @Test
    void testWithSpaces() {
        assertEquals("Hl Mnd", EliminarVocales.eliminarVocales("Hola Mundo"));
    }

    @Test
    void testWithNumbers() {
        assertEquals("Hll123", EliminarVocales.eliminarVocales("Hello123"));
    }

    @Test
    void testWithSpecialCharacters() {
        assertEquals("H! Mnd?", EliminarVocales.eliminarVocales("Hi! Mundo?"));
    }

    @Test
    void testUpperCase() {
        assertEquals("BCDF", EliminarVocales.eliminarVocales("ABCDEFA"));
    }
}
