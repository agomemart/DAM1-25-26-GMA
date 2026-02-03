package ud3.agomemart;

/**
 * @author Adrián Gómez Martínez
 */
import java.util.Arrays;

public class Repetidos {
    static int[] repetidos(int t[]) {
        if (t == null) {
            return null;
        }
        if (t.length == 0) {
            return new int[0];
        }

        int[] tCopia = t.clone();
        Arrays.sort(tCopia);
        int[] repetidos = new int[0];
        int contRepetidos  = 0;

        for (int i = 1; i < tCopia.length; i++) {
            if (tCopia[i] == tCopia[i - 1]) {
                if (contRepetidos == 0 || repetidos[contRepetidos - 1] != tCopia[i]) {
                    repetidos = Arrays.copyOf(repetidos, repetidos.length + 1);
                    repetidos[contRepetidos] = tCopia[i];
                    contRepetidos++;
                }
            }
        }

        return repetidos;
    }

    public static void main(String[] args) {
        int[] num = { 1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 2, 6 };

        System.out.println(Arrays.toString(repetidos(num)));
    }
}
