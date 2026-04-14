package ud3.practica;

public class ContarCeros {
    public static int contarCeros(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int contCeros = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] == 0) {
                    contCeros++;
                }
            }
        }

        return contCeros;
    }
}
