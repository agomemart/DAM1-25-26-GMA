package ud3.practica;

public class SumaDiagonales {
    public static int sumaDiagonales(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        if (t.length != t[0].length) {
            return -1;
        }

        int sumaDiagPrinc = 0;
        int sumaDiagSec = 0;
        for (int i = 0; i < t.length; i++) {
            sumaDiagPrinc += t[i][i];
            sumaDiagSec += t[i][t.length - 1 - i];
        }

        return sumaDiagPrinc + sumaDiagSec;
    }
}
