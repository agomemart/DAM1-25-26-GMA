package ud3.practica;

import java.util.Arrays;
import java.util.Random;

public class GenerarMatrizAleatoria {
    static int[][] generarMatrizAleatoria(int min, int max, int tamanoAncho, int tamanoLargo) {
        Random rnd = new Random();
        int[][] matrizAleatoria = new int[tamanoAncho][tamanoLargo];

        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                matrizAleatoria[i][j] = rnd.nextInt(min, max + 1);
            }
        }

        return matrizAleatoria;
    }

    public static void main(String[] args) {
        int[][] t = generarMatrizAleatoria(1, 10, 5, 5);
        System.out.println(Arrays.deepToString(t));
    }
}
