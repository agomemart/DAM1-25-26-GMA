package ud3.arrays.practicaex;

public class SumarDiagonalSecundaria {
    static int sumarDiagonalSecundaria(int[][] t) {
        if (t == null || t.length == 0) {
            return 0;
        }

        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < t.length; i++) {
            sumaDiagonalSecundaria += t[i][t.length - 1 - i];
        }

        return sumaDiagonalSecundaria;
    }
}
