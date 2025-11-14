package ud2.gmaexamen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Adrián Gómez Martínez
 */
public class MinutosTranscurridos {
    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {
        int minutosTranscurridos = 0;
        int horasDiferencia = 0;
        int minutosDiferencia = 0;
        boolean horaAValida = horaA >= 0 && horaA <= 23;
        boolean horaBValida = horaB >= 0 && horaB <= 23;
        boolean minutoAValido = minutoA >= 0 && minutoA <= 59;
        boolean minutoBValido = minutoB >= 0 && minutoB <= 59;
        if (horaAValida && horaBValida && minutoAValido && minutoBValido) {
            if (horaA > horaB) {
                horasDiferencia = horaA - horaB;
                minutosDiferencia += (minutoA - minutoB);
            } else if (horaA < horaB) {
                horasDiferencia = horaB - horaA;
                minutosDiferencia += (minutoB - minutoA);
            } else {
                if (minutoA > minutoB) {
                    minutosTranscurridos = minutoA - minutoB;
                } else {
                    minutosTranscurridos = minutoB - minutoA;
                }
            }
            minutosTranscurridos = minutosDiferencia + horasDiferencia * 60;
        } else {
            return -1;
        }

        return minutosTranscurridos;
    }

    @Test
    public void testMinutosTranscurridos() {
        assertEquals(-1, minutosTranscurridos(24, 10, 10, 20));
        assertEquals(-1, minutosTranscurridos(10, 60, 10, 20));
        assertEquals(-1, minutosTranscurridos(10, 10, 24, 20));
        assertEquals(-1, minutosTranscurridos(10, 10, 10, 60));
        assertEquals(190, minutosTranscurridos(13, 20, 10, 10));
        assertEquals(170, minutosTranscurridos(13, 10, 10, 20));
        assertEquals(190, minutosTranscurridos(10, 10, 13, 20));
        assertEquals(170, minutosTranscurridos(10, 20, 13, 10));
        assertEquals(70, minutosTranscurridos(11, 20, 10, 10));
        assertEquals(50, minutosTranscurridos(11, 10, 10, 20));
        assertEquals(70, minutosTranscurridos(10, 10, 11, 20));
        assertEquals(50, minutosTranscurridos(10, 20, 11, 10));
        assertEquals(0, minutosTranscurridos(10, 10, 10, 10));
        assertEquals(10, minutosTranscurridos(10, 20, 10, 10));
        assertEquals(10, minutosTranscurridos(10, 10, 10, 20));

        assert minutosTranscurridos(10, 30, 11, 0) == 30;
        assert minutosTranscurridos(12, 0, 12, 0) == 0;
        assert minutosTranscurridos(5, 15, 4, 45) == 30;
        assert minutosTranscurridos(25, 0, 10, 0) == -1; // Invalid hour
        assert minutosTranscurridos(10, 60, 11, 0) == -1; // Invalid minute
    }
}
