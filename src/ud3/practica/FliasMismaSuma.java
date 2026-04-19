package ud3.practica;

public class FliasMismaSuma {
    public static boolean filasMismaSuma(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }

        int[] sumaFilas = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma += t[i][j];
            }
            sumaFilas[i] = suma;
        }

        for (int i = 0; i < sumaFilas.length; i++) {
            if (sumaFilas[0] != sumaFilas[i]) {
                return false;
            }
        }

        return true;
    }
}
