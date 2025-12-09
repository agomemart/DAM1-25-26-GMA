package ud3.arrays;

/**
 * @author Adrián Gómez
 */

public class Sumas {
    static int[] sumas(int t[]) {
        if (t == null || t.length == 0) {
            return null;
        }

        int[] resultado = new int[3];
        int sumaElementos = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i < t.length; i++) {
            sumaElementos += t[i];
            if (t[i] > 0) {
                sumaPositivos += t[i];
            } else {
                sumaNegativos += t[i];
            }
        }

        resultado[0] = sumaElementos;
        resultado[1] = sumaPositivos;
        resultado[2] = sumaNegativos;

        return resultado;
    }
}
