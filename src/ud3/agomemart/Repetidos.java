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

        int[] repetidos = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            int numRepetido = 0;
            for (int j = 0; j < t.length; j++) {
                if (t[i] == t[j]) {
                    numRepetido = t[i];
                }
            }
            repetidos[i] = numRepetido;
        }

        Arrays.sort(repetidos);

        return repetidos;
    }

    public static void main(String[] args) {
        int[] num = { 1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 2, 6 };

        System.out.println(Arrays.toString(repetidos(num)));
    }
}
