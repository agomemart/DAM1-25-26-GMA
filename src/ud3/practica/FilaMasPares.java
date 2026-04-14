package ud3.practica;

public class FilaMasPares {
    public static int filaMasPares(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int maxPares = -1;
        int indiceFila = 0;

        for (int i = 0; i < t.length; i++) {
            int contPares = 0;
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] % 2 == 0) {
                    contPares++;
                }
            }
            if (maxPares < contPares) {
                maxPares = contPares;
                indiceFila = i;
            }
        }

        return indiceFila;
    }
}
