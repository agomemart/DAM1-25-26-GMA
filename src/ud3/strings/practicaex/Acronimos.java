package ud3.strings.practicaex;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Acronimos {
    static String acronimo(String frase) {
        if (frase == null || frase.length() == 0) {
            return null;
        }

        String[] palabras = frase.split(" ");
        String acronimo = "";

        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty() && Character.isUpperCase(palabras[i].charAt(0))) {
                acronimo += palabras[i].charAt(0);
            }
        }

        return acronimo;
    }

    @Test
    void devuelveNullSiStringEsNull() {
        assertNull(acronimo(null));
    }

    @Test
    void devuelveNullSiStringEstaVacio() {
        assertNull(acronimo(""));
    }

    @Test
    void devuelveUnaLetraSiSoloHayUnaPalabraEnMayuscula() {
        assertEquals("H", acronimo("Hola"));
    }

    @Test
    void devuelveAcronimoCorrectoConVariasPalabras() {
        assertEquals("ONU", acronimo("Organizacion Naciones Unidas"));
    }

    @Test
    void soloCuentaPalabrasQueEmpiezanEnMayuscula() {
        assertEquals("PC", acronimo("Personal Computer"));
    }

    @Test
    void ignoraPalabrasCompletamenteEnMinusculas() {
        assertEquals("IA", acronimo("Inteligencia artificial Avanzada"));
    }

    @Test
    void funcionaConUnaSolaPalabraEnMinuscula() {
        assertEquals("", acronimo("hola"));
    }

    @Test
    void funcionaConFraseMixta() {
        assertEquals("UCM", acronimo("Universidad Complutense de Madrid"));
    }
}
