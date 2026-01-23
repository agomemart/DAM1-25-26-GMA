package ud3.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Rango {
    static int rango(int t[]) {
        if (t == null || t.length < 2) {
            return 0;
        }

        int[] copiaT = Arrays.copyOf(t, t.length);
        Arrays.sort(copiaT);

        return Math.abs(copiaT[0] - copiaT[t.length - 1]);
    }

    @Test
    public void testRango() {
        int[] t = null;
        int[] t2 = {};
        int[] t3 = { 5 };
        int[] t4 = { 5, 8 };
        int[] t5 = { 4, 6, 2, 9, 10, -2 };
        assertEquals(0, rango(t3));
        assertEquals(3, rango(t4));
        assertEquals(12, rango(t5));
        assertEquals(0, rango(t));
        assertEquals(0, rango(t2));
        // NUEVOS TESTS
        int[] t6 = { -4, -6, -2, -9, -10, -2 };
        assertEquals(8, rango(t6));
    }

}
