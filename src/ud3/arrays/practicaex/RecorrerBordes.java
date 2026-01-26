package ud3.arrays.practicaex;

public class RecorrerBordes {
    static int sumaBordes(int[][] t) {
        if (t == null || t.length == 0) {
            return 0;
        }

        int suma = 0;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == 0 || i == t.length - 1 || j == 0 || j == t[i].length - 1) {
                    suma += t[i][j];
                }
                
            }
        }

        return suma;
    }
}
