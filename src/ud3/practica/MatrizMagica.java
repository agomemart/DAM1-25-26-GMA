package ud3.practica;

public class MatrizMagica {
    public static boolean esMatrizMagica(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }

        if (t.length != t[0].length) {
            return false;
        }

        int[] sumaFilas = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < t[i].length; j++) {
                sumaFila += t[i][j];
            }
            sumaFilas[i] = sumaFila;
        }

        int[] sumaColumnas = new int[t[0].length];
        for (int j = 0; j < t[0].length; j++) {
            int sumaColumna = 0;

            for (int i = 0; i < t.length; i++) {
                sumaColumna += t[i][j];
            }
            sumaColumnas[j] = sumaColumna;
        }

        int referencia = sumaFilas[0];

        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;
        for (int i = 0; i < t.length; i++) {
             diagonalPrincipal += t[i][i];
             diagonalSecundaria += t[i][t.length - 1 - i];
        }

        if (diagonalPrincipal != diagonalSecundaria || diagonalPrincipal != referencia || diagonalSecundaria != referencia) {
            return false;
        }

        for (int i = 0; i < sumaColumnas.length; i++) {
            if (referencia != sumaColumnas[i] || referencia != sumaFilas[i]) {
                return false;
            }
        }

        return true;
    }
}
