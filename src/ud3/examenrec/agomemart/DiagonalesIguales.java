package ud3.examenrec.agomemart;

/**
 * @author Adrián Gómez Martínez
 */
public class DiagonalesIguales {
    public static boolean diagonalesIguales(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }

        if (t.length != t[0].length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][i] != t[t.length - 1 - i][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
