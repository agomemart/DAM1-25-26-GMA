package ud3.matrices;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DiagonalesIguales {
    static boolean diagonalesIguales(int[][] t) {
        if (t == null || t.length == 0 || t.length != t[0].length) {
            return false;
        }

        boolean igualDirecto = true;
        boolean igualInverso = true;

        for (int i = 0; i < t.length; i++) {
            if (t[i][i] != t[i][t.length - 1 - i]) {
                igualDirecto = false;
            }
            if (t[i][i] != t[t.length - 1 - i][i]) {
                igualInverso = false;
            }
        }
        return igualDirecto || igualInverso;
    }

    int[][] t21 = {
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t22 = { { 1 } };
    int[][] t23 = {};
    int[][] t24 = null;
    int[][] t25 = {
            { 1, 2, 1 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t26 = {
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t27 = {
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 }
    };

    @Test
    public void testDiagonalesIgualesTrue() {
        assertTrue(diagonalesIguales(t21));
    }

    @Test
    public void testDiagonalesIgualesMatriz1() {
        assertTrue(diagonalesIguales(t22));
    }

    @Test
    public void testDiagonalesIgualesMatrizVacia() {
        assertFalse(diagonalesIguales(t23));
    }

    @Test
    public void testDiagonalesIgualesMatrizNull() {
        assertFalse(diagonalesIguales(t24));
    }

    @Test
    public void testDiagonalesIgualesFalse() {
        assertFalse(diagonalesIguales(t25));
    }

    @Test
    public void testDiagonalesIgualesVertical() {
        assertFalse(diagonalesIguales(t26));
    }
}
