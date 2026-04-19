package ud3.examenrec.agomemart;

/**
 * @author Adrián Gómez Martínez
 */

public class Sumas {
    public static int[] sumas(int t[]) {
        if (t == null || t.length == 0) {
            return null;
        }

        int[] resultado = new int[3];
        for (int i = 0; i < t.length; i++) {
            resultado[0] += t[i];
            if (t[i] % 2 == 0) {
                resultado[1] += t[i];
            } else {
                resultado[2] += t[i];
            }
        }

        return resultado;
    }
}
