package ud3.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Matriculas {
    static boolean esMatriculaValida(String matricula) {
        boolean esNumeroValido = false;
        boolean esLetraValida = false;

        if (matricula == null || matricula.length() != 7) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            if (Character.isDigit(matricula.charAt(i))) {
                esNumeroValido = true;
            } else {
                return false;
            }

        }

        for (int i = 4; i < matricula.length(); i++) {
            if (Character.isLetter(matricula.charAt(i))) {
                char c = Character.toUpperCase(matricula.charAt(i));
                String letrasValidas = "BCDFGHJKLMNPRSTVWXYZ";

                if (letrasValidas.indexOf(c) == -1) {
                    return false;
                }

                esLetraValida = true;
            } else {
                return false;
            }
        }

        if (esLetraValida && esNumeroValido) {
            return true;
        }

        return false;
    }

    static String siguienteMatricula(String matricula) {
        return null;
    }

    @Test
    void esMatriculaValidaTest() {
        assertFalse(esMatriculaValida(null));
        assertFalse(esMatriculaValida(""));

        assertTrue(esMatriculaValida("9876XYZ"));
        assertTrue(esMatriculaValida("5678XYZ"));
        assertTrue(esMatriculaValida("1234BBB"));
        assertTrue(esMatriculaValida("9999BBZ"));
        assertTrue(esMatriculaValida("9999BBD"));
        assertTrue(esMatriculaValida("9999ZZZ"));
        assertFalse(esMatriculaValida("1234ABC"));
        assertFalse(esMatriculaValida("1234AEI"));
        assertFalse(esMatriculaValida("ABCD123"));
        assertFalse(esMatriculaValida("1234ÑYZ"));
        assertFalse(esMatriculaValida("123"));
        assertFalse(esMatriculaValida("1234BBBB"));
        assertFalse(esMatriculaValida("12A4BBB"));
        assertFalse(esMatriculaValida("12.4BBB"));
        assertFalse(esMatriculaValida("1234BAB"));
        assertFalse(esMatriculaValida("1234BB."));
        assertFalse(esMatriculaValida("1234B5B"));
        assertFalse(esMatriculaValida("1234BúB"));
        assertFalse(esMatriculaValida("1234BÚB"));
        assertFalse(esMatriculaValida("1234BñB"));
        assertTrue(esMatriculaValida("1234BbB"));
    }

    @Test
    void siguienteMatriculaTest() {
        assertEquals(siguienteMatricula(""), null);
        assertEquals(siguienteMatricula(null), null);
        assertEquals(siguienteMatricula("1234BBB"), "1235BBB");
        assertEquals(siguienteMatricula("9999BBZ"), "0000BCB");
        assertEquals(siguienteMatricula("9999BBD"), "0000BBF");
        assertEquals(siguienteMatricula("9999ZZZ"), "0000BBB");
    }

}
