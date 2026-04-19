package ud3.practica;

public class ElementoMasRepetido {
    public static int masRepetido(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int maxVeces = 0;
        int elemento = t[0][0];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                int cont = 0;

                for (int k = 0; k < t.length; k++) {
                    for (int k2 = 0; k2 < t[0].length; k2++) {
                        if (t[i][j] == t[k][k2]) {
                            cont++;
                        }
                    }
                }

                if (cont > maxVeces) {
                    maxVeces = cont;
                    elemento = t[i][j];
                }
            }
        }

        return elemento;
    }
}
